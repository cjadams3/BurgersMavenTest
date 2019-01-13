import static org.junit.Assert.*;
import model.*;

import org.junit.Before;
import org.junit.Test;

public class BurgerTest2 {
	BurgerCalc bCalc = new BurgerCalc();
	Burger burger2 = new Burger("Super Burger", 15, 1.99, 4.29);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderTotal() {
		double orderTotal = bCalc.OrderTotal(burger2);
		assertEquals(64.35, orderTotal, 0.0); // 4.29 * 15 = $64.35 Order Total
	}
	
	@Test
	public void testOrderProfit() {
		double orderProfit = bCalc.OrderProfit(burger2);
		assertEquals(34.50, orderProfit, 0.0); // (4.29 - 1.99) * 15 = $34.50 Order Profit
	}
}
