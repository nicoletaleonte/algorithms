package first;


//@Entity = men
public class Man extends Sapiens{

    public Man(String nume, int varsta, int nrCopii) {
        super(nume, varsta, nrCopii);
    }

    public final int checkAge(int varsta, int nrcopii){
        if(varsta < 0 ) return 0;
        return varsta;
    }

    public void display(String smth){
        System.out.println("test metoda overriding, afisare man");
    }

}
