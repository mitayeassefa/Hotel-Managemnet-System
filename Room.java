
package hotelreservationsystem;


public abstract class Room {
    private int RoomNumber;
    private int Number_of_Nights;
    
    public Room(int RoomNumber) {
        this.RoomNumber = RoomNumber;   
    }
    public abstract double CalculatePricePerNight();
    public abstract String getRoomtype();
    
    
    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }


    public int getNumber_of_Nights() {
        return Number_of_Nights;
    }

    public void setNumber_of_Nights(int Number_of_Nights) {
        if(Number_of_Nights<=0)
            throw new IllegalArgumentException ("Number of Nights must greater than 0.");
        this.Number_of_Nights = Number_of_Nights;
    }
    
   public double Calculate_Total_Price(){
       return Number_of_Nights * CalculatePricePerNight();
   }

   
}