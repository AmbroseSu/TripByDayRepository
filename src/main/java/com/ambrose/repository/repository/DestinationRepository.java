package com.ambrose.repository.repository;

import com.ambrose.repository.entities.Destination;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, String> {

  Destination findById(Long id);

  List<Destination> findAllByCityId(Long cityId);
  Destination findByStatusIsTrueAndId(Long id);
  List<Destination> findAllByStatusIsTrue(Pageable pageable);
  Long countAllByStatusIsTrue();
}
