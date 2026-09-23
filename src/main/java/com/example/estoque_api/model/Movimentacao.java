package com.example.estoque_api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TB_MOVIMENTACAO")
@Data
public class Movimentacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1)
    private String tipo;
    private LocalDate data;
    private int quantidade;
    @Column(precision = 6, scale = 2)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "cliente_id_fk")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "produto_id_fk")
    private Produto produto;
}
