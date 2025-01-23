public class Bike {
     String reg;
     int speed;

    // Constructor to initialize the fields
    public Bike(String reg, int speed) {
        this.reg = reg;
        this.speed = speed;
    }

    // Getter and setter methods
    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Correctly overriding the toString method
    @Override
    public String toString() {
        return "Bike{" +
                "reg='" + reg + '\'' +
                ", speed=" + speed +
                '}';
    }

    // Correctly overriding the equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check if both references point to the same object
        if (o == null || getClass() != o.getClass()) return false; // Check null or different class
        Bike b = (Bike) o; // Safe cast to Bike
        return this.reg.equals(b.reg); // Compare the 'reg' field
    }

    // Optional: Override hashCode (to maintain the contract with equals)
    @Override
    public int hashCode() {
        return reg.hashCode();
    }
}
