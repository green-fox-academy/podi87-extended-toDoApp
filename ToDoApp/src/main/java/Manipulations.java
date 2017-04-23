import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Manipulations {

  String commandID;
  String usageDescription;
  String FILE_NAME = "data.txt";
  String date = " Date";
  Path filePath = Paths.get(FILE_NAME);
  List<LocalDate> dateList = new ArrayList<>();


  public Manipulations(String commandID, String usageDescription, String date) {
    this.commandID = commandID;
    this.usageDescription = usageDescription;
    this.date = date;

  }

  public Manipulations() {
  }

  public abstract <T> void execute(T input1, List<ToDo> input2);

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
