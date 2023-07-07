package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;
import Domen.Student;

public class EmploeeService implements iPersonService<Emploee> {
        private int count;
    private List<Emploee> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }    
}
