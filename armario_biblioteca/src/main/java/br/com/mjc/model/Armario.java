package br.com.mjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_armario")
public class Armario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "numero", unique = true, nullable = false)
    private String numero;

    @Column(name="ativo", nullable = false)
    private boolean ativo = true;
    
    @Column(name = "observacao", length = 250)
    private String observacao;
}
