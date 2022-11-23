package br.com.mjc.utils;

import br.com.mjc.dto.InfoDTO;
import br.com.mjc.enums.Status;

public class Validador {

    public static InfoDTO confirmarSenha(String senha, String confirmacaoSenha) {
        InfoDTO infoDTO = new InfoDTO();
        if (senha.equals(confirmacaoSenha)) {
            infoDTO.setObject(senha);
            infoDTO.setStatus(Status.SUCESSO);
        } else {
            infoDTO.setStatus(Status.ERRO);
            infoDTO.setMensagem("As senhas não conferem!");
        }
        return infoDTO;
    }
}
