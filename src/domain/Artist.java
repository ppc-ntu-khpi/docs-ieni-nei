package domain;

/**
 * Клас, що представляє художника. Наслідує клас Employee.
 */
public class Artist extends Employee {

	/**
	 * Конструктор, що ініціалізує об'єкт художника з вказаними навичками, ім'ям,
	 * посадою, рівнем та відділом.
	 *
	 * @param skills   Масив рядків, що містить навички художника.
	 * @param name     Ім'я художника.
	 * @param jobTitle Посада художника.
	 * @param level    Рівень художника.
	 * @param dept     Відділ художника.
	 */
	public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.skills = skills;
	}

	/**
	 * Конструктор, що ініціалізує об'єкт художника з вказаними навичками.
	 *
	 * @param skills Масив рядків, що містить навички художника.
	 */
	public Artist(String[] skills) {
		super();
		this.skills = skills;
	}

	/**
	 * Конструктор, що ініціалізує об'єкт художника зі значеннями за замовчуванням.
	 */
	public Artist() {
		super();
		this.skills = new String[10];
	}

	/**
	 * Повертає рядок, що представляє об'єкт художника, включаючи навички.
	 *
	 * @return Рядок, що містить інформацію про художника та його навички.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nНавички: " + getSkills();
	}

	/**
	 * Масив рядків, що містить навички художника.
	 */
	private String[] skills;

	/**
	 * Повертає рядок, що містить навички художника, розділені комами.
	 *
	 * @return Рядок, що містить навички художника.
	 */
	public String getSkills() {
		String s = "";
		for (String e : skills) {
			s = s + e + ", ";
		}
		s = s.substring(0, s.length() - 2);
		return s;
	}

	/**
	 * Встановлює навички художника.
	 *
	 * @param skills Нові навички художника.
	 */
	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	/**
	 * Повертає масив рядків, що містить навички художника.
	 *
	 * @return Масив рядків, що містить навички художника.
	 */
	public String[] getSkillsList() {
		return skills;
	}
}
