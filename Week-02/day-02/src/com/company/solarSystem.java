package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class solarSystem {
    public static void main(String... args){
        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"


        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        String addPlanet="Saturn";
        System.out.println(putSaturn(planetList,addPlanet));

    }

    private static ArrayList putSaturn(ArrayList<String> planetList, String planet) {
         planetList.add(planet);
     return planetList;
    }
}
