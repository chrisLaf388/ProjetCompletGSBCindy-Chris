package com.ecolepratique.medicament2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecolepratique.medicament2.entite.Medicament;

public interface MedicamentDaoItf extends JpaRepository<Medicament, Long>{

}
