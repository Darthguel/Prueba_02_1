package com.example.prueba_02;

public class Producto {

    private int codigo;
        private String producto;
        private int precio;

        public Producto() {}

        public Producto(int codigo, String producto, int precio) {
            this.codigo = codigo;
            this.producto = producto;
            this.precio = precio;
        }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
