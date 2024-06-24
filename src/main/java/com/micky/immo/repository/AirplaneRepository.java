package com.micky.immo.repository;
import com.micky.immo.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository  extends JpaRepository<Airplane, Long> {

}
