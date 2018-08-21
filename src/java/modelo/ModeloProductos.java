/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author sergio
 */
public class ModeloProductos extends Conexion{
    
    public boolean crear_producto(Producto p){
        
        PreparedStatement pst = null;
        boolean flag = false;
        
        
        try {
            
            
            String sql =  "insert into productos (nombre,descripcion,precio,categoria,detalls,reviews,size,color,imagen_1,imagen_2,imagen_3,imagen_4,imagen_5) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            pst =getConnection().prepareStatement(sql);
            
            
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getDescripcion());
            pst.setFloat(3, p.getPrecio());
            pst.setString(4, p.getCategoria());
            pst.setString(5, p.getDetalls() );
            pst.setString(6,p.getReviews());
            pst.setInt(7, p.getSize());
            pst.setString(8, p.getColor());
            pst.setString(9, p.getImg1());
            pst.setString(10, p.getImg2());
            pst.setString(11, p.getImg3());
            pst.setString(12, p.getImg4());
            pst.setString(13, p.getImg5());
            
            System.out.println(p.toString());
            
            
            if(pst.executeUpdate()==1){
                flag=true;
                
            }
            
        
            
            
        } catch (Exception e) {
            System.out.println("error " + e );
        }finally{
            try {
                if(getConnection() != null)  getConnection().close();{
                    
                }
            } catch (Exception e) {
                System.out.println("error 2" + e );
            }
        }
        
        
        
        
      
        
        
        return flag;
        
    }
    
    public ArrayList<Producto> getAllProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        
        PreparedStatement pst = null;
        ResultSet rs= null;
        
        try {
            
            String sql = "call selectAllProductos()";
            pst=getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                
                productos.add(new Producto(rs.getInt("id_producto"), rs.getString("nombre"), rs.getString("descripcion"), rs.getFloat("precio"), 
                        rs.getString("categoria"), rs.getString("detalls"), rs.getString("reviews"), rs.getInt("size"), rs.getString("color"),
                        rs.getString("imagen_1"), rs.getString("imagen_2"), rs.getString("imagen_3"), rs.getString("imagen_4"), rs.getString("imagen_5")));
                
                
            }
            
            
            
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection()!=null)getConnection().close();
                if(pst !=null )pst.close();
                if(rs !=null)rs.close();
                
            } catch (Exception e) {
                
            }
            
            
        }
        
        
        return productos;
        
        
    }
    
    
    
    

    /*public static void main(String[] args) {
        ModeloProductos mp = new ModeloProductos();
        for (Producto p : mp.getAllProductos()) {
            System.out.println(p.getNombre());
            System.out.println(p.getImg3());
                   
            
        }
    }*/
    
    
    public Producto getProducto(int idProducto){
      Producto producto = null;
        
        PreparedStatement pst = null;
        ResultSet rs= null;
        
        try {
            
            String sql = "select * from productos where id_producto = ? ";
            pst=getConnection().prepareCall(sql);
            pst.setInt(1, idProducto);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                
                producto = new Producto(rs.getInt("id_producto"), rs.getString("nombre"), rs.getString("descripcion"), rs.getFloat("precio"), 
                        rs.getString("categoria"), rs.getString("detalls"), rs.getString("reviews"), rs.getInt("size"), rs.getString("color"),
                        rs.getString("imagen_1"), rs.getString("imagen_2"), rs.getString("imagen_3"), rs.getString("imagen_4"), rs.getString("imagen_5"));
                
                
            }
            
            
            
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection()!=null)getConnection().close();
                if(pst !=null )pst.close();
                if(rs !=null)rs.close();
                
            } catch (Exception e) {
                
            }
            
            
        }
        
        
        return producto;
        
        
    }
    
    public boolean deleteProducto(int idProducto){
        
        boolean flag=false;
        
        
         PreparedStatement pst = null;
       
        
        try {
            
            String sql = "DELETE FROM productos WHERE id_producto= ?";
            pst=getConnection().prepareCall(sql);
            pst.setInt(1, idProducto);
            
            
            if(pst.executeUpdate()==1){
                flag =true;
                
            }
           
            
          
            
            
            
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection()!=null)getConnection().close();
                if(pst !=null )pst.close();
               
                
            } catch (Exception e) {
                
            }
            
            
        }
        
        
        
        return flag;
        
    }
    
  
   

    
    
}

