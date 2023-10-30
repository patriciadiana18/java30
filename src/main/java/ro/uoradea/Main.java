package ro.uoradea;

public class Main {
    public static void main(String[] args){
        Caine caine1=new Caine("bibi","bulldog");
        Caine caine2=new Caine("bob","hotdog");
        System.out.println(caine1.nume);
        System.out.println(caine1.rasa);
        System.out.println(caine2.nume);
        System.out.println(caine2.rasa);
        caine1.setNume("bobi");
        System.out.println(caine1.nume);
        System.out.println(caine1.rasa);
        caine2.setNume("bubi");
        System.out.println(caine2.nume);
        System.out.println(caine2.rasa);
    }
}
