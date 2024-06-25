package com.ambrose.repository.repository;

import com.ambrose.repository.entities.PackageInDestination;
import com.ambrose.repository.entities.ServiceInPackage;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ServiceInPackageRepository extends JpaRepository<ServiceInPackage, String> {
  ServiceInPackage findById(Long id);
  @Transactional
  Integer deleteAllByServiceeId(Long serviceId);

  @Query("SELECT pid FROM PackageInDestination pid "
      + "JOIN ServiceInPackage sip ON pid.id = sip.packageInDestination.id"
      + " WHERE sip.servicee.id = :serviceId")
  List<PackageInDestination> findPackageInDestinationsByServiceId(@Param("serviceId") Long serviceId);
}
