import java.util.ArrayList;
import java.util.Scanner;

public class Overview {

    public static void main(String[] args) {
        printing();
        variablesAndDataTypes();
        castingAndConverting();
        strings();
        numbers();
        // userInput(); // Commented out to avoid pausing during test runs
        arrays();
        twoDimensionalArrays();
        arrayListDemo();
        methodDemo();
        ifStatements();
        switchStatements();
        whileLoops();
        forLoops();
        exceptionCatching();
        classAndObjects();
        inheritanceDemo();
        abstractClassesAndMethods();
        interfaceInheritance();
    }

    public static void printing() {
        System.out.println("Hello");
        System.out.print("World");
        System.out.println("!");
    }

    public static void variablesAndDataTypes() {
        String name = "Mike";
        char testGrade = 'A';
        byte age0 = 0;
        short age1 = 10;
        int age2 = 20;
        long age3 = 30L;
        float gpa0 = 2.5f;
        double gpa1 = 3.5;
        boolean isTall = true;
        name = "John";
        System.out.println("Your name is " + name);
        System.out.printf("Your name is %s \n", name);
    }

    public static void castingAndConverting() {
        System.out.println((int) 3.14);
        System.out.println((double) 3);
        int intFromString = Integer.parseInt("50");
        double doubleFromString = Double.parseDouble("50.99");
        System.out.println(100 + intFromString);
        System.out.println(100 + doubleFromString);
    }

    public static void strings() {
        String greeting = "Hello";
        System.out.println(greeting.length());
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.indexOf("llo"));
        System.out.println(greeting.indexOf("z"));
        System.out.println(greeting.substring(2));
        System.out.println(greeting.substring(1, 3));
    }

    public static void numbers() {
        System.out.println(2 * 3);
        System.out.println(10 % 3);
        System.out.println(1 + 2 * 3);
        System.out.println(10 / 3.0);
        int num = 10;
        num += 100;
        System.out.println(num);
        num++;
        System.out.println(num);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.round(2.7));
    }

    public static void userInput() {
        // Scanner keyboardInput = new Scanner(System.in);
        // System.out.print("Enter username: ");
        // String username = keyboardInput.nextLine();
        // System.out.println("Hello, " + username);
        // keyboardInput.close();
    }

    public static void arrays() {
        int[] luckyNumbers = {4, 8, 15, 16, 23, 42};
        luckyNumbers[0] = 90;
        System.out.println(luckyNumbers[0]);
        System.out.println(luckyNumbers[1]);
        System.out.println(luckyNumbers.length);
    }

    public static void twoDimensionalArrays() {
        int[][] numberGrid = {{1, 2}, {3, 4}};
        numberGrid[0][1] = 99;
        System.out.println(numberGrid[0][0]);
        System.out.println(numberGrid[0][1]);
    }

    public static void arrayListDemo() {
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Oscar");
        friends.add("Angela");
        friends.add("Kevin");
        System.out.println(friends.toString());
        System.out.println(friends.get(0));
        System.out.println(friends.contains("Oscar"));
        System.out.println(friends.size());
    }

    public static void methodDemo() {
        int sum = addNumbers(4, 60);
        System.out.println(sum);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void ifStatements() {
        boolean isStudent = false;
        boolean isSmart = false;
        if (isStudent && isSmart) {
            System.out.println("You are a student");
        } else if (isStudent && !isSmart) {
            System.out.println("You are not a smart student");
        } else {
            System.out.println("You are not a student and not smart");
        }
        if (1 > 3) {
            System.out.println("number comparison was true");
        }
        if ('a' > 'b') {
            System.out.println("character comparison was true");
        }
        if ("dog".equals("cat")) {
            System.out.println("string comparison was true");
        }
    }

    public static void switchStatements() {
        char myGrade = 'A';
        switch (myGrade) {
            case 'A':
                System.out.println("You Pass");
                break;
            case 'F':
                System.out.println("You fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

    public static void whileLoops() {
        int index = 1;
        while (index <= 5) {
            System.out.println(index);
            index++;
        }
        index = 1;
        do {
            System.out.println(index);
            index++;
        } while (index <= 5);
    }

    public static void forLoops() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int[] luckyNums = {4, 8, 15, 16, 23, 42};
        for (int luckyNum : luckyNums) {
            System.out.println(luckyNum);
        }
    }

    public static void exceptionCatching() {
        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
        }
        throw new ArithmeticException("can't add numbers");
    }

    public static void classAndObjects() {
        Book book1 = new Book("Harry Potter", "JK Rowling");
        book1.readBook();
        System.out.println(book1.title);

        Book book2 = new Book("Lord of the Rings", "JRR Tolkien");
        book2.readBook();
        System.out.println(book2.title);

        System.out.println(Book.staticAttribute);
    }

    public static void inheritanceDemo() {
        Chef myChef = new Chef("Gordon Ramsay", 50);
        myChef.makeChicken();

        ItalianChef myItalianChef = new ItalianChef("Massimo Bottura", 55, "Italy");
        myItalianChef.makeChicken();
        System.out.println(myItalianChef.age);
    }

    public static void abstractClassesAndMethods() {
        Vehicle[] vehicles = {new Bicycle(), new Plane()};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.getDescription();
        }
    }

    public static void interfaceInheritance() {
        Animal[] animals = {
                new Dog(),
                new Cat()
        };
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    // Supporting Classes

    static class Book {
        public String title;
        public String author;
        public static String staticAttribute = "My Static Attribute";

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void readBook() {
            System.out.println("Reading " + this.title + " by " + this.author);
        }
    }

    static class Chef {
        public String name;
        public int age;

        public Chef(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeChicken() {
            System.out.println("The chef makes chicken");
        }

        public void makeSalad() {
            System.out.println("The chef makes salad");
        }

        public void makeSpecialDish() {
            System.out.println("The chef makes a special dish");
        }
    }

    static class ItalianChef extends Chef {
        public String countryOfOrigin;

        public ItalianChef(String name, int age, String countryOfOrigin) {
            super(name, age);
            this.countryOfOrigin = countryOfOrigin;
        }

        public void makePasta() {
            System.out.println("The chef makes pasta");
        }

        @Override
        public void makeSpecialDish() {
            System.out.println("The chef makes chicken parm");
        }
    }

    abstract static class Vehicle {
        public abstract void move();

        public void getDescription() {
            System.out.println("Vehicles are used for transportation");
        }
    }

    static class Bicycle extends Vehicle {
        @Override
        public void move() {
            System.out.println("The bicycle pedals forward");
        }
    }

    static class Plane extends Vehicle {
        @Override
        public void move() {
            System.out.println("The plane flies through the sky");
        }
    }

    interface Animal {
        void speak();
    }

    static class Dog implements Animal {
        @Override
        public void speak() {
            System.out.println("Woof Woof");
        }
    }

    static class Cat implements Animal {
        @Override
        public void speak() {
            System.out.println("Meow Meow");
        }
    }
}
