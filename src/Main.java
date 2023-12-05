public class Main {
    public static void main(String[] args) {
        Plumber plumber = new Plumber(1, "John Doe", "123-456-7890", "Plumbing", 4.5, true);

        System.out.println("Plumber ID: " + plumber.getId());
        System.out.println("Plumber Name: " + plumber.getName());
        System.out.println("Plumber Contact Number: " + plumber.getContactNumber());
        System.out.println("Plumber Service Type: " + plumber.getServiceType());
        System.out.println("Plumber Rating: " + plumber.getRating());
        System.out.println("Plumber Availability: " + plumber.isAvailability());
    }
}

