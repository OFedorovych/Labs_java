package ua.lviv.iot;

import ua.lviv.iot.shoes.Shoes;

public class Main {

    public static void main(String[] args) {

        Shoes nikeSpaceHippie04 = new Shoes("Nike Space Hippie 04", 130, 9.5, "Thailand", 2017, "Nike", 28);
        Shoes nikeCourtReactVaporNXT = new Shoes("NikeCourt React Vapor NXT", 160, 7.5, "Marroco", 2019);
        Shoes nikeRenewRide2Premium = new Shoes();

        System.out.println(nikeSpaceHippie04);
        System.out.println(nikeCourtReactVaporNXT);
        System.out.println(nikeRenewRide2Premium);

        nikeCourtReactVaporNXT.resetValues("NikeCourt React Vapor NXT 2.0", 220, 8, "Afghanistan", 2021, "Nike", 26.5);
        System.out.println("Reseted values of object:\n" + nikeCourtReactVaporNXT);

        System.out.print("Number of objects from static method: ");
        Shoes.printStaticObjectCount();

        System.out.print("Number of objects from non-static method: ");
        nikeCourtReactVaporNXT.printObjectCount ();


    }
}
