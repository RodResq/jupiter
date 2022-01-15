package br.com.jupiter.jupiter.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TIPO_PRODUTO")
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "ATIVO")
    private Integer ativo;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public TipoProduto() {
    }

    public TipoProduto(Long id, String descricao, Integer ativo, Produto produto) {
        this.id = id;
        this.descricao = descricao;
        this.ativo = ativo;
        this.produto = produto;
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

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoProduto that = (TipoProduto) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        if (ativo != null ? !ativo.equals(that.ativo) : that.ativo != null) return false;
        return produto != null ? produto.equals(that.produto) : that.produto == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (ativo != null ? ativo.hashCode() : 0);
        result = 31 * result + (produto != null ? produto.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TipoProduto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", ativo=" + ativo +
                ", produto=" + produto +
                '}';
    }
}
