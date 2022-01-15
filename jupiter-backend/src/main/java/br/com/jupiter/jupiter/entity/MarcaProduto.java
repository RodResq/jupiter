package br.com.jupiter.jupiter.entity;

import javax.persistence.*;

@Entity
@Table(name = "MARCA_PRODUTO")
public class MarcaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marcaproduto_id")
    private TipoProduto tipoProduto;

    public MarcaProduto() {
    }

    public MarcaProduto(Long id, String descricao, TipoProduto tipoProduto) {
        this.id = id;
        this.descricao = descricao;
        this.tipoProduto = tipoProduto;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcaProduto that = (MarcaProduto) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;
        return tipoProduto != null ? tipoProduto.equals(that.tipoProduto) : that.tipoProduto == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (tipoProduto != null ? tipoProduto.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MarcaProduto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", tipoProduto=" + tipoProduto +
                '}';
    }
}
