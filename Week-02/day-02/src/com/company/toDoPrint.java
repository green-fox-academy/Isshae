package com.company;

public class toDoPrint {
    public static void main(String... args) {

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";
        String myToDo = "My todo:\n".concat(todoText).concat(" - Download games\n").concat("     - Diablo");
        todoText = myToDo;
        System.out.println(todoText);


    }
}
