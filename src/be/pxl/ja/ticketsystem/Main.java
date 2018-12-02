package be.pxl.ja.ticketsystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        QueueService service = new QueueService();

        service.addToQueue("1",new User("lastName", "firstName", LocalDate.now()));

        service.printQueue("1");
    }
}
