/**
 * @author Paul Deasy ID(118312303)
 * A subclass of Fabric which extends it to include the source of this natural fabric
 */
public class Natural_Fabric extends Fabric{
    private final String source;

    /**
     * Constructor of the Natural_Fabric class
     *
     * @param name - Name of the fabric
     * @param price - Price of the fabric per unit
     * @param origin - Source of the fabric
     */
    public Natural_Fabric(final String name, final Double price, final String origin){
        super(name, price);
        source = origin;
    }

    /**
     * Getter for the source of a fabric
     *
     * @return - Source of a fabric
     */
    public String getSource() {
        return source;
    }
}
