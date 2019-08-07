# json-to-object

This simple class converts JSON data to java project using properties of Jackson.

Technologies used:

1. openjdk version "11.0.3" 2019-04-16
2. Gradle 5.2.1
3. Jackson 2.9.9
4. IntelliJ Idea 2019.2

Jackson Annotations:

@JsonProperty defines a logical property used in serialization and deserialization of JSON. When we set JSON data to Java Object, it is called JSON deserialization and when we get JSON data from Java Object, it is called JSON serialization. @JsonProperty can change the visibility of logical property using its access element during serialization and deserialization of JSON. @JsonAlias defines one or more alternative names for a property to be accepted during deserialization. At the time of serialization only actual logical property name is used and not alias. 
