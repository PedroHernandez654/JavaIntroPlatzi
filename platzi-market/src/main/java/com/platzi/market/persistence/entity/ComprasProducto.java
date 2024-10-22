package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table (name = "compras_productos")
public class ComprasProducto {

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @EmbeddedId
    private ComprasProductoPK  id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne//Todas las anotaciones que contengan JoinColumn y ManyToOne deben llevar inserable false y updatable false
    @JoinColumn(name = "id_compra", insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false,updatable = false)
    private Producto producto;

}
