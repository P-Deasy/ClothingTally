/**
 * @author Paul Deasy ID(118312303)
 * Extends the Garment class to specify it as a coat when called it specifies the purpose as providing extra protection
 * against the elements
 */
public class Coats extends Garment{
    /**
     * Constructor of the Coat class
     *
     * @param name - Name of the coat
     * @param unit - Units of fabric used to make the coat
     * @param material - Fabric used to make the coat
     */
    public Coats(final String name, final Double unit, final Fabric material){
        super(name, "Provides extra protection against the elements", unit, material);
    }
}
