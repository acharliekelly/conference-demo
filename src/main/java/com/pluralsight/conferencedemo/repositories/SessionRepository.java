package com.pluralsight.conferencedemo.repositories;

import org.springframework.data.jpa.respository.JpaRepository;
import com.pluralsight.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
