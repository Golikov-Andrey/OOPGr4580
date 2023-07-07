package Domen;

public class Emploee extends Person{
    private String special;
    public Emploee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
