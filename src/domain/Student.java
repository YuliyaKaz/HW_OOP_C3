package domain;


public class Student<T,V> extends Person<T,V> implements Comparable<Student<T,V>> {

    private int id;
    private static int generalId;
/* @apiNote Конструктор */
    public Student(T name, V age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

/* @apiNote getter-метод id студента */
    public int getId() {
        return id;
    }
/* @apiNote Вывод в консоль данных о студентах */
    @Override
    public String toString() {
        return "\n"+"Students " +"[age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]" ;
    }
/* @apiNote Реализация метода compareTo интерфейса Comparable */
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName()+" - "+o.getName());
        if(super.getAge()==o.getAge())
        {
            if(id==o.id)return 0 ;
            if(id>o.id)return 1;
            else return -1;
            //return 0;
        }

        if(super.getAge()>o.getAge()) return 1;
        else if (super.getAge()==o.getAge()) return 0;
        else return -1;        
    }
}


