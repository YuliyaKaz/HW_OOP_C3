package domain;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentGroups;
    /* @apiNote Констуктор */
    public StreamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.counter = 0;
    }
    /* @apiNote Реализация метода hasNext интерфейса Iterator */
    @Override
    public boolean hasNext() {
       return counter<studentGroups.size();
    }
    /* @apiNote Реализация метода next интерфейса Iterator */
    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        return studentGroups.get(counter++);        
    }
}
