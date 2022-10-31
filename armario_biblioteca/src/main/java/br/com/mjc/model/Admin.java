package br.com.mjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_admin", uniqueConstraints = { @UniqueConstraint(name = "admin_unique", columnNames = {"nome", "cpf"})})
public class Admin extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name ="nome", nullable = false, length = 100)
    private String nome;

    @Column(name ="cpf", unique = true, nullable = false, length = 15)
    private String cpf;
}
