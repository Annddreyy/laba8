class Person{
    String name;
    String surname;
    String birthday;
    Person(String name, String surname, String birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    void display(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(birthday);
    }

    void printInformation(Car car, Book book){
        System.out.printf("%s читает книгу %s про машину %s\n", name, book.title, car.title);
    }
}

class Car{
    String title;
    int year;
    double capacity;

    Car(String title, int year, double capacity){
        this.title = title;
        this.year = year;
        this.capacity = capacity;
    }

    void display(){
        System.out.println(title);
        System.out.println(year);
        System.out.println(capacity);
    }
}

class Book{
    String title;
    String author;
    int year;

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
    }
}
public class Main {
    public static void main(String[] args){
        Person ivan = new Person("Иван", "Иванов", "14.06.2002");
        Car car = new Car("Renault Duster", 2020, 100.0);
        Book book = new Book("Все о автомобилях", "Петров В. В.", 2022);

        ivan.display();
        car.display();
        book.display();

        ivan.printInformation(car, book);
    }
}