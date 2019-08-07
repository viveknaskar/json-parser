import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver {

    @JsonProperty("driverid")
    private String id;

    @JsonProperty("drivername")
    private String name;

    @JsonProperty("drivercar")
    private Car car;

    public Driver(String id, String name, Car car) {
        this.id = id;
        this.name = name;
        this.car = car;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
