package ca.gbc.orderservice;

import ca.gbc.orderservice.dto.InventoryResponse;
import ca.gbc.orderservice.dto.OrderRequest;
import ca.gbc.orderservice.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OrderServiceApplicationTests{

	private final String TEST_SKU_CODE = "testSkuCode";

	@Test
	void contextLoads() {
	}


@Test
void placeOrder() throws Exception {
	InventoryResponse inventoryResponse =
			new InventoryResponse(TEST_SKU_CODE, true);


}
}
