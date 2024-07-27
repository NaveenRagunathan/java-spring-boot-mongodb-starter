package com.mongodb.starter.models;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {
    private String brand;
    private String model;
    private Float maxSpeedKmH;

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", maxSpeedKmH=" + maxSpeedKmH + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return Objects.equals(brand, carEntity.brand) && Objects.equals(model, carEntity.model) && Objects.equals(
                maxSpeedKmH, carEntity.maxSpeedKmH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, maxSpeedKmH);
    }
}
