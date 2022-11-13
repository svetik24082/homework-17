import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation { //<T extends Transport>{
    private final Queue <Transport> transports = new ArrayDeque<>();

    private void add (Transport transport){
        transports.offer(transport);

    }
    public void addCar (Car car){
        add(car);
    }
    public void addCargo (Cargo cargo) {
        add(cargo);
    }
    public void service(){// провести тех.осм
        if (!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.service();
            if (!result){
                transport.repair();
            System.out.println( );
        }

}}}
