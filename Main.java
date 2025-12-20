public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(101, "Single", 15000, true);
        Room room2 = new Room(102, "Double", 20000, true);

        Guest guest1 = new Guest("Rauan", "+77001234567");
        Guest guest2 = new Guest("Islam", "+77078394924");
        Guest guest3 = new Guest("Ernar", "+77470948490");

        Booking booking1 = new Booking(room1, guest1, 3);
        Booking booking2 = new Booking(room2, guest2, 5);
        Booking booking3 = new Booking(room2, guest3, 5);

        System.out.println("=== Информация о бронировании ===");
        booking1.displayBookingInfo();
        booking2.displayBookingInfo();
        booking3.displayBookingInfo();
    }
}
