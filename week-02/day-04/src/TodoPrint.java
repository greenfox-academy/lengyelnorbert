// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {

  public static void main(String... args) {
    String todoText = " - Buy milk\n";

    todoText = "My todo: \n" + todoText;
    todoText = todoText.concat(" - Download games\n ");
    todoText = todoText.concat("      - Diablo\n ");
    System.out.println(todoText);
  }
}