package com.example.estoque_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TB_ENDERECO")
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    @Column(length = 10)
    private String numero;
    private String bairro;
    private String cidade;
    @Column(length = 2)
    private String estado;
    @Column(length = 9)
    private String cep;

    @OneToOne
    @JoinColumn(name = "cliente_id_fk")
    private Cliente cliente;

}
