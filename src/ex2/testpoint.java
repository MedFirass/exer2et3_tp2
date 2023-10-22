package ex2;

public class testpoint {
    public static void main(String[] args) {
        point p=new point();
        System.out.println("les ordonnes de point p : ");
        p.affiche();
        point p1=new point(4,2);
        System.out.println("les ordonnes de point p1 : ");
        p1.affiche();
        point p2=new point(4,2);
        System.out.println("les ordonnes de point p2 : ");
        p2.affiche();
        p.setCoordonnePoint(3,1);
        System.out.println("les nouveaux cord de p sont : ");
        p.affiche();
        System.out.println("le point p est égal à p1 ?? " +p.egale(p,p1));
        System.out.println("le point p1 est égal à p2 ?? " +p1.egale(p1,p2));
        System.out.println("le point p est a l origine ?? " +p.origine());
        System.out.println("le point p est a l origine ?? " +p1.origine());
        point p3=p1.symetrie();
        System.out.println("les ordonnes de point p3 : ");
        p3.affiche();
        System.out.println("Nbre de point crees est : " +point.nbre);

    }
}
