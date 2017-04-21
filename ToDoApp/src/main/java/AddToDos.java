import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AddToDos extends Manipulations {

  public AddToDos() {
    super("-a", "Adds a new ToDo", " Date");

  }

  @Override
  public void execute() {

  }

  @Override
  public void execute(String input) {
    allToDo = new ArrayList<>();
    todoStr = new ArrayList<>();
    try {
      todoStr = Files.readAllLines(Paths.get("data.txt"));
      todoStr.add(input.replace(' ', ';'));
      for (String s : todoStr) {
        String[] stringArray = s.split(";");
        LocalDate localDateOfs = LocalDate.parse(stringArray[2]);
        allToDo.add(new ToDo((todoStr.indexOf(s)), stringArray[0], localDateOfs, localDateOfs));
      }
    } catch (IOException e){
        e.getMessage();

    }


  }

}