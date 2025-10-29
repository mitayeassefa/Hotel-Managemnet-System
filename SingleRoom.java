
package hotelreservationsystem;

public class SingleRoom extends Room {
    private static final double PricePerNight= 1000.00;

    public SingleRoom(int RoomNumber) {
        super(RoomNumber);
    }
    
    @Override
     public double CalculatePricePerNight(){
         return PricePerNight;
     }
    @Override
    public String getRoomtype(){
        return "Single Room!!";
    }
}