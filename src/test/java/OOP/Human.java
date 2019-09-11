package OOP;

import org.junit.Test;

public class Human {
    @Test
    public void human() {
        Person maks = new Person(175, 70);
        maks.say("Макс говорит, Здарова!");
        System.out.println("Рост maks: " + maks.height + " Вес maks: " + maks.weight);

        Person vova = new Person();
        vova.height = 150;
        vova.weight = 80;
        vova.say("Вова говорит, Здравствуйте!");
        System.out.println("Рост vova'a: " + vova.height + " Вес vova'a: " + vova.weight);

        Student oleg = new Student(190, 100, 2);
        System.out.println("Рост oleg'a: " + oleg.height + " Вес oleg'a: " + oleg.weight + " oleg на курсе: " + oleg.course);
    }
}
