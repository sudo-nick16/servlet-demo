package models;
import java.util.*;

public class Todos {
    private static ArrayList<String> todos = new ArrayList<String>();

    public Todos() {
    }

    public static void add(String todo) {
        todos.add(todo);
    }

    public static ArrayList<String> getAll() {
        return todos;
    }

    public static void clear() {
        todos.clear();
    }
}
