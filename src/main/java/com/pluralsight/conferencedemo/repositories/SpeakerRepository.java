package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.data.jpa.respository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
