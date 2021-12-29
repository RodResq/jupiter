package br.com.jupiter.jupiter.entity;

import javax.persistence.*;

@Entity
@Table(name = "")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "cod_cliente", nullable = false)
    public String codCliente;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
