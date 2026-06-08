package model.entidades;

import java.math.BigDecimal;

public class VendaItem {

    private Venda venda;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal total;
    private BigDecimal descontoGeral;

    public VendaItem() {
    }

    public VendaItem(Venda venda, Produto produto, Integer quantidade, BigDecimal total, BigDecimal descontoGeral) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
        this.descontoGeral = descontoGeral;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDescontoGeral() {
        return descontoGeral;
    }

    public void setDescontoGeral(BigDecimal descontoGeral) {
        this.descontoGeral = descontoGeral;
    }
}
