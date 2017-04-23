
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListToDos extends Manipulations {

  public ListToDos() {
    super("-l", "Lists all ToDos", " Date");
  }

  @Override
  public <T> void execute(T input1, List<ToDo> input2) {
    List<String> todoStr = new ArrayList<>();
    try {
      todoStr = Files.readAllLines(Paths.get("data.txt"));
    } catch (IOException e) {
      e.getMessage();
    }
    if (todoStr.size() > 0) {
      for (String str : todoStr) {
        System.out.println(str.replace(';', ' '));
      }
    } else {
      System.out.println("There are no ToDos today!");
    }

  }


}
