public class Main {
  public static void main(String[] args) {
    // This is the outline of the art picture //
    System.out.println("-------------------------------------");
    System.out.println("");
    drawPerson();
    System.out.println("   ↓");
    System.out.println("");
    drawTower();
    System.out.println("");
    drawSpider();
  }
  // Each static method is divided into smaller functions //
  public static void drawPerson() { // Ex: drawPerson has two functions: head and body //
    drawHead();
    drawBody();
  }
  public static void drawTower() {
    drawRoof();
    drawMiddle();
    drawBasement();
  }
  public static void drawSpider() {
    drawSBody();
  }
  // Here are the functions of a bigger static method in which there're small parts //
  // Less complex static methods are made out of print statements in which drawings are displayed //
  public static void drawHead() {
    System.out.println("((+_+))");
  }
  public static void drawBody() {
    System.out.println("   |");
    System.out.println("  \\/");
    System.out.println("   |");
    System.out.println("  /\\");
    System.out.println(" OMG!!!");
    System.out.println("");
  }
  public static void drawRoof() {
    System.out.println("   /\\");
    for(int x = 1; x <= 3; x++) {
      System.out.println("   <>");
    }
    System.out.println("  /^^\\");
    System.out.println(" /^^^^\\");
    System.out.println("/^^^^^^\\");
  }
  public static void drawMiddle() {
    // Loops 10 times to construct the body part of the building since the pieces are the same //
    for(int i = 1; i <= 10; i++) {
      System.out.println("|[][][]|");
    }
  }
  public static void drawBasement() {
    System.out.println("========");
    System.out.println("==========");
    System.out.println("|[      ]|");
    System.out.println("==========");
  }
  public static void drawSBody() {
    System.out.println("/    \\");
    System.out.println("\\ () /");
    System.out.println("/    \\");
    System.out.println("| V_V |");
    System.out.println("");
    System.out.println("I WILL DESTOROY THIS CITY(Muahhaha)");
  }
}
// Every function name was planned to be self-explanatory //