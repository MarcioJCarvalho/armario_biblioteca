package br.com.mjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "data_hora_devolucao")
    private LocalDateTime dataHoraDevolucao;

    @Column(name = "data_hora_emprestimo", columnDefinition = "bit default 1")
    private LocalDateTime dataHoraEmprestimo = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;

    @ManyToOne
    @JoinColumn(name = "armario_id")
    private Armario armario;
    
}
