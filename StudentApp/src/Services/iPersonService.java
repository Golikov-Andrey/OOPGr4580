package Services;

import java.util.List;

public interface iPersonService<T> {
    List<T> getAll();
    void create(String firstName, int age); 
}
