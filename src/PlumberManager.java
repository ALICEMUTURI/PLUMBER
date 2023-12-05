import java.util.ArrayList;
import java.util.List;

public class PlumberManager {
    private List<Plumber> plumbers;

    public PlumberManager() {
        this.plumbers = new ArrayList<>();
    }

    public void addPlumber(Plumber plumber) {
        this.plumbers.add(plumber);
    }

    public List<Plumber> getPlumbers() {
        return this.plumbers;
    }

    public Plumber getPlumberById(int id) {
        for (Plumber plumber : this.plumbers) {
            if (plumber.getId() == id) {
                return plumber;
            }
        }
        return null;
    }

    public void updatePlumber(Plumber plumber) {
        for (int i = 0; i < this.plumbers.size(); i++) {
            if (this.plumbers.get(i).getId() == plumber.getId()) {
                this.plumbers.set(i, plumber);
                break;
            }
        }
    }
}

