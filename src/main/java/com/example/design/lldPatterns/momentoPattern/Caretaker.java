package com.example.design.lldPatterns.momentoPattern;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("No states to undo.");
        }
    }
}
