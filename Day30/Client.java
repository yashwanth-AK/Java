import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String [] args){

        // The Driver code is implemented here.

        List<String> arr = new ArrayList<String>();
        Country Asian = new CountryImpl();

        try{

            // ----------------------------Implementation of Create Country--------------------------------------------

            //creating the list
            Asian.createCountry("India",arr);
            Asian.createCountry("China",arr);
            Asian.createCountry("Bhutan",arr);
            Asian.createCountry("Russia",arr);
            Asian.createCountry("Pakistan",arr);
            Asian.createCountry("Japan",arr);

            System.out.println(arr);

            //------------------------------Implementation of Remove part----------------------------------------------

            //Removing the element in the list
            Asian.removeCountry("China",arr);

            //creating an exception here.
            Asian.removeCountry("Sri Lanka",arr);


            //------------------------------Implementation of Update part---------------------------------------------

            //updating the country name
            Asian.updateCountry("Bhutan","Bangladesh",arr);

            //creating an exception here
            Asian.updateCountry("Thailand","Nepal",arr);

            //------------------------------ Implementation of Read method--------------------------------------------
            Asian.readCountry("India",arr);

        }

        catch(CountryException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The Sample application to run the Arraylist");
        }

    }
}
