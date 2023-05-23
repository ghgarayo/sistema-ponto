package com.lbe.sistemaponto.domain.ponto;

import java.time.LocalDate;
import java.time.LocalTime;

public record DadosDetalhamentoPonto(Long idPonto, LocalDate data, LocalTime horario, String tipo, String latitude, String longitude) {
  
  public DadosDetalhamentoPonto(Ponto ponto){
    this(ponto.getIdPonto(), ponto.getData(), ponto.getHorario(), ponto.getTipo(), ponto.getLatitude(), ponto.getLongitude());
  }


}
