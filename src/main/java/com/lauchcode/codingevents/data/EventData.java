package com.lauchcode.codingevents.data;

import com.lauchcode.codingevents.models.Events;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    private static final Map<Integer, Events> events = new HashMap<>();

    public static Collection<Events> getAll(){
        return events.values();
    }

    public static Events getByID(Integer id){
        return events.get(id);
    }

    public static void add(Events event){
        events.put(event.getId(), event);
    }

    public static void remove(int id){
        events.remove(id);
    }
}
