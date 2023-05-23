package com.lbe.sistemaponto.domain.ponto;
import com.lbe.sistemaponto.domain.funcionario.DadosPontoFuncionario;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.*;

@Table(name="registroponto")
@Entity(name="Ponto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idPonto")
public class Ponto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPonto;
  private LocalDate data;
  private LocalTime horario;
  private String tipo;
  private String latitude;
  private String longitude;

  @Embedded
  private DadosPontoFuncionario funcionario;
  
  @Column(name = "is_adjusted")
  private boolean isAdjusted;

  public Ponto(DadosBatidaPonto dados){
    this.isAdjusted = false;
    this.data = dados.data();
    this.horario = dados.horario();
    this.tipo = dados.tipo();
    this.latitude = dados.latitude();
    this.longitude = dados.longitude();
    this.funcionario = dados.funcionario();
  }

}
