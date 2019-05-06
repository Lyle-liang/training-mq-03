package io.github.huobidev.lyle;

import io.github.huobidev.Order;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Version: v1.0
 * Description: TODO
 */
public class ProducerImplTest {

	@Test
	public void sendOrder() {
		Producer producer = new ProducerImpl();
		for (int i = 0; i < 20; i++) {
			Order order = new Order();
			order.setId(Long.valueOf(1 + i));
			order.setSymbol("ht");
			order.setPrice(Double.valueOf(5.2 + i));
			order.setTs(System.currentTimeMillis());

			producer.sendOrder(order);
		}
		producer.closeProducer();
	}
}
