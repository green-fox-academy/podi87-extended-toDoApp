import java.time.LocalDate;

public class ToDo {

  int ID;
  String content;
  LocalDate created;
  LocalDate updated;


  public ToDo(int ID, String content, LocalDate created, LocalDate updated) {
    this.ID = ID;
    this.content = content;
    this.created = created;
    this.updated = updated;
  }


  @Override
  public String toString() {
    return ID + ";" + content + ";" + created + ";" + updated;
  }

}
