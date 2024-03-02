package services;

import java.util.List;

public interface iPersonService<T,V> {
    public List<T> getAll();
    public void create(T name, V age);
}
