package controllers;

import domain.Person;

public class AccountController {
    private static int age;
    private static int count;

    public <T extends Person, V> void paySalary(T person, V salary){
        System.out.println(person.getName() + " выплачена зарплата: " + salary);
    }
    public static void setDataForAverageAge (int iage){
        age += iage;
        count++;
    }
    public static int averageAge(){
        return age/count;
    }
    
}
