
package hotelreservationsystem;


public class DoubleRoom extends Room {
    
     private static final double PricePerNight= 2000.00;

    public DoubleRoom(int RoomNumber) {
        super(RoomNumber);
    }
    
    @Override
     public double CalculatePricePerNight(){
         return PricePerNight;
     }
    @Override
    public String getRoomtype(){
        return "Double Room!!";
    }
    
}
