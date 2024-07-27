package com.mongodb.starter.models;

import org.bson.types.ObjectId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

    private ObjectId id;
    private String firstName;
    private String lastName;
    private int age;
    private AddressEntity addressEntity;
    private Date createdAt = new Date();
    private Boolean insurance;
    private List<CarEntity> carEntities;
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", address=" + addressEntity + ", createdAt=" + createdAt + ", insurance=" + insurance + ", cars=" + carEntities + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity personEntity = (PersonEntity) o;
        return age == personEntity.age && Objects.equals(id, personEntity.id) && Objects.equals(firstName,
                                                                                                personEntity.firstName) && Objects.equals(
                lastName, personEntity.lastName) && Objects.equals(addressEntity,
                                                                   personEntity.addressEntity) && Objects.equals(
                createdAt, personEntity.createdAt) && Objects.equals(insurance,
                                                                     personEntity.insurance) && Objects.equals(
                carEntities, personEntity.carEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, addressEntity, createdAt, insurance, carEntities);
    }

}
