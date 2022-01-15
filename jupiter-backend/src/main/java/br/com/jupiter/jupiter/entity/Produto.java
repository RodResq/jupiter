package br.com.jupiter.jupiter.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "QUANTIDADE", nullable = false)
    private Integer quantidade;

    @ManyToMany(mappedBy = "produtos")
    private Set<Cliente> clientes = new HashSet<>();

    public Produto() {
    }

    public Produto(Long id, String descricao, Integer quantidade, Set<Cliente> clientes) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.clientes = clientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        if (id != null ? !id.equals(produto.id) : produto.id != null) return false;
        if (descricao != null ? !descricao.equals(produto.descricao) : produto.descricao != null) return false;
        if (quantidade != null ? !quantidade.equals(produto.quantidade) : produto.quantidade != null) return false;
        return clientes != null ? clientes.equals(produto.clientes) : produto.clientes == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (quantidade != null ? quantidade.hashCode() : 0);
        result = 31 * result + (clientes != null ? clientes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", clientes=" + clientes +
                '}';
    }
}
