package de.dhbw.ravensburg.wp.projektarbeit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class SupplierModel {

    @Id
    private long supplierId;
    private String name;
    private String address;
    private String commercialClassification;
}
