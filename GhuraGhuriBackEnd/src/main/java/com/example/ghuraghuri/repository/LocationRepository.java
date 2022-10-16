package com.example.ghuraghuri.repository;

import com.example.ghuraghuri.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {
  /*  List<Location> findByNameContaining(String name);
    List<Location> findByDivisionContaining(String division);*/
  List<Location> findByOrderByNameAsc();
  List<Location> findByOrderByNameDesc();
  List<Location> findById(int id);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% ORDER BY l.name ASC", nativeQuery = true)
  List<Location> findByNameContainingOrderByNameAsc(String name);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% ORDER BY l.name DESC", nativeQuery = true)
  List<Location> findByNameContainingOrderByNameDesc(String name);

  List<Location> findByDivisionOrderByNameAsc(String division);
  List<Location> findByDivisionOrderByNameDesc(String division);

  List<Location> findByTypeOrderByNameAsc(String division);
  List<Location> findByTypeOrderByNameDesc(String division);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% AND l.division=?2 ORDER BY l.name ASC", nativeQuery = true)
  List<Location> findByNameContainingAndDivisionOrderByNameAsc(String name, String division);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% AND l.division=?2 ORDER BY l.name DESC", nativeQuery = true)
  List<Location> findByNameContainingAndDivisionOrderByNameDesc(String name, String division);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% AND l.type=?2 ORDER BY l.name ASC", nativeQuery = true)
  List<Location> findByNameContainingAndTypeOrderByNameAsc(String name, String type);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% AND l.type=?2 ORDER BY l.name DESC", nativeQuery = true)
  List<Location> findByNameContainingAndTypeOrderByNameDesc(String name, String type);

  @Query(value = "SELECT * FROM location l WHERE l.division=?1 AND l.type=?2 ORDER BY l.name ASC", nativeQuery = true)
  List<Location> findByDivisionAndTypeOrderByNameAsc(String division, String type);

  @Query(value = "SELECT * FROM location l WHERE l.division=?1 AND l.type=?2 ORDER BY l.name DESC", nativeQuery = true)
  List<Location> findByDivisionAndTypeOrderByNameDesc(String division, String type);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% AND l.division=?2 AND l.type=?3 ORDER BY l.name ASC", nativeQuery = true)
  List<Location> findByNameContainingAndDivisionAndTypeOrderByNameAsc(String name, String division, String type);

  @Query(value = "SELECT * FROM location l WHERE l.name LIKE %?1% AND l.division=?2 AND l.type=?3 ORDER BY l.name DESC", nativeQuery = true)
  List<Location> findByNameContainingAndDivisionAndTypeOrderByNameDesc(String name, String division, String type);

}
