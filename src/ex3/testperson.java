package ex3;

public class testperson {
    public static void main(String[] args) {
        person p=new person();
        p.setFirstName("Firas");
        System.out.println("votre prenom est: "+p.firstName);
        p.setName("Ncibi");
        System.out.println("votre nom est: "+p.name);
        p.setDateNaiss(20,4,2003);
        System.out.println(p.firstName+" "+p.name+" votre age est "+p.ageEn2023());
    }
}
