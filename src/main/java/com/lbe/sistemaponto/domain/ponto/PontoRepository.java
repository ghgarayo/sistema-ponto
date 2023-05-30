package com.lbe.sistemaponto.domain.ponto;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
  public Ponto findByDataCompleta(LocalDate dataCompleta);
}
