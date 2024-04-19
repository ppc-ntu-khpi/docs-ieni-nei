package domain;

/**
 * Клас, що представляє керівника.
 */
public class Manager extends Employee {

	/**
	 * Конструктор, що створює новий об'єкт керівника з вказаними співробітниками,
	 * ім'ям, посадою, рівнем та відділом.
	 *
	 * @param employees Масив співробітників, яких керує керівник.
	 * @param name      Ім'я керівника.
	 * @param jobTitle  Посада керівника.
	 * @param level     Рівень керівника.
	 * @param dept      Відділ керівника.
	 */
	public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.employees = employees;
	}

	/**
	 * Повертає рядок, що представляє керівника, включаючи інформацію про
	 * співробітників.
	 *
	 * @return Рядок, що містить інформацію про керівника та його співробітників.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nСпівробітники: " + getEmployees();
	}

	/**
	 * Конструктор, що створює об'єкт керівника зі списком співробітників.
	 *
	 * @param employees Масив співробітників, яких керує керівник.
	 */
	public Manager(Employee[] employees) {
		super();
		this.employees = employees;
	}

	/**
	 * Конструктор, що створює об'єкт керівника зі значеннями за замовчуванням.
	 */
	public Manager() {
		super();
		employees = new Employee[10];
	}

	/**
	 * Масив співробітників, яких керує керівник.
	 */
	private Employee[] employees;

	/**
	 * Повертає рядок, що містить імена співробітників, які керує керівник.
	 *
	 * @return Рядок, що містить імена співробітників.
	 */
	public String getEmployees() {
		String s = "";
		for (Employee e : employees) {
			s = s + e.getName() + ", ";
		}
		s = s.substring(0, s.length() - 2);
		return s;
	}

	/**
	 * Встановлює співробітників, якими керує керівник.
	 *
	 * @param employees Масив співробітників, яких керує керівник.
	 */
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	/**
	 * Повертає масив співробітників, яких керує керівник.
	 *
	 * @return Масив співробітників, яких керує керівник.
	 */
	public Employee[] getEmployeesList() {
		return employees;
	}
}
