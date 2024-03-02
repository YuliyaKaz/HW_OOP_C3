package domain;

public class Teacher<T,V,W> extends WorkingPerson{
    private W acadDegree;
    /* @apiNote Конструктор */
    public Teacher(T firstName, V age, W acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
    /* @apiNote вывод в терминал данных в виде строки */
    @Override
    public String toString() {
        return "Учителя{" + " name = " + super.getName() + " возраст = "+ super.getAge() + " степень = " + acadDegree +
         '}' + "\n" ;
    }
}
