package com.lbe.sistemaponto.domain.usuario;

public record DadosDetalhamentoUsuario(Long id, String login, String senha) {

    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.getSenha());
    }
}
