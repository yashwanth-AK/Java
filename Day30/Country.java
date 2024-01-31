import java.util.List;

public interface Country {
    // this is the interface of the country.

    // The method of creating the country or adding the elements in the List.
    String createCountry(String country, List arrayList)throws CountryException;

    // The method for removing the country name from the list.

    String removeCountry(String country,List arrayList)throws CountryException;

    //Updating the country name in the List.

    String updateCountry(String country1,String country2,List arrayList)throws CountryException;

    // The method used to read the data in the list.

    boolean readCountry(String country, List arrayList)throws CountryException;
}
