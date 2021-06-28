/**
 * @author Paul Deasy ID(118312303)
 * A class which specifes the name and price per unit of a fabric with public methods to return both of these
 */
public class Fabric {
    private final String fabric_name;
    private final Double price_per_unit;

    /**
     * Constructor of the Fabric class
     *
     * @param name - Name of the fabric
     * @param price - Price of the fabric
     */
    public Fabric(final String name, final Double price){
        fabric_name = name;
        price_per_unit = price;
    }

    /**
     * Getter for the name of a fabric
     *
     * @return - name of a fabric
     */
    public String getName(){
        return fabric_name;
    }

    /**
     * Getter for price of a fabric
     *
     * @return - Price of a fabric
     */
    public Double getPrice(){
        return price_per_unit;
    }
}
