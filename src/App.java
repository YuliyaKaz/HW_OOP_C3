import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.AbstractDocument;

import controllers.AccountController;
import domain.Employee;
import domain.Student;
import domain.StudentGroup;
import domain.StudentStream;
import domain.Teacher;
import services.EmployeeService;
import services.TeacherService;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /* Студенты */
        Student<String,Integer> s1 = new Student<String,Integer>("Иван", 25);
        Student<String,Integer> s2 = new Student<String,Integer>("Игорь", 23);
        Student<String,Integer> s3 = new Student<String,Integer>("Иван", 22);
        Student<String,Integer> s4 = new Student<String,Integer>("Игорь",  23);
        Student<String,Integer> s5 = new Student<String,Integer>("Даша",  23);
        Student<String,Integer> s6 = new Student<String,Integer>("Лена",  23);
        Student<String,Integer> s7 = new Student<String,Integer>("Маша",  24);
        Student<String,Integer> s8 = new Student<String,Integer>("Аня",  22);
        Student<String,Integer> s9 = new Student<String,Integer>("Лена",  20);
        Student<String,Integer> s10 = new Student<String,Integer>("Соня",  18);
  
/* Список студентов группы 4580 */
        List<Student<String,Integer>> listStud = new ArrayList<Student<String,Integer>>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student<String,Integer> std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student<String,Integer> std: group4580.getGroup())
        {
            System.out.println(std);
        }

        System.out.println("--------------------------------------------------------");
/* Список студентов группы 4581 */
        List<Student<String,Integer>> listStud2 = new ArrayList<Student<String,Integer>>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
       // listStud2.add(s11);      
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
/* поток 5 состоит из групп 4580 и 4581*/
        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group4580);
        listGroup.add(group4581);

        StudentStream stream5 = new StudentStream(listGroup, 5);

        Collections.sort(stream5.getStream());
        System.out.println(stream5);
        stream5.setAge();
        
        Teacher<String,Integer,String> teacher1 = new Teacher<String,Integer,String>("Маргарита Ивановна", 55, "доцент");
        Teacher<String,Integer,String> teacher2 = new Teacher<String,Integer,String>("Иван Иванович", 65, "заслуженный учитель");
        Employee<String,Integer,String> worker = new Employee<String,Integer,String>("Василий", 40, "разнорабочий");
        AccountController controller = new AccountController();
        // controller.paySalary(teacher1, 2000); 
        controller.paySalary(worker, 1000);

        TeacherService tc = new TeacherService<String,Integer,String>();
        tc.create(teacher1);
        tc.create(teacher2);
        tc.create("Анатолий Васильевич", 50);
        System.out.println(tc.listTeacherOutput()); 

        tc.setAge();

        EmployeeService es = new EmployeeService<String,Integer,String>();
        es.create(worker);
        es.setAge();

        System.out.println("Средний возраст = " + AccountController.averageAge());
        
    }  
}
