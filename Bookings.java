package hotelreservationsystem;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookings {

    private Guest guest;
    private Room room;
    private int numberOfNights;
    private String checkInDate;
    private String checkOutDate;

    private static final List<Bookings> bookingsList = new ArrayList<>();

    public Bookings(Guest guest, Room room, String checkInDate) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.room.Calculate_Total_Price();
        bookingsList.add(this);
    }

    public int getRoomNumber() {
        return room.getRoomNumber();
    }

    public Guest getGuest() {
        return guest;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setCheckInDate(String date) {
        this.checkInDate = date;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public static void addBooking(Bookings booking) {
        bookingsList.add(booking);
    }

    public static void cancelBookingByFayda(long fayda) {
        Bookings booking = findBookingByFayda(fayda);
        if (booking != null) {
            bookingsList.remove(booking);
            System.out.println("Booking canceled successfully for " + fayda);
        } else {
            System.out.println("No booking found for " + fayda);
        }
    }

    public static void viewBookingByFayda(long fayda) {
        Bookings booking = findBookingByFayda(fayda);
        if (booking != null) {
            booking.showBookingDetails();
        } else {
            System.out.println("No booking found for " + fayda);
        }
    }

    public static void updateBookingByFayda(long fayda, Scanner scanner) {
        Bookings booking = findBookingByFayda(fayda);
        if (booking != null) {
            System.out.println("Enter new check-in date (year-month-day): ");
            String newDate = scanner.nextLine();
            booking.setCheckInDate(newDate);
            System.out.println("Booking updated successfully.");
        } else {
            System.out.println("No booking found for " + fayda);
        }
    }

    public static void deleteBookingByFayda(long fayda) {
        cancelBookingByFayda(fayda);
    }

    public static Bookings findBookingByFayda(long fayda) {
     
        
        for (Bookings b : bookingsList) {
            if (b.getGuest().getFayda()==fayda) {
                return b;
            }
        }
        return null;
    }
    

    public void showBookingDetails() {
        double totalPrice = room.Calculate_Total_Price();
        guest.displayGuest();
        System.out.println("Room Type: " + room.getRoomtype());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Number of Nights: " + room.getNumber_of_Nights());
        System.out.println("Total Price: " + totalPrice + " ETB.");
        System.out.println("Check-In Date: " + (checkInDate != null ? checkInDate : "Not Set"));

        if (checkInDate != null) {
            LocalDate checkIn = LocalDate.parse(checkInDate);
            LocalDate checkOut = checkIn.plusDays(room.getNumber_of_Nights());
            System.out.println("Check-Out Date: " + checkOut);
        } else {
            System.out.println("Check-Out Date: Not Set");
        }
    }

    public static List<Bookings> getAllBookings() {
        return bookingsList;
    }
}
