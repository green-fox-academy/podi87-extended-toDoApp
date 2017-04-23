import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

public class ToDoApp {
  List<Manipulations> manipulations;
  List<ToDo> allToDo = new ArrayList<>();

  public ToDoApp() {
    manipulations = new ArrayList<>();
    manipulations.add(new ListToDos());
    manipulations.add(new AddToDos());
    manipulations.add(new RemoveToDos());
    manipulations.add(new CompleteToDos());
    manipulations.add(new UpdateToDos());
  }

  public String printUsage() {
    String usage =  "\n" +"Java myTodo application\n" +
            "=======================\n" +
            "Command line arguments:\n";
    for (Manipulations temp : manipulations){
      usage += temp.getUsageDescription() + "\n";
    }
    return usage;
  }

  public void engine(String[] args) {
    try {
      if (args.length == 0) {
        System.out.println(printUsage());
      } else {
        for (Manipulations m : manipulations) {
          if (m.commandID.equals(args[0]) && args.length > 1) {
            m.execute(args[1], allToDo);
          } else if (m.commandID.equals(args[0])) {
            m.execute(args[0], allToDo);
          }
        }
      }
    } catch(IndexOutOfBoundsException e) {
      e.getMessage();
    }
  }
}
