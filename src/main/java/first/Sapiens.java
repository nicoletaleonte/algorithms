package first;

public class Sapiens {
    private String nume;
    private int varsta;
    private int nrCopii;
    private int house;
    private static String continent;

    public Sapiens(String nume, int varsta, int nrCopii) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrCopii = nrCopii;
    }

    public Sapiens(String nume) {
            this(nume, 2, 0);
    }

    public Sapiens(String nume, int varsta, int nrCopii, int house) {
        this(nume, varsta, nrCopii);
        this.house = house;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNrCopii(int nrCopii) {
        this.nrCopii = nrCopii;
    }

    public void setContinent(String continent) { this.continent = continent;}

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getNrCopii() {
        return nrCopii;
    }

    public String getContinent() {return continent; }

    public String toString() {
        return "Sapiens este " + nume + " cu varsta " + varsta
                + " numar de copii " + nrCopii + " si este pe continentul " + continent
                + ". Acestia au un numar de case egal cu " + house;
    }

    public static void changeContinent(String continent){
        Sapiens.continent = continent;
    }

    public void display(String smth){
        System.out.println("test medoda overriding");
    }

    public int hashcode(Object o){
        return 0;
    }

    public final int checkAge(int varsta){
        if(varsta < 0 ) return 0;
        return varsta;
    }



}
