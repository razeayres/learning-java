package OO_design;

public class Address implements Comparable{
    /*
    these are declaration of
    the fields of the class
    */
    private String address1;
    private String address2;
    private String zipcode;

    /*
    these two are overloaded
    constructors, providing an
    interface to contruct this
    class
    */
    public Address(String address1, String address2, String zip) {
        this.address1 = address1;
        this.address2 = address2;
        this.zipcode = zip;
    }
    public Address(String address1, String zip) {
        this.address1 = address1;
        this.address2 = "";
        this.zipcode = zip;
    }
  
    /*
    this method is used
    for concatenate the
    address components into
    a single well-formatted
    string
    */
     public String toString()
    {
        if(address2.equals(""))
        {
            return (address1 +"\n" + zipcode);
        }
        else
        {
            return(address1 +"\n" + address2 + "\n" + zipcode);
        }
    }

    @Override
    public int compareTo(Object a) {
        Address addr = (Address)a;

        /*
        this converts the string
        zipcode into int type
        */
        int zip1 = Integer.parseInt(this.zipcode);
        int zip2 = Integer.parseInt(addr.zipcode);

        if(zip1 < zip2)
            return -1;
        else if (zip1 > zip2)
            return 1;
        else
            return 0;
    }

}
