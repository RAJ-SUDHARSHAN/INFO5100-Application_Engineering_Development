class FirstClass {
  int x = 10;

  class FirstInnerClass {
    int y = 5;
  }

  class SecondInnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    FirstClass myFirstClass = new FirstClass();
    FirstClass.FirstInnerClass myFirstInnerClass = myFirstClass.new FirstInnerClass();
    System.out.println(myFirstInnerClass.y + myFirstClass.x);
  }
}
