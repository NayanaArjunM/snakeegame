public class Course {
    private String name;
    private int creditHours;

    public Course(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
}
