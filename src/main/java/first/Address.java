package first;

import java.util.concurrent.CompletionException;

public class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }

    public String printCity(String city){
        try {
            if(city != null)
            return city;
            throw new RuntimeException("s a ");
        }

        finally {
            System.out.println();
            return city + " something";
        }
    }

}
