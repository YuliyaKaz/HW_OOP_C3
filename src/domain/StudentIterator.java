package domain;

import java.util.Iterator;
import java.util.List;

import controllers.AccountController;

public class StudentIterator implements Iterator<Student<String,Integer>> {
    private int counter;
    private final List<Student<String,Integer>> students;
    /* @apiNote Конструктор */
    public StudentIterator(List<Student<String,Integer>> students) {
        this.students = students;
        this.counter = 0;
    }
    /* @apiNote Реализация метода hasNext интерфейса Iterator */
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }
    /* @apiNote Реализация метода next интерфейса Iterator */
    @Override
    public Student<String,Integer> next() {
        if(!hasNext()) { return null; }
        //counter++;
        return students.get(counter++);        
    }
    /* @apiNote сохранение данных о возрасте студентов для нахождения среднего */
    public void setAge(){
        for (Student<String,Integer> student : students) {
            AccountController.setDataForAverageAge(student.getAge());
        }
    }
    
}

