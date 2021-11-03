package com.Kelly.RecordsByDaylight.repository;

import com.Kelly.RecordsByDaylight.model.Loadout;
import com.Kelly.RecordsByDaylight.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoadoutRepository extends JpaRepository <Loadout, Long>
{
}
