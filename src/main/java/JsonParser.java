import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Converts a JSON string to a Java object of the specified class type.
     *
     * @param <T>    the type parameter of the class
     * @param json   the JSON string to be converted
     * @param clazz  the target class type
     * @return       the converted Java object
     * @throws IllegalArgumentException if JSON is invalid or conversion fails
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonMappingException e) {
            throw new IllegalArgumentException("Error mapping JSON to object: " + e.getMessage(), e);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Error processing JSON: " + e.getMessage(), e);
        }
    }

    /**
     * Converts a Java object to a JSON string.
     *
     * @param object the Java object to be converted
     * @return       the resulting JSON string
     * @throws IllegalArgumentException if object serialization fails
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Error converting object to JSON: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        // Example JSON
        String jsonData = "{" +
                "\"driverid\" : \"7\"," +
                "\"drivername\" : \"Vivek\"," +
                "\"drivercar\" : {" +
                "\"carname\" : \"Audi R8\"," +
                "\"carcate\" : \"Sports Car\"" +
                "}" +
                "}";

        // Converting JSON to Java Object
        Driver driver = fromJson(jsonData, Driver.class);
        System.out.println("Driver ID: " + driver.getId());
        System.out.println("Driver Name: " + driver.getName());

        Car car = driver.getCar();
        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Category: " + car.getCategory());

        // Converting Java Object to JSON
        String generatedJson = toJson(driver);
        System.out.println("Generated JSON: " + generatedJson);
    }
}
