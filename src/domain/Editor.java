package domain;

/**
 * Клас, що представляє редактора. Наслідує клас Artist.
 */
public class Editor extends Artist {

	/**
	 * Конструктор, що ініціалізує об'єкт редактора з вказаною електронною
	 * редакцією, навичками, ім'ям, посадою, рівнем та відділом.
	 *
	 * @param electronicEditing Прапорець, що вказує на електронне редагування.
	 * @param skills            Масив рядків, що містить навички редактора.
	 * @param name              Ім'я редактора.
	 * @param jobTitle          Посада редактора.
	 * @param level             Рівень редактора.
	 * @param dept              Відділ редактора.
	 */
	public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
		super(skills, name, jobTitle, level, dept);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Конструктор, що ініціалізує об'єкт редактора з вказаною електронною редакцією
	 * та навичками.
	 *
	 * @param electronicEditing Прапорець, що вказує на електронне редагування.
	 * @param skills            Масив рядків, що містить навички редактора.
	 */
	public Editor(boolean electronicEditing, String[] skills) {
		super(skills);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Конструктор, що ініціалізує об'єкт редактора з вказаною електронною
	 * редакцією.
	 *
	 * @param electronicEditing Прапорець, що вказує на електронне редагування.
	 */
	public Editor(boolean electronicEditing) {
		super();
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Конструктор, що ініціалізує об'єкт редактора зі значеннями за замовчуванням.
	 */
	public Editor() {
		super();
		this.electronicEditing = true;
	}

	/**
	 * Повертає рядок, що представляє об'єкт редактора, включаючи його вибір
	 * редакції.
	 *
	 * @return Рядок, що містить інформацію про редактора та його вибір редакції.
	 */
	@Override
	public String toString() {
		String s = super.toString() + "\nПереваги редагування= ";
		if (electronicEditing)
			s = s + "електронне";
		else
			s = s + "папір";
		return s;

	}

	/**
	 * Прапорець, що вказує на електронне редагування.
	 */
	private boolean electronicEditing;

	/**
	 * Повертає значення прапорця, що вказує на вибір редакції.
	 *
	 * @return True, якщо редагування електронне, інакше false.
	 */
	public boolean getPreferences() {
		return electronicEditing;
	}

	/**
	 * Встановлює вибір редакції.
	 *
	 * @param electronic Вибір редакції: true для електронного, false для
	 *                   паперового.
	 */
	public void setPreferences(boolean electronic) {
		this.electronicEditing = electronic;
	}
}
