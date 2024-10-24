package com.example.design.lldPatterns.momentoPattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setContent("Version 1");
        caretaker.saveState(editor);
        System.out.println("Current Content: " + editor.getContent());

        editor.setContent("Version 2");
        caretaker.saveState(editor);
        System.out.println("Current Content: " + editor.getContent());

        editor.setContent("Version 3");
        System.out.println("Current Content: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getContent());
    }
}
