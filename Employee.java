public class Employee {
    /* Создать класс Employee (сотрудник), у которого:
1.1 Есть приватное поле String firstName (имя)
1.2 Есть приватное поле String lastName (фамилия)
1.3 Приватное поле int age (возраст)
1.4 Приватное поле double salary (зарплата)
2.1 Есть метод getAge, который возвращает возраст
2.2 Есть метод getSalary, который возвращает зарплату
2.3 Есть метод getFullName, который возвращает конкатенацию firstName и lastName
2.4 Есть методы (сеттеры) для изменения всех полей (setAge, setSalary, setFirstName, setLastName)
3.1 Есть конструктор, который принимает все 4 поля
3.2 Есть конструктор, который принимает firstName, lastName и возраст (зарплата по умолчанию 1_000.0)
3.3 Есть конструктор, который принимает firstName, lastName (зарплата по умолчанию 1_000.0, возраст по умолчанию 25)
4. Реализовать метод toString, который выводит информацию о сотруднике в строковом представлении (формат придумать самостоятельно).
5. Реализовать методы equals и hashCode, которые учитывают только firstName и lastName.*/

private String firstName;
private String lastName;
private int age;
private double salary;


public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = 25;
    this.salary = 1_000.0;
}

public Employee(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.salary = 1_000.0;
}

public Employee(String firstName, String lastName, int age, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.salary = salary;
}


public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public int getAge() {
    return age;
}
public double getSalary() {
    return salary;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public void setAge(int age) {
    this.age = age;
}
public void setSalary(double salary) {
    this.salary = salary;
}

@Override
public String toString() {
    return "Employee [firstName=" + firstName + " lastName=" + lastName + "is  " + age + " years old, gets salary=" + salary + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Employee other = (Employee) obj;
    if (firstName == null) {
        if (other.firstName != null)
            return false;
    } else if (!firstName.equals(other.firstName))
        return false;
    if (lastName == null) {
        if (other.lastName != null)
            return false;
    } else if (!lastName.equals(other.lastName))
        return false;
    return true;
}

}
