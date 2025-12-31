import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // rooms
        Room room1 = new Room(101, RoomType.SINGLE, 15000);
        Room room2 = new Room(102, RoomType.DOUBLE, 22000);

        // guest
        Guest guest = new Guest(
                "KZ12345678",
                "Rauan N.",
                "+7 777 123 45 67",
                "rauan@mail.com"
        );

        // booking
        Booking booking = new Booking(
                "BKG-001",
                room1,
                guest,
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 15)
        );

        System.out.println("=== BEFORE CONFIRM ===");
        System.out.println(room1);
        System.out.println(booking);

        // confirm booking
        booking.confirm();

        System.out.println("\n=== AFTER CONFIRM ===");
        System.out.println(room1);
        System.out.println(booking);

        // complete booking
        booking.complete();

        System.out.println("\n=== AFTER COMPLETION ===");
        System.out.println(room1);
        System.out.println(booking);
    }
}
