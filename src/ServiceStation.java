import transport.Bus;
import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    public ServiceStation() {
        this.queue = new LinkedList<>();
    }

    public void addAuto(Transport auto) {
        if (auto instanceof Bus) {
            System.out.println("Автобусы не проходят техослуживание");
        } else {
            queue.add(auto);
        }
    }

    public void serviceAuto() {
        queue.poll();
    }
}
