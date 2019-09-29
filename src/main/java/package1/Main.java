package package1;

import package1.Jaf;


public class Main {
    static Jaf jaf = new Jaf();
    static package2.Jaf jaf2 = new package2.Jaf();


    public static void main(String[] args) {
        jaf.id = 2;
        jaf.age = 6;
        jaf.prenume = 3;
        jaf2.id = 5;
    }
}
