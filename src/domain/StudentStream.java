package domain;

/*
 * Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
 */

import java.util.Iterator;
import java.util.List;

import controllers.AccountController;

public class StudentStream implements Iterable<StudentGroup> {
   private List<StudentGroup> stream;
   private Integer idStream;
/* @apiNote конструктор */
    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }
/* @apiNote getter метод для потока студентов */
    public List<StudentGroup> getStream() {
        return stream;
    }
/* @apiNote setter-метод для Списка группы студентов */
    public void setStream(List<StudentGroup> studentGroup) {
        this.stream = studentGroup;
    }
/* @apiNote getter-метод для поля номер группы */
    public Integer getIdStream() {
        return idStream;
    }
/* @apiNote Присвоение номера группы */
    public void setIdGroup(Integer idStream) {
        this.idStream = idStream;
    }
/* @apiNote вывод в терминал данных в виде строки */
     @Override
    public String toString() {
        return "\nStudentStream{" + " idStream = " + idStream + " countOfGroups = "+ stream.size() + 
        " \n" + stream  + '}' + '\n';
    }
    /* @apiNote Итератор */
     @Override
    public Iterator<StudentGroup> iterator() {
       return new StreamIterator(stream);
    }
    /* @apiNote сохранение данных о возрасте студентов, входящих в группу для вычисления среднего */
    public void setAge(){
        for (StudentGroup studentGroup : stream) {
            for (Student student : studentGroup) {
                AccountController.setDataForAverageAge(student.getAge());
            }
        }
    }
}
