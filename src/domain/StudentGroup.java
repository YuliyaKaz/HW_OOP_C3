package domain;

import java.util.Iterator;
import java.util.List;

import controllers.AccountController;

public class StudentGroup implements Iterable<Student<String,Integer>>, Comparable<StudentGroup>{
    private List<Student<String,Integer>> group;
    private int idGroup;
/* @apiNote Конструктор */
    public StudentGroup(List<Student<String,Integer>> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
/* @apiNote getter-метод для группы студентов */
    public List<Student<String,Integer>> getGroup() {
        return group;
    }
/* @apiNote setter-метод для списка студентов */
    public void setGroup(List<Student<String,Integer>> group) {
        this.group = group;
    }
/* @apiNote getter-метод для номера группы */
    public Integer getIdGroup() {
        return idGroup;
    }
/* @apiNote setter-метод для номера группы */
    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }
/* @apiNote Вывод состава группы и ее номера. */
     @Override
    public String toString() {
        return "StudentGroup{" + "idGroup = " + idGroup + " countOfStudents = " + group.size() +
                " group=" + group +"\n" + '}';
    }
/* @apiNote Реализация интерфейса Iterable */
    @Override
    public Iterator<Student<String,Integer>> iterator() {
       return new StudentIterator(group);
    }
    /* @apiNote Реализация интерфейса Comparable. Сортировка по размеру группы. */
    @Override
    public int compareTo(StudentGroup o) {
        if (group.size() == o.getGroup().size()) return 0;
        if (group.size() < o.getGroup().size()) return -1;
        if (group.size() > o.getGroup().size()) return 1;    
        if (idGroup == o.getIdGroup()) return 0;
        if (idGroup < o.getIdGroup()) return -1;
        return 1;
    }   
    
    
}
