package services;

import java.util.ArrayList;
import java.util.List;

import domain.PersonComparator;
import domain.Student;

public class StudentService<T,V> implements iPersonService<T,V> {
    int count;
    private List<Student<T,V>> listStudents;
    /* @apiNote вывод в терминал данных  */
    public StudentService(){
        this.listStudents = new ArrayList<Student<T,V>>();
    }
/* @apiNote вывод всего списка  */
    @Override
    public List<T> getAll() {
        return this.getAll();
    }
/* @apiNote создание студента */
    @Override
    public void create(T name, V age) {
        Student<T,V> newStudent = new Student<T,V>(name, age);
        this.listStudents.add(newStudent);
    }
    /* @apiNote сортировка студентов по ФИО */
    public void sortByFio(){
        this.listStudents.sort(new PersonComparator<Student<T,V>>());
    }
}
