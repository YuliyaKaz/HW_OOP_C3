package domain;

public class WorkingPerson<T,V> extends Person<T,V> {
    public WorkingPerson(T name, V age){
        super(name,age);
    }
}
