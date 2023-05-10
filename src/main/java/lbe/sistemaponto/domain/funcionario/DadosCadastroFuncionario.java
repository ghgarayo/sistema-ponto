package lbe.sistemaponto.domain.funcionario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lbe.sistemaponto.domain.endereco.DadosEndereco;

public record DadosCadastroFuncionario( 

    @NotBlank
    String nome,
    @NotBlank
    @Email 
    String email, 
    @NotBlank
    @Pattern(regexp = "\\d{10,11}")
    String telefone, 
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    String cpf, 
    @NotBlank
    String rg,
    @Valid
    DadosEndereco endereco) {

}