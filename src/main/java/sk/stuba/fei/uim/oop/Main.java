package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceIndex<Address> ci = new InterfaceIndex<>();
        ci.add(new Address("hodzovo nam.", "80204"));
        ci.add(new Address("hlavna ulica", "12345"));
        var old = ci.add(new Address("hlinena ulica", "54321"));

        for(Address a : old) {
            System.out.println(a.getPsc() + " " + a.getAddress());
        }
    }
}
