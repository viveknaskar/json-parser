import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

    @JsonProperty("carname")
    private String name;

    @JsonProperty("carcategory")
    @JsonAlias({"carcate","cartype"})
    private String category;

    public Car(){};

    public Car(String name, String category){
        this.name=name;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
