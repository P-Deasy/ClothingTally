import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main( final String[] args ) {
        final List<Garment> items = new ArrayList<Garment>( );
        final Natural_Fabric cotton = new Natural_Fabric("Cotton", 2.0, "Gossypium");
        final Natural_Fabric tweed = new Natural_Fabric("Tweed", 3.0, "Wool");
        final Synthetic_Fabric polyester = new Synthetic_Fabric("Polyester", 5.0);
        final Synthetic_Fabric acrylic = new Synthetic_Fabric("Acrylic", 6.0);
        items.add(new Trousers("Jeans", 2.0, cotton));
        items.add(new Shirts("T-Shirt", 1.5, cotton));
        items.add(new Coats("Winter Coat", 2.5, polyester));
        items.add(new Coats("Raincoat", 2.5, acrylic));
        items.add(new Coats("Jacket", 2.0, tweed));
        for (Garment item : items) {
            item.printPurpose( );
        }
        System.out.println( );
        for (Garment item : items) {
            item.printItemisedBill( );
        }
    }}