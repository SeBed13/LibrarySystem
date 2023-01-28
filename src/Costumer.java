import java.util.ArrayList;
import java.util.List;

public class Costumer {

    private String name;
    private int age;
    private ArrayList<Books> books;
    private String email;
    private String telNo;
    private String adress;
    private double penalties;

    public Costumer(String name, int age, ArrayList<Books> books, String email, String telNo, String adress, double penalties) {
        this.name = name;
        this.age = age;
        this.books = books;
        this.email = email;
        this.telNo = telNo;
        this.adress = adress;
        this.penalties = penalties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getPenalties() {
        return penalties;
    }

    public void setPenalties(double penalties) {
        this.penalties = penalties;
    }
}
