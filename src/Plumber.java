import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named(value = "plumber")
@RequestScoped
public class Plumber {
    private int id;

    private String name;
    private String contactNumber;
    private String serviceType;
    private double rating;
    private boolean availability;

    public Plumber() {
    }

    public Plumber(int id, String name, String contactNumber, String serviceType, double rating, boolean availability) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.serviceType = serviceType;
        this.rating = rating;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
