import java.util.ArrayList;
import java.util.List;

public class ToDoApp {
  List<Manipulations> manipulations;
  List<String> allToDos;

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
    if (args.length == 0) {
      printUsage();
    }
    for (Manipulations m : manipulations) {
      if (m.commandID.equals(args[0])) {
        m.execute();
      }
    }
  }
}
