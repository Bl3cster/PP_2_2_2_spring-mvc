package web.model;
import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private float enjine;

    public Car(int id, String model, float enjine) {
        this.id = id;
        this.model = model;
        this.enjine = enjine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEnjine() {
        return enjine;
    }

    public void setEnjine(float enjine) {
        this.enjine = enjine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Float.compare(car.enjine, enjine) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, enjine);
    }
}
