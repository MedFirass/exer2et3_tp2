package ex3;

public class person {
    String name;
    String firstName;
    int dayNaiss;
    int monthNaiss;
    int yearNaiss;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDateNaiss(int j,int m,int a){
        dayNaiss=j;
        monthNaiss=m;
        yearNaiss=a;
    }
    public int ageEn2023(){
        return 2023-yearNaiss;
    }
}
