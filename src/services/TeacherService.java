package services;

import java.util.ArrayList;
import java.util.List;

import controllers.AccountController;
import domain.PersonComparator;
import domain.Teacher;

public class TeacherService<T,V,W> implements iPersonService<T,V> {
    private int count;
    private List<Teacher<T,V,W>> listTeacher;
/* @apiNote конструктор */
    public TeacherService(){
        this.listTeacher = new ArrayList<Teacher<T,V,W>>();
    }
/* @apiNote создание объекта учитель */
    public void create(T name, V age,W acacDegree) {
        Teacher teacher = new Teacher(name, age, acacDegree);
        this.listTeacher.add(teacher);
        count++;
    }
    /* @apiNote Создание объекта учитель */
    public void create(Teacher<T,V,W> teacher) {
        this.listTeacher.add(teacher);
        count++;
    }
    /* @apiNote Создание объекта учитель */
    @Override
    public void create(T name, V age) {
        Teacher teacher = new Teacher(name, age, "доцент");
        this.listTeacher.add(teacher);
        count++;
    }
    /* @apiNote Сортировка по ФИО */
    public void sortByFio(){
        this.listTeacher.sort(new PersonComparator<Teacher<T,V,W>>());
    }
/*
 * @apiNote Вывод списка учителей, отсортированный методом sortByFio
 */
    public List<Teacher<T,V,W>> listTeacherOutput(){
        sortByFio();
        return listTeacher;
    }
/* @apiNote Сохранение возраста учителей для нахождения среднего */
    public void setAge(){
        for (Teacher<T,V,W> teacher : listTeacher) {
            AccountController.setDataForAverageAge(teacher.getAge());
        }
    }
/* @apiNote вывод всего списка учителей */
    @Override
    public List<T> getAll() {
        return (List<T>)this.listTeacher;
    }
    
    
    
}
