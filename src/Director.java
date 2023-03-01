public class Director {

    private String direcctorName;
  private String lastName;


    public Director(String direcctorName, String lastName) {
        this.direcctorName = direcctorName;
        this.lastName = lastName;
    }

    public String getDirecctorName() {
        return direcctorName;
    }

    public void setDirecctorName(String direcctorName) {
        this.direcctorName = direcctorName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + direcctorName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
