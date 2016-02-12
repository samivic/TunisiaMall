package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.esprit.client.locator.Locator;
import com.esprit.tunisiamall.domain.Item;
import com.esprit.tunisiamall.service.interfaces.ItemService;

public class ServiceTest {

	ItemService itemService;
	@Before
	public void setUp() throws Exception {
	

	itemService=(ItemService)Locator.lookup("ItemClasse", ItemService.class);
	}

	@Test
	public void test() {
		
	
		Item item=new Item();
		item.setCurrentprice(50);
		item.setName("pentalon");
		
		System.out.println(""+item.getName());
		itemService.addItem(item);
	}
		
}
