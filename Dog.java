class Dog {
  int size;
  String name;

  void bark(int barks) {
    if (size > 60) {
      while (barks > 0) {
        System.out.println("Woof! Woof!");
        barks = barks - 1;
      };
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }
  }

  String getName() {
    return "Bob";
  }
}

class DogTestDrive {

  public static void main (String[] args) {
    Dog one = new Dog();
    one.size = 70;
    one.name = one.getName();
    Dog two = new Dog();
    two.size = 8;
    Dog three = new Dog();
    three.size = 35;

    one.bark(3);
    System.out.println(one.name);
    two.bark(2);
    three.bark(1);
  }
}
