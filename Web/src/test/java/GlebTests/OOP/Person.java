package GlebTests.OOP;

public class Person {
    int height;
    int weight;

    void say(String str) {
        System.out.println(str);
    }

    Person(int height, int weight) {
        this.height=height;
        this.weight=weight;
    }

    Person () {}
}
