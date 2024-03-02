package domain;

import controllers.AccountController;

public abstract class Person<T,V> {
    private T name;
    private V age;
    /* @apiNote конструктор */
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }
    /* @apiNote getter-метод для поля name */
    public String getName() {
        return name.toString();
    }
/* @apiNote setter-метод для поля name */
    public void setName(T name) {
        this.name = name;
    }
/* @apiNote getter-метод для поля age */
    public Integer getAge() {
        return (Integer)age;
    }
/* @apiNote setter-метод для поля age */
    public void setAge(V age) {
        this.age = age;
    }
/* @apiNote Вывод данных пользователя в консоль */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
}


