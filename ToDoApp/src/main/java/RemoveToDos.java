import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveToDos extends Manipulations {

  public RemoveToDos() {
    super("-r", "Removes a ToDo", " Date");
  }

  @Override
  public <T> void execute(T input1, List<ToDo> input2) {
    String temp = input1.toString();
    int removeNUm = (Integer.parseInt(temp)) - 1;
      List<String> todoStr;
      try {
        todoStr = Files.readAllLines(Paths.get("data.txt"));
        todoStr.remove(removeNUm);
        Files.write(filePath, todoStr);
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
