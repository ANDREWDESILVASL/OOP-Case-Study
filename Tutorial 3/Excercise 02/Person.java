public class Person {
    protected String myName; // name of the person
    protected int myAge;     // person's age
    protected String myGender; //"M" for male, "F" for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String toString() {
        return  myName + ", age: " + myAge + ", gender: " +myGender;
    }

    public String getName() {
        return myName;
    }

    public void setName(String myName) {
        this.myName = myName;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int myAge) {
        this.myAge = myAge;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String myGender) {
        this.myGender = myGender;
    }
}
