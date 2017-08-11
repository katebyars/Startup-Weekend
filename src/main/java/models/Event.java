package models;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Event {
    private String name;
    private String description;
    private static ArrayList<Event> instances = new ArrayList<>();
    private ArrayList<String> attendees;


    public Event (String name, String description) {
        this.name = name;
        this.description = description;
        this.attendees = attendees;
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static ArrayList<Event> getInstances() {
        return instances;
    }

    public ArrayList<String> getAttendees() {
        return attendees;
    }

    public static ArrayList<Event> getAll(){
        return instances;
    }
}

