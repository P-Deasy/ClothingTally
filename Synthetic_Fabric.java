/**
 * @author Paul Deasy ID(118312303)
 * Extends the Fabric class to include the Environment tax charged on sythetic fabrics also includes a method to return
 * the base cost of the fabric before tax
 */
public class Synthetic_Fabric extends Fabric{
    private final Double basecost;

    /**
     * Static method for calculating total cost including tax of a synthetic fabric
     *
     * @param cost - The cost after tax of a fabric
     * @return - The cost before tax of a fabric
     */
    private static Double price(Double cost){
        double ecotax = 2.0;
        return cost + ecotax;
    }

    /**
     * Constructor of the Synthetic Fabric class
     *
     * @param name - Name of the fabric
     * @param cost - Base cost of the fabric
     */
    public Synthetic_Fabric(final String name, Double cost) {
        super(name, price(cost));
        basecost = cost;
    }

    /**
     * Getter for the base cost of a Synthetic fabric before tax
     *
     * @return - Base cost before tax of synthetic fabric
     */
    public Double getBaseCost(){
        return basecost;
    }
}
