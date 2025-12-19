public class Booking {
    private Room room;
    private Guest guest;
    private int days;

    public Booking(Room room, Guest guest, int days) {
        this.room = room;
        this.guest = guest;
        this.days = days;


        room.setAvailable(false);
    }

    public double getTotalPrice() {
        return days * room.getPrice();
    }

    public void displayBookingInfo() {
        System.out.println(guest);
        System.out.println(room);
        System.out.println("Дней проживания: " + days);
        System.out.println("Итого к оплате: " + getTotalPrice());
    }
}
