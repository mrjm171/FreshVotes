package co.uk.pickmefirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.uk.pickmefirst.domain.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}