package services;
import java.util.ArrayList;
import java.util.List;

import controllers.AccountController;
import domain.Employee;
import domain.PersonComparator;

public class EmployeeService<T,V,W> implements iPersonService<T,V> {
    private List<Employee<T,V,W>> listEmployee;
    /* @apiNote Конструктор */
    public EmployeeService () {
        this.listEmployee = new ArrayList<Employee<T,V,W>>();
    }
    /* @apiNote Конструктор */
    public EmployeeService(List<Employee<T, V, W>> listEmployee) {
        this.listEmployee = new ArrayList<Employee<T,V,W>>();
    }
    /* @apiNote Вывод списка работников */
    @Override
    public List<T> getAll() {
        return (List<T>) listEmployee;
    }
/* @apiNote создание списка работников */
    public void create(T name, V age, W spec) {
        Employee<T,V,W> employee = new Employee(name, age, spec);
        this.listEmployee.add(employee);
    }
    /* @apiNote Создание списка работников */
    public void create(Employee<T,V,W> employee) {
        this.listEmployee.add(employee);
    }
    /* @apiNote Создание списка работников */
    @Override
    public void create(T name, V age) {
        Employee<T,V,W> employee = new Employee(name, age, "разнорабочий");
        this.listEmployee.add(employee); 
    }

/* @apiNote сортировка списка по ФИО */
    public void sortByFio(){
        this.listEmployee.sort(new PersonComparator<Employee<T,V,W>>());
    }
    /* @apiNote сохранение данных о возрасте работников */
    public void setAge(){
        for (Employee<T,V,W> employee : listEmployee) {
            AccountController.setDataForAverageAge(employee.getAge());
        }
    }    
}
