import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONToObject {
    public static void main(String args[]) throws IOException {

        String jsonData =
                "{"
                        +"\"driverid\" : 7,"
                        +"\"drivername\" : \"Vivek\","
                        +"\"drivercar\" : {"
                        +"\"carname\" : \"Audi R8\","
                        +"\"carcate\" : \"Sports Car\""
                        +"}"
                 +"}";

        ObjectMapper objectMapper = new ObjectMapper();
        Driver driver = objectMapper.readValue(jsonData, Driver.class);
        System.out.println(driver.getId()+", "+driver.getName());
        Car car = driver.getCar();
        System.out.println(car.getName()+", "+ car.getCategory());


    }
}
