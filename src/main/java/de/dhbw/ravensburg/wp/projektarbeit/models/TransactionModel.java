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
public class TransactionModel {

    @Id
    private long id;
    private String description;
    private long customerId;
    private long supplierId;
    private double purchaseSum;


}
