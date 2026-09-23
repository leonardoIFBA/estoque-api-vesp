package com.example.estoque_api.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TB_PRODUTO")
@Data               // Gera getters, setters, equals, hashCode e toString
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(precision = 6, scale = 2)
    private BigDecimal valor;
    private int estoque;
    @Column(length = 5)
    private String unidade;

    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
    private List<Movimentacao> movimentacoes;

}
