import java.util.List;

public class CountryImpl implements Country {
    @Override
    public String createCountry(String country, List arr)throws CountryException {

        if(country.equals(" ")){
            // if the country name is an empty string or null.
            throw new CountryException("The String should not be empty or null");
        }

        else{
            arr.add(country);
        }

        return "";
    }

    @Override
    public String removeCountry(String country,List arr)throws CountryException {

        if(arr.isEmpty()){
            // If no Element is present on the list there is no meaning of calling the remove method.

            throw new CountryException("Unable to Delete in the Empyt List");
        }
        else if(!arr.contains(country)){

            throw new CountryException("Unable to Delete in the Empyt List");

        }

        else{

            arr.remove(country);
        }
        System.out.println(arr);
        return "";
    }

    @Override
    public String updateCountry(String previousCountryName,String updatedCountryName,List arr) throws CountryException  {

        if(!arr.contains(previousCountryName)){
            // Check statement for the previous country.
            throw new CountryException("The country not present");
        }
        else{
            //need to work on the code
            int indexOfCountry = arr.indexOf(previousCountryName);
            arr.set(indexOfCountry,updatedCountryName);
        }
        System.out.println(arr);
        return "";
    }

    @Override
    public boolean readCountry(String country, List arr)throws CountryException {
        if(arr.isEmpty()){
            throw new CountryException("The Arraylist is empty");
        }
        else if(arr.contains(country)){
            throw new CountryException("The Country not in List");
        }
        else{
            int index = arr.indexOf(country);
            System.out.println("The country: "+arr.get(index)+" is present in the index of "+ index);
        }
//
        return false;
    }
}
