package domain;

public class Employee<T,V,W> extends WorkingPerson{
    private W special;
/* @apiNote конструктор */
    public Employee (T firstName, V age, W special) {
        super(firstName, age);
        this.special = special;
    }
    /* @apiNote вывод в терминал данных в виде строки */
    @Override
    public String toString(){
        return "Employee = [" + "name=" + super.getName() + "age=" + super.getAge() + "special=" + special + "}";
    }
}
