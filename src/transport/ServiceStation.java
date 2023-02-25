package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public static Queue<String> queue = new LinkedList<>();

    public static void addCarToQueue(Transport<?> transport) throws TransportTypeException {
        transport.spendTransportSTO();
        queue.offer(String.valueOf(transport));
    }

    public static void spendTechnicalInspection() {
        if (queue.peek() == null) {
            System.out.println("Очередь пустая");
        } else {
            System.out.println("Автомобиль на техосмотре: " + queue.poll());
        }
    }

    public static Queue<String> getQueue() {
        return queue;
    }
}
