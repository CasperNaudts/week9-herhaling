package be.pxl.ja.ticketsystem;

import java.util.ArrayDeque;
import java.util.HashMap;

public class QueueService {

    private HashMap<String, ArrayDeque<User>> que = new HashMap<>();

    public void addToQueue(String eventID, User user) {
        if (!que.containsKey(eventID)) {
            que.put(eventID, new ArrayDeque<>());
        }
        que.get(eventID).add(user);
    }

    public ArrayDeque getQueue(String eventId) {
        return que.get(eventId);
    }

    public User getNextInLine(String eventID) {
        return que.get(eventID).peek();
    }

    public User removeFromQueue(String eventID) {
        return que.get(eventID).poll();
    }

    public void printQueue(String eventID) {
        if (que.containsKey(eventID)) {
            que.get(eventID).forEach(System.out::println);
        }
    }

    public int QueueSize(String eventID) {
        return que.get(eventID).size();
    }
}