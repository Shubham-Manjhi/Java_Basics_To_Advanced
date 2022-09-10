package Person_Class;

public class Person
{
    public String name;
    public int age;
    public String country;

    // Declaration of Person.
    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Return Name of Person.
    public String getName() {
        return name;
    }

    // Return Age of Person.
    public int getAge() {
        return age;
    }

    // Return Country of Person.
    public String getCountry() {
        return country;
    }
}