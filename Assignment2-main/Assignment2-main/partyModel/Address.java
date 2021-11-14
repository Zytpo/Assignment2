package partyModel;

public class Address {
   /* Declare instance variables for street, city, zip code as String-objects
      and country by using the enum Countries
    */

    private String street;
    private String city;
    private String zipCode;
    Countries country;

  /* Write a default constructor that gives default values for instance variables.
     Set default values for instance variables by calling the other constructor
     below using the this reserved word and:
     - Alternative 1: with arguments that are default values
       of your choice that will inform a user that this value isn't really set.
     - Alternative 2: Use null for all values and call the constructor below and handle that there.
   */

    public Address() {
        this.street = "default";
        this.city = "default";
        this.zipCode = "default";
        country = Countries.Unknown;
    }

  /* Write a constructor with parameters for all instance variables
     given above. Set instance variables to values from parameters.

     Check that the values for the parameters street, zipCode and city
     isn't empty Strings or null before assigning the values to the
     corresponding instance variables.
     If any value is empty or null assign a default value of your choice
     that will inform a user that this value isn't really set.

     If the parameter country is null set this to Countries.Unknown
   */

    public Address(String street, String city, String zipCode, Countries country)
    {
        if (street != null || !(street.isEmpty()))
        {
            this.street = street;
        } else {
            this.street = "default";
        }

        if (city != null || !(city.isEmpty()))
        {
            this.city = city;
        } else
        {
            this.city = "default";
        }

        if (zipCode != null || !(zipCode.isEmpty()))
        {
            this.zipCode = zipCode;
        } else
        {
            this.zipCode = "default";
        }

        if (country != null)
        {
            this.country = country;
        } else
        {
            this.country = Countries.Unknown;
        }
    }


  /* Implement get- and set-methods for all instance variables.
     Remember to check parameters in set-methods with the same
     rules as in the constructor above.
   */

    public void setStreet(String street)
    {
        if (street != null && !(street.isEmpty()))
        {
            this.street = street;
        } else {
            this.street = "default";
        }
    }

    public void setCity(String city)
    {
        if (city != null || !(city.isEmpty()))
        {
            this.city = city;
        } else
        {
            this.city = "default";
        }
    }

    public void setZipCode(String zipCode)
    {
        if (zipCode != null || !(zipCode.isEmpty()))
        {
            this.zipCode = zipCode;
        } else
        {
            this.zipCode = "default";
        }
    }

    public void setCountry(Countries country)
    {
        if (country != null)
        {
            this.country = country;
        } else
        {
            this.country = Countries.Unknown;
        }
    }

  /* Write a toString method to return a String-object made of the address details,
     formatted as one line.
   */

    public String toString()
    {
        String textOut = String.format("Street: %s, City: %s, ZipCode: %s, Country: %s", street, city, zipCode, country);
        return textOut;
    }

}
