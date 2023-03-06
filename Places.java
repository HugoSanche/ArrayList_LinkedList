import java.util.Objects;

public class Places {
    private String town;
    private Integer distance; 

    public Places(String town, Integer distance) {
        this.town = town;
        this.distance = distance;
    }

    public Places() {

    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }


    @Override
    public String toString() {
        return 
            " town " + getTown() + " distance= " + getDistance();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Places)) {
            return false;
        }
        Places places = (Places) o;
        return Objects.equals(town, places.town) && Objects.equals(distance, places.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(town, distance);
    }


}
