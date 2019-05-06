package io.github.huobidev.lyle;

import io.github.huobidev.Order;

public interface Producer {

	void sendOrder(Order order);

	void closeProducer();
}
