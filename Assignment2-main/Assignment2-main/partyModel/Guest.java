package partyModel;

public class Guest {
    /* Declare instance variables for first name and family name as String-objects and
       address as an Address-object.
     */

    private String firstName;
    private String familyName;
    Address address = new Address();

    /* Write a default constructor (no parameters) that gives default values for
       instance variables and creates the Address-object using
       the default constructor for class Address.
       Use default values for first name and family name of your choice
       that will inform a user that this value isn't really set.

       You can handle this in this constructor or call
       the constructor below with null for all values and handle that there.
     */

    public Guest()
    {
        this.firstName = "default";
        this.familyName = "default";
        address = new Address();

    }

    /* Write a constructor with parameters for all instance variables
       given above where the address is a reference to an Address-object
       and first name and family name are of type String.

       Check that the values for the parameters for first name and family name
       isn't empty Strings or null before assigning the values to the corresponding
       instance variables. If any value is empty or null assign a default value of your choice
       that will inform a user that this value isn't really set.

       If the parameter for the Address-object is null create an Address-object
       by using the default constructor for class Address.
     */

    public Guest(String firstName, String familyName, Address address)
    {
        if (firstName != null)
            if (!(firstName.isEmpty()))
                this.firstName = firstName;
        else
            this.firstName = "default";

        if (familyName != null)
            if (!(familyName.isEmpty()))
                this.familyName = familyName;
        else
            this.familyName = "default";

        if (address != null)
            this.address = address;
        else
            address = new Address();

    }

    /* Write a constructor with parameters for all instance variables
       given above and all instance variables for the address.
       Create the Address-object with the values given in the parameters.
       Let the Address class take care of assigning default values if any
       parameters for this object is an empty String or null.
   */

    public Guest(String firstName, String familyName, String street, String city, String zipCode, Countries country)
    {

        if (firstName != null)
            if (!(firstName.isEmpty()))
                this.firstName = firstName;
            else
                this.firstName = "default";

        if (familyName != null)
            if (!(familyName.isEmpty()))
                this.familyName = familyName;
            else
                this.familyName = "default";

        if (address != null)
            this.address = new Address(street, city, zipCode, country);
        else
            address = new Address();

    }

    /* Implement get- and set-methods for all instance variables,
       including variables matching the instance variables of
       the Address-object (those call getters and setters in the Address-object).

       Remember to check parameters in set-methods with the same
       rules as in the constructor above.
     */

    public void setFirstName(String firstName)
    {
        if (firstName != null)
            if (!(firstName.isEmpty()))
                this.firstName = firstName;
            else
                this.firstName = "default";
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFamilyName(String familyName)
    {
        if (familyName != null)
            if (!(familyName.isEmpty()))
                this.familyName = familyName;
            else
                this.familyName = "default";
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public void setAddress(String city, Countries country, String street, String zipCode)
    {
        address.setCity(city);
        address.setCountry(country);
        address.setStreet(street);
        address.setZipCode(zipCode);
    }

    public String getAddress()
    {
        return "";
    }



    /* Write a toString method to return a String made of first name and
       family name and the address (by calling the toString method of the Address-object)
       formated in one line.
     */

    public String toString()
    {
        String textOut = String.format("%s %s %s", firstName, familyName, address);
        return textOut;
    }

}
