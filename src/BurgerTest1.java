import static org.junit.Assert.*;
import model.*;

import org.junit.Before;
import org.junit.Test;

public class BurgerTest1 {
	BurgerCalc bCalc = new BurgerCalc();
	Burger burger1 = new Burger();

	@Before
	public void setUp() throws Exception {
		burger1.setBurgerName("Big Mac");
		burger1.setNumberSold(10);
		burger1.setBurgerCost(1.50);
		burger1.setBurgerPrice(2.99);
	}

	@Test
	public void test() {
		assertNotNull(burger1);
	}
	
	@Test
	public void testProfitPerBurger() {
		double ppBurger = bCalc.ProfitPerBurger(burger1);
		double cBurger = burger1.getBurgerPrice() - burger1.getBurgerCost(); // 2.99 - 1.50 = 1.49
		assertTrue(cBurger == ppBurger);
	}

}
