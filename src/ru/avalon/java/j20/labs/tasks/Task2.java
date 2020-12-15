package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>
 * Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run() {

		System.out.println();
		System.out.println("Задача 2 :");
		System.out.println("Вычисление дистанции между двумя точками на плоскости.");

		Point<Float> a = new Point<>(6.0f, 7.0f);
		Point<Integer> b = new Point<>(3, 5);
		System.out.println("Даны две точки с координатами: " + "(" + a.getX() + ";" + a.getY() + ") и (" + b.getX()
				+ ";" + b.getY() + ")");
		System.out.println("Дистанция между точками: " + a.distanceTo(b));
		/*
		 * TODO(Студент): Выполнять задание №2
		 *
		 * 1. Выполнить обобщение класса Point с использованием шаблона так, чтобы в
		 * качестве координат точки можно было использовать любые числовые типы данных.
		 *
		 * 2. Создать экземпляр типа Point:
		 *
		 * - Создать точку, использующую для описания координат значения типа float.
		 *
		 * - Создайте точку, использующую для описания координат значение типа int.
		 *
		 * 3. Вычислите дистанцию между точками.
		 *
		 * 4. С использованием отладчика проверьте корректность работы программы.
		 */
	}
}
