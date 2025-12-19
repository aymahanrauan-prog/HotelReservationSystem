public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(101, "Single", 15000, true);
        Room room2 = new Room(102, "Double", 20000, true);

        Guest guest1 = new Guest("Rauan", "+77001234567");

        Booking booking1 = new Booking(room1, guest1, 3);

        System.out.println("=== Информация о бронировании ===");
        booking1.displayBookingInfo();

        System.out.println("\n=== Сравнение номеров ===");
        if (room1.equals(room2)) {
            System.out.println("Номера одинаковые");
        } else {
            System.out.println("Номера разные");
        }

        if (room1.getPrice() > room2.getPrice()) {
            System.out.println("Комната 101 дороже");
        } else {
            System.out.println("Комната 102 дороже");
        }
    }
}
