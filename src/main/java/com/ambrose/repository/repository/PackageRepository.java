package com.ambrose.repository.repository;

import com.ambrose.repository.entities.Destination;
import com.ambrose.repository.entities.Package;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package, String> {
  Package findById(Long id);

  Package findByStatusIsTrueAndId(Long id);

  List<Package> findAllByStatusIsTrue(Pageable pageable);

  Long countAllByStatusIsTrue();
}
