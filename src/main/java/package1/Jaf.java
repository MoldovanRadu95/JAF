package package1;

public class Jaf {


    private int nume;
    public int id;
    protected int age;
    int prenume;

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrenume() {
        return prenume;
    }

    public void setPrenume(int prenume) {
        this.prenume = prenume;
    }

    public Jaf(int nume, int id, int age, int prenume) {
        this.nume = nume;
        this.id = id;
        this.age = age;
        this.prenume = prenume;
    }

}


