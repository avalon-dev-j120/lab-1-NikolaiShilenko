package ru.avalon.java.j20.labs.models;

import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person {
	/**
	 * Имя.
	 */
	private final String name;
	/**
	 * Фамилия.
	 */
	private final String surname;

	/**
	 * Создаёт экземпляр класса на основании имени и фамилии.
	 *
	 * @param name    имя человека
	 * @param surname фамилия человека
	 */
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	/**
	 * возвращает имя человека.
	 *
	 * @return имя человека
	 */
	public String getName() {
		return name;
	}

	/**
	 * Возвращает фамилию человека.
	 *
	 * @return фамилия человека
	 */
	public String getSurname() {
		return surname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

}
