/**
 * @author Paul Deasy ID(118312303)
 * Extends the Garment class to specify it as a shirt when called it specifies the purpose as covering the body
 */
public class Shirts extends Garment{
    /**
     * Constructor of the shirt class
     *
     * @param name - Name of the shirt
     * @param unit - Units of fabric needed to make the shirt
     * @param material - Fabric used to make the shirt
     */
    public Shirts(final String name, final Double unit, final Fabric material ){
        super(name, "Covers the body",unit, material);
    }
}
