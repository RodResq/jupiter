package br.com.jupiter.jupiter.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "COD_CLIENTE", nullable = false, unique = true)
    public String codCliente;

    @Column(name = "DATA_HORA_ENTRADA", nullable = false)
    public Date dataHoraEntrada;

    @Column(name = "DATA_HORA_SAIDA")
    public Date dataHoraSaida;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "cliente_produto",
                joinColumns = @JoinColumn(name = "cliente_id"),
                inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private Set<Produto> produtos = new HashSet<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public Date getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Date dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        if (id != null ? !id.equals(cliente.id) : cliente.id != null) return false;
        if (codCliente != null ? !codCliente.equals(cliente.codCliente) : cliente.codCliente != null) return false;
        if (dataHoraEntrada != null ? !dataHoraEntrada.equals(cliente.dataHoraEntrada) : cliente.dataHoraEntrada != null)
            return false;
        if (dataHoraSaida != null ? !dataHoraSaida.equals(cliente.dataHoraSaida) : cliente.dataHoraSaida != null)
            return false;
        return produtos != null ? produtos.equals(cliente.produtos) : cliente.produtos == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codCliente != null ? codCliente.hashCode() : 0);
        result = 31 * result + (dataHoraEntrada != null ? dataHoraEntrada.hashCode() : 0);
        result = 31 * result + (dataHoraSaida != null ? dataHoraSaida.hashCode() : 0);
        result = 31 * result + (produtos != null ? produtos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente='" + codCliente + '\'' +
                ", dataHoraEntrada=" + dataHoraEntrada +
                ", dataHoraSaida=" + dataHoraSaida +
                ", produtos=" + produtos +
                '}';
    }
}
