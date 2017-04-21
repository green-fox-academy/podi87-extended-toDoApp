import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;


public abstract class Manipulations {

  String commandID;
  String usageDescription;
  String FILE_NAME = "data.txt";
  String date = " Date";
  Path filePath = Paths.get(FILE_NAME);
  List<ToDo> allToDo;
  List<String> todoStr;
  List<Integer> listID;
  List<LocalDate> dateList;


  public Manipulations(String commandID, String usageDescription, String date) {
    this.commandID = commandID;
    this.usageDescription = usageDescription;
    this.date = date;

  }

  public Manipulations() {
  }

  public abstract void execute();
  public abstract void execute(String input);


  public Path getFilePath() {
    return filePath;
  }

  public String getCommandID() {
    return commandID;
  }


  public String getUsageDescription() {
    return commandID + " - " + usageDescription;
  }

}
