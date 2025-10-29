
package hotelreservationsystem;

public class Guest {
    private long fayda; 
    private String guestName;
    private int PhoneNo;
    private String Address;
    

   public Guest(long fayda ,String guestName, int Phone, String Address) {
        this.fayda = fayda;
        this.guestName = guestName;
        this.PhoneNo = Phone;
        this.Address = Address;
        
    }
    
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getPhone() {
        return PhoneNo;
    }

    public void setPhone(int Phone) {
        this.PhoneNo = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    

    public long getFayda() {
        return fayda;
    }

    public void setFayda(long fayda) {
        this.fayda = fayda;
    }
    
    
    public void displayGuest(){
        System.out.println("***************************************");
        System.out.println("            Guest Details:              ");
        System.out.println("***************************************");
        System.out.println("FAYDA Number: " + fayda);
        System.out.println("Name: "+ guestName);
        System.out.println("Phone No: "+ PhoneNo);
        System.out.println("Address: " + Address);
                   
    }

}