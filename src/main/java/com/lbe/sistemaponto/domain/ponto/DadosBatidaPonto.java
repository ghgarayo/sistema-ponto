package com.lbe.sistemaponto.domain.ponto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.lbe.sistemaponto.domain.funcionario.DadosPontoFuncionario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosBatidaPonto(
  @NotNull
  LocalDate data,
  @NotNull
  LocalTime horario,
  @NotBlank
  String tipo,
  @NotBlank
  String latitude,
  @NotBlank
  String longitude,
  @Valid
  DadosPontoFuncionario funcionario
) {
  
}
