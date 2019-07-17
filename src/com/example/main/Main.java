package com.example.main;

import com.example.room.Room;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(25, 19, true);

        room.descendingTemp(); //18 - true
        room.descendingTemp(); //wynik false, bo min. temp = 18
        room.descendingTemp(); //wynik false, bo min. temp = 18
        room.descendingTemp(); //wynik false, bo min. temp = 18
        room.descendingTemp(); //wynik false, bo min. temp = 18

        System.out.println(room.show());
    }
}
