
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListToDos extends Manipulations {

  public ListToDos() {
    super("-l", "Lists all ToDos", " Date");
  }

  @Override
  public void execute() {
    allToDo = new ArrayList<>();
    todoStr = new ArrayList<>();
    try {
      todoStr = Files.readAllLines(Paths.get("data.txt"));
    } catch (IOException e) {
      e.getMessage();
    }
    for (String s : todoStr) {
      String [] stringArray = s.split(";");
      LocalDate localDateOfs = LocalDate.parse(stringArray[2]);
      allToDo.add(new ToDo((todoStr.indexOf(s)), stringArray[0], localDateOfs, localDateOfs));
    }
    for (String str : todoStr) {
      System.out.println(str.replace(';', ' '));
    }
  }



  @Override
  public void execute(String input) {

  }
}
