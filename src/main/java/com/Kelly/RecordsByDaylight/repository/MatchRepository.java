package com.Kelly.RecordsByDaylight.repository;

import com.Kelly.RecordsByDaylight.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository <Match, Long>{

    @Query(value = "SELECT char_Name FROM Match GROUP BY char_Name ORDER BY COUNT(char_Name) DESC limit 1", nativeQuery = true)
    String findPopularCharacter();

    @Query(value = "SELECT map FROM Match GROUP BY map ORDER BY COUNT(map) DESC limit 1", nativeQuery = true)
    String findPopularMap();

    @Query(value = "SELECT perk1 FROM Match GROUP BY perk1 ORDER BY COUNT(perk1) DESC limit 1", nativeQuery = true)
    String findPopularPerk1();

    @Query(value = "SELECT perk2 FROM Match GROUP BY perk2 ORDER BY COUNT(perk2) DESC limit 1", nativeQuery = true)
    String findPopularPerk2();

    @Query(value = "SELECT perk3 FROM Match GROUP BY perk3 ORDER BY COUNT(perk3) DESC limit 1", nativeQuery = true)
    String findPopularPerk3();

    @Query(value = "SELECT perk4 FROM Match GROUP BY perk4 ORDER BY COUNT(perk4) DESC limit 1", nativeQuery = true)
    String findPopularPerk4();


}
