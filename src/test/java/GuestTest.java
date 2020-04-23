import com.company.Guest;
import com.company.Theatre;
import org.junit.jupiter.api.Test;

public class GuestTest {

    @Test
    public void testWalk() {
        Guest guest = new Guest();
        guest.setWalkDuration(6000);
        guest.walk();
    }

    @Test
    public void testBuyTicket(){
        Theatre.setNumberOfBooths(1);
        Theatre.setOccupiedBooths(0);
        Guest guest1 = new Guest("David",10000,6000);
        Guest guest2 = new Guest("Ana",5000,3000);
        Thread thread1 = new Thread(guest1);
        Thread thread2 = new Thread(guest2);

        thread1.start();
        thread2.start();

//        guest1.buyTicket(theatre);
//        guest2.buyTicket(theatre);
    }
}
