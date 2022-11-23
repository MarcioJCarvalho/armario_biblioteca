package br.com.mjc.dto;

import br.com.mjc.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoDTO<T> {
    private T object;
    private Status status;
    private String mensagem;
}
