package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public Queue<Transport<?>> queue = new LinkedList<>();

    public void addCarToQueue(Transport<?> transport) throws TransportTypeException {
        transport.spendTransportSTO();
        queue.offer(transport);
    }

    public void spendTechnicalInspection() {
        if (queue.peek() == null) {
            System.out.println("Очередь пустая");
        } else {
            System.out.println("Автомобиль на техосмотре: " + queue.poll());
        }
    }

    public Queue<Transport<?>> getQueue() {
        return queue;
    }
}
