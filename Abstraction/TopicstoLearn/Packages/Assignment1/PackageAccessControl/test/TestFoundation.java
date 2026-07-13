package Abstraction.TopicstoLearn.Packages.Assignment1.PackageAccessControl.test;

import Abstraction.TopicstoLearn.Packages.Assignment1.PackageAccessControl.foundation.Foundation;

public class TestFoundation {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Error - Private
        // System.out.println(obj.var2); // Error - Default
        // System.out.println(obj.var3); // Error - Protected

        System.out.println("Public Variable (var4): " + obj.var4);

    }

}
