
package hotelreservationsystem;


public class SuiteRoom extends Room {
    private static final double PricePerNight= 3000.00;

    public SuiteRoom(int RoomNumber) {
        super(RoomNumber);
    }
    
    @Override
     public double CalculatePricePerNight(){
         return PricePerNight;
     }
    @Override
    public String getRoomtype(){
        return "Suite Room!!";
      
      
  }
    
}