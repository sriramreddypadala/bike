// Assuming Bike class is properly defined with a constructor
public class Veh {
    public static void main(String[] args) {
        // Correct object creation
        Bike bike1 = new Bike("A123", 60);
        Bike bike2 = new Bike("A123", 80);
        Bike bike3 = new Bike("B456", 60);

        // Comparing bike1 with bike2 and bike3 using equals() and printing the result
        boolean isEqual1 = bike1.equals(bike2); // Should return true (same 'reg')
        boolean isEqual2 = bike1.equals(bike3); // Should return false (different 'reg')

        System.out.println("bike1 equals bike2: " + isEqual1); // Output: true
        System.out.println("bike1 equals bike3: " + isEqual2); // Output: false
        System.out.println(bike1.hashCode());
        System.out.println(bike2.hashCode());
        System.out.println(bike3.hashCode());

    }
}
