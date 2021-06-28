/**
 * @author Paul Deasy ID(118312303)
 * Extends the Garment class to specify it as a trouser when called it specifies the purpose as covering the legs
 */
public class Trousers extends Garment{
    /**
     * Constructor of the Trousers Class
     *
     * @param name - Name of the trouser
     * @param unit - Units of fabric needed to make the trouser
     * @param material - Fabric used to make the trouser
     */
    public Trousers(final String name,final Double unit, final Fabric material ){
        super(name, "Covers the legs", unit, material);
    }
}
