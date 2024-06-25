package com.ambrose.repository.repository;

import com.ambrose.repository.entities.Package;
import com.ambrose.repository.entities.PackageInDay;
import com.ambrose.repository.entities.PackageInDestination;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PackageInDayRepository extends JpaRepository<PackageInDay, String> {

  PackageInDay findById(Long id);

}
