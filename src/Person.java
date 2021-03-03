public abstract class Person {
    private Double power;
    private String location;

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "power=" + power +
                ", location='" + location + '\'' +
                '}';
    }
}
