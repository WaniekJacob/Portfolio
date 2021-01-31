package de.dhbw.ravensburg.wp.projektarbeit.repository;

import de.dhbw.ravensburg.wp.projektarbeit.models.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <TransactionModel,Long> {
}
