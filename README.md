# JSON Parser

**JSON Parser** is a simple Java-based utility for converting JSON strings into Java objects and vice versa using Jackson.

## Features
- Convert JSON strings to Java objects.
- Convert Java objects to JSON strings.
- Uses Jackson for efficient serialization and deserialization.

## Dependencies
- Java 17 (can use 8+)
- Jackson Databind

## Usage
### Example JSON Data
```json
{
  "driverid": "7",
  "drivername": "Vivek",
  "drivercar": {
    "carname": "Audi R8",
    "carcate": "Sports Car"
  }
}
```

### Java Code Example
```java
String jsonData = "{" +
        "\"driverid\" : \"7\"," +
        "\"drivername\" : \"Vivek\"," +
        "\"drivercar\" : {" +
        "\"carname\" : \"Audi R8\"," +
        "\"carcate\" : \"Sports Car\"" +
        "}" +
        "}";

Driver driver = JsonParser.fromJson(jsonData, Driver.class);
System.out.println("Driver Name: " + driver.getName());
System.out.println("Car Name: " + driver.getCar().getName());

String generatedJson = JsonParser.toJson(driver);
System.out.println("Generated JSON: " + generatedJson);
```

## License
MIT License

