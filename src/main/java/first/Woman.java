package first;

import java.util.List;

//@Entity = women
public class Woman {
    private int id;
    private String name;
    private Address address;
    private List<Kid> kids;

    public Woman(int id , String name, Address address,List<Kid> kids){
        this.id = id;
        this.name = name;
        this.address = address;
        this.kids = kids;
    }

    public int getId(){
        return id;
    }
    public String name(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public List<Kid> getKids(){
        return kids;
    }

    public void displayEmp(){
        System.out.println("Angajatul cu id-ul " + id + " numele " + name + " adresa " + address + " are " + kids + " copii." );
    }



}
