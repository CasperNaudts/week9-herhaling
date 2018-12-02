package be.pxl.ja.ticketsystem;

import java.util.HashMap;

public class TicketSystem {
    private QueueService queueService;
    private HashMap<String, User> users;
    private HashMap<String, Event> events;
    private HashMap<String, Venue> venues;

    public TicketSystem(QueueService queueService) {
        this.queueService = queueService;
    }

    public void requestTicket(Event event, User user) {
        queueService.addToQueue(event.getId(), user);
    }

    public void viewNext(String eventID) {
        System.out.println(queueService.getNextInLine(eventID));
    }

    public void addUser(User user) {
        this.users.put(user.getId(), user);
    }

    public void addEvent(Event event) {
        this.events.put(event.getId(), event);
    }

    public void addVenues(Venue venue) {
        this.venues.put(venue.getId(), venue);
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public Event getEvent(String id) {
        return events.get(id);
    }

    public Venue getVenue(String id) {
        return venues.get(id);
    }
}
