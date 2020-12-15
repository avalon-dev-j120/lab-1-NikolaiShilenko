package ru.avalon.java.j20.labs.models;

import java.util.Iterator;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>
 * Числа Фибоначчи (иногда пишут Фибона́чи[1]) — элементы числовой
 * последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
 * 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … (последовательность A000045
 * в OEIS), в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое
 * последующее число равно сумме двух предыдущих чисел. Названы в честь
 * средневекового математика Леонардо Пизанского (известного как Фибоначчи).
 *
 * @see <a href=
 *      "https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа
 *      Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {

	private Integer[] array;

	public Fibonacci(int length) {
		array = initialize(length);
	}

	private Integer[] initialize(int length) {
		Integer[] array = new Integer[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i <= 1 ? i : array[i - 1] + array[i - 2];
		}
		return array;
	}

	/**
	 * Возвращает итератор, позволяющий выполнить обход последовательности чисел
	 * Фибоначчи.
	 *
	 * @return итератор последовательности чисел Фибоначчи
	 */
	@Override
	public Iterator<Integer> iterator() {
		return new FibonacciIterator(this);
	}

	/**
	 * Итератор, выполняющий обход последовательности чисел Фибоначчи.
	 */
	private static class FibonacciIterator implements Iterator<Integer> {
		private final int size;
		private int cursor = -1;
		private final Fibonacci req;

		private FibonacciIterator(final Fibonacci req) {
			this.req = req;
			this.size = req.array.length - 1;
		}

		/**
		 * Определяет, есть ли следующее значение последовательности чисел Фибоначчи.
		 *
		 * @return {@code true}, если следующее число последовательности существует. В
		 *         обратном случае {@code false}.
		 */
		@Override
		public boolean hasNext() {
			if (size == 0) {
				throw new UnsupportedOperationException("Not implemented yet!");
			}
			if (cursor != size) {
				return true;
			}
			return false;
		}

		/**
		 * Возвращает следующее число последовательности чисел Фибоначчи.
		 *
		 * @return следующее число последовательности.
		 */
		@Override
		public Integer next() {
			if (size == 0) {
				throw new UnsupportedOperationException("Not implemented yet!");
			}
			cursor++;
			return req.array[cursor];

		}
	}

}
