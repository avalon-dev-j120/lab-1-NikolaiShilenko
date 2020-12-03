package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4.
 *
 * <p>Тема: "Методы класса {@link Object}".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
    	
    	System.out.println();
    	System.out.println("Задача 4 :");
    	System.out.println("Вызов методов hashCode() и equals(), переопределённых для класса Person");
    	System.out.println("Даны объекты класса Person");
    	System.out.println("Имя объектов: Иван; Фамилия объектов: Иванов");
    	
        Person a = new Person("Иван", "Иванов");
        Person b = new Person("Иван", "Иванов");
        boolean isEqual = a.equals(b);
        boolean hashIsEqual = a.hashCode() == b.hashCode();
        System.out.println("Вызов метода equals() возвращает: " + isEqual);
        System.out.println("Вызов метода hashCode() возвращает: " + hashIsEqual);
        
        /*
         * TODO(Студент): Выполните задание №4
         *
         * 1. С использованием отладчика проверьте, что
         *    сравнение объектов класса Person выполняется
         *    некорректно.
         *
         * 2. Переопределите в классе Person методы equals и
         *    hashCode.
         *
         * 3. С использованием отладчика проверьте что сравнение
         *    объектов типа Person выполняется корректно.
         */
    }
}
