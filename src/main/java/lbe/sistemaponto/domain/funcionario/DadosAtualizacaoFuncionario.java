package lbe.sistemaponto.domain.funcionario;

import jakarta.validation.constraints.NotNull;
import lbe.sistemaponto.domain.endereco.DadosEndereco;

public record DadosAtualizacaoFuncionario(

    @NotNull Long id,
    String nome,
    String telefone,
    String email,
    DadosEndereco endereco) {

}
