/**
 * The superclass Garment which gives the name and purpose of a type of garment, the material and amount of it garments
 * are made of and the itemised price of said garment
 *
 * @author Paul Deasy ID(118312303)
 */
public class Garment {
    private final String clothes_name;
    private final String purpose;
    private final Double units;
    private final Fabric fabric;

    /**
     * Constructor of the garment class
     *
     * @param name - The name of the garment
     * @param use - The purpose of the garment
     * @param unit - The units of fabric the garment is made of
     * @param material - The material the garment is made of
     */
    public Garment(final String name, final String use, final Double unit, final Fabric material){
        clothes_name = name;
        purpose = use;
        units = unit;
        fabric = material;
    }

    /**
     * Getter for the garment name
     *
     * @return - The name of the garment
     */
    public String getName(){
        return clothes_name;
    }

    /**
     * Prints the purpose of the garment
     */
    public void printPurpose(){
        System.out.println(purpose + "\n");
    }

    /**
     * Prints an itemised bill of the cost of the garment broken down into base price, environment tax and total price
     */
    public void printItemisedBill(){
        double price = units * fabric.getPrice();
        String cost = Double.toString(price);
        String amount = Double.toString(units);
        System.out.println("Itemised Bill for " + clothes_name);
        if (fabric instanceof Synthetic_Fabric){
            System.out.println("Made of " + amount + " units of " + fabric.getName());
        }
        else {
            System.out.println("Made of " + amount + " units of " + fabric.getName() + " made of " + ((Natural_Fabric)fabric).getSource());
        }
        String tax_multiplier = "0.0";
        String tax_result = "0.0";
        if (fabric instanceof Synthetic_Fabric){
            tax_multiplier = Double.toString(units);
            tax_result = Double.toString(units * 2);
        }
        System.out.println(" Environment tax: 2.0 * " + tax_multiplier + " = " + tax_result);
        if (fabric instanceof Natural_Fabric) {
            System.out.println("      Base price: " + amount + " * " + fabric.getPrice() + " = " + cost);
            System.out.println("     Grand total: " + cost + " + " + tax_result + " = " + cost + "\n");
        }
        else {
            double baseprice = ((Synthetic_Fabric) fabric).getBaseCost();
            double basetotal = baseprice * units;
            System.out.println("      Base price: " + amount + " * " + baseprice + " = " + basetotal);
            System.out.println("     Grand total: " + basetotal + " + " + tax_result + " = " + cost + "\n");
        }
    }
}
