package ex2;

public class point {
    int abs;
    int ords;

    public point() {
        this.abs = 0;
        this.ords = 0;
        nbre++;
    }

    void setCoordonnePoint(int u, int v){
        abs=u;
        ords=v;

    }
    void translate(int u, int v){
        abs=abs+u;
        ords=ords+v;
    }
    void affiche(){
        System.out.println("l abscisse est: "+abs+"  l ordonee est: "+ords);
    }
    public boolean origine(){
        return abs==0 && ords==0 ;
    }
    public boolean egale(point p,point q){
        return p.abs==q.abs && p.ords==q.ords;
    }
    public point(int abs, int ords) {
        this.abs = abs;
        this.ords = ords;
        nbre++;
    }
    public void setcoordonne(point p){
        abs=p.abs;
        ords=p.ords;
        nbre++;
    }
    public point symetrie(){
        return new point(-abs,-ords);
    }
    public static int nbre;
    int num=nbre;
}
