/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sergio
 */
public class Producto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private String categoria;
    private String detalls;
    private String reviews;
    private int size;
    private String color;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, float precio, String categoria, String detalls, String reviews, 
            int size, String color, String img1, String img2, String img3, String img4, String img5) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.detalls = detalls;
        this.reviews = reviews;
        this.size = size;
        this.color = color;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
    }
    
    
    
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the detalls
     */
    public String getDetalls() {
        return detalls;
    }

    /**
     * @param detalls the detalls to set
     */
    public void setDetalls(String detalls) {
        this.detalls = detalls;
    }

    /**
     * @return the reviews
     */
    public String getReviews() {
        return reviews;
    }

    /**
     * @param reviews the reviews to set
     */
    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the img1
     */
    public String getImg1() {
        return img1;
    }

    /**
     * @param img1 the img1 to set
     */
    public void setImg1(String img1) {
        this.img1 = img1;
    }

    /**
     * @return the img2
     */
    public String getImg2() {
        return img2;
    }

    /**
     * @param img2 the img2 to set
     */
    public void setImg2(String img2) {
        this.img2 = img2;
    }

    /**
     * @return the img3
     */
    public String getImg3() {
        return img3;
    }

    /**
     * @param img3 the img3 to set
     */
    public void setImg3(String img3) {
        this.img3 = img3;
    }

    /**
     * @return the img4
     */
    public String getImg4() {
        return img4;
    }

    /**
     * @param img4 the img4 to set
     */
    public void setImg4(String img4) {
        this.img4 = img4;
    }

    /**
     * @return the img5
     */
    public String getImg5() {
        return img5;
    }

    /**
     * @param img5 the img5 to set
     */
    public void setImg5(String img5) {
        this.img5 = img5;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + ", detalls=" + detalls + ", reviews=" + reviews + ", size=" + size + ", color=" + color + ", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3 + ", img4=" + img4 + ", img5=" + img5 + '}';
    }
    
    
    
   
    
    
}
