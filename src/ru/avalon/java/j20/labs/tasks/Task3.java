package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.Iterator;

/**
 * Задание №3
 *
 * <p>
 * Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

	private final Fibonacci fib = new Fibonacci(20);
	Iterator itr = fib.iterator();

	@Override
	public void run() {

		System.out.println();
		System.out.println("Задача 3 :");

		System.out.println("Итерируемся вызывая методы объекта итератора.");
		int count = 0;
		while (itr.hasNext()) {
			count += (int) itr.next();
		}
		System.out.println("Сумма первых 20-ти чисел последовательности Фибоначчи: " + count);
		System.out.println();
		
		System.out.println("Итерируемся с использованием цикла foreach.");
		count = 0;
		for (Integer i : fib) {
			count += i;
		}
		System.out.println("Сумма первых 20-ти чисел последовательности Фибоначчи: " + count);

		/*
		 * TODO(Студент): Выполнить задание №3
		 *
		 * 1. Завершить описание класса Fibonacci так, чтобы класс возвращал заданное
		 * количество чисел последовательности Фибоначчи.
		 *
		 * Количество чисел последовательности можно указывать при создании экземпляра
		 * класса.
		 *
		 * Найти сумму 20 первых чисел последовательности Фибоначчи:
		 *
		 * 2. Создать экземпляр класса Fibonacci так, чтобы он возвращал
		 * последовательность чисел Фибоначчи длиной в 20 элементов.
		 *
		 * 3. Найти сумму полученных значений.
		 *
		 * 4. С использованием отладчика проверьте корректность выполнения задания.
		 */
	}
}
