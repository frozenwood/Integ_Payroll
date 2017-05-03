import javax.xml.ws.Endpoint;
import payroll.*;

public class GinaColeServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/payroll/GinaColePayroll",new GinaColePayroll());
    }
}