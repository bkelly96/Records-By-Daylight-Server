package com.Kelly.RecordsByDaylight.repository;

import org.apache.catalina.connector.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository <Request, Long> {
}
