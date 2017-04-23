import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class AddToDos extends Manipulations {

  public AddToDos() {
    super("-a", "Adds a new ToDo", " Date");

  }

  @Override
  public <T> void execute(T input1, List<ToDo> input2) {
    LocalDate localDateOfs  = LocalDate.now();
    List<String> todoStr;
    try {
      todoStr = Files.readAllLines(Paths.get("data.txt"));
      String id = Integer.toString(todoStr.size()+1);
      todoStr.add(id + ";" + "\"" + input1 + "\""+ ";" + "Created:" + localDateOfs.toString() + ";" + "Updated:" + localDateOfs.toString());
      Files.write(filePath, todoStr);
      for (String s : todoStr) {
        String[] stringArray = s.split(";");
        dateList.add(localDateOfs);
        input2.add(new ToDo((todoStr.indexOf(s) + 1), stringArray[1], localDateOfs, localDateOfs));
      }
    } catch (IOException e){
        e.getMessage();
      System.out.println("Please type your ToDo");
    } catch (IndexOutOfBoundsException e){
      e.getMessage();
    } catch (Exception e){
      e.getMessage();
    }
  }
}