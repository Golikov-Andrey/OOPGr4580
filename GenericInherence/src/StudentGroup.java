

import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>> {
    private List<Student<T,V>> group;
    private T idGroup;

    public StudentGroup(List<Student<T,V>> group, T string) {
        this.group = group;
        this.idGroup = string;
    }

    public List<Student<T,V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T,V>> group) {
        this.group = group;
    }

    public T getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(T idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student<T,V>> iterator() {
       return new Iterator<Student<T,V>>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student<T,V> next() {            
            return group.get(counter++);
        }
        
       };
        
    }
    
    
}
