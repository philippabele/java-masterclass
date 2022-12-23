package Section07OopInheritance.Exercise31Person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName.isEmpty() ? "" : firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName.isEmpty() ? "" : lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20) ? true : false;
    }

    public String getFullName() {

        if (this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            return this.lastName;
        } else if (!this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return this.firstName;
        } else if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else {
            return this.firstName + " " + this.lastName;
        }

    }

}
