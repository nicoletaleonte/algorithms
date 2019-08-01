package first;

import java.util.List;

//@Entity = kids
public class Kid {
    private String name;
    private int varsta;
    private List<String>toys;

    public Kid(){

    }

    public Kid(String name, int varsta, List<String>toys){
        this.varsta = varsta;
        this.name = name;
        this.toys = toys;
    }

    public List<String> addToys(List<String> toys, String toy){
        toys.add(toy);
        return toys;

    }

    public int getVarsta(){
        return varsta;
    }
    public String getName(){
        return name;
    }
    public List<String> getToys(){
        return toys;
    }

    @Override
    public String toString() {
        return "Copilul se numeste" + name + " are varsta copilului este de " + varsta + " iar lista de jucarii este " + toys;
    }

    public int checkAge(int age){
        try{
            int test = 4;
            System.out.println(age/test);
            return age/test;
        }catch (Exception e){
            return 0;
        }
        finally {
            return 0;
        }
    }
}
