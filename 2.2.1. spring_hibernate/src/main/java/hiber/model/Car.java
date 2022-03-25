package hiber.model;

import javax.persistence.*;

@Entity
@Table (name = "car")
public class Car {

    @Id
    @Column (name = "car_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "model")
    private String model;

    @Column (name = "series")
    private Integer series;

    @OneToOne (mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car() {}

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public Integer getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
