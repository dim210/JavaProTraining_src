package com.itea.StyrenkoD.Lection8.Dz;

public class NotepadMain {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addRecord(25,19,"any record");
        notepad.addRecord(25,16,"other record");
        System.out.println(notepad);
    }
}
