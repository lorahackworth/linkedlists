import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //create linked list
        LinkedList<String> iceCreamFlavors = new LinkedList<>();

        //adding flavors to linked list

        iceCreamFlavors.add("Chocolate");
        iceCreamFlavors.add("Strawberry");
        iceCreamFlavors.add("Mint Chocolate Chip");
        iceCreamFlavors.add("Rocky Road");
        System.out.println("Ice Cream Flavors: " + iceCreamFlavors);

        //oops, we forgot to add vanilla to the beginning
        //index number parameter
        iceCreamFlavors.add(0,"Vanilla");
        System.out.println("Updated Ice Cream Flavors: " + iceCreamFlavors);

        //what's the fourth ice cream flavor?
        System.out.println("The fourth ice cream flavor of the list is: " +iceCreamFlavors.get(3));

    }


}