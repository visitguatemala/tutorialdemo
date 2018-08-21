/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.ModeloProductos;
import modelo.Producto;

/**
 *
 * @author sergio
 */
public class ControladorProductos {

    public boolean crearProducto(Producto p) {
        ModeloProductos modeloP = new ModeloProductos();
        return modeloP.crear_producto(p);

    }

    public String getViewProductos() {
        String htmlcode = "";

        ModeloProductos modelop = new ModeloProductos();

        int i = 0;

        for (Producto p : modelop.getAllProductos()) {

            if (i % 3 == 0) {
                htmlcode += "<div class=\"box1\">";
            }

            htmlcode += "<div class=\"col_1_of_3 span_1_of_3\"><a href='detalles.jsp?idproducto=" + p.getId() + "'>\n"
                    + "				     <div class=\"view view-fifth\">\n"
                    + "				  	  <div class=\"top_box\">\n"
                    + "					  	<h3 class=\"m_1\">" + p.getNombre() + "</h3>\n"
                    + "					  	<p class=\"m_2\">" + p.getDescripcion() + "</p>\n"
                    + "				         <div class=\"grid_img\">\n"
                    + "						   <div class=\"css3\"><img src=" + p.getImg2() + " alt=\"\"/></div>\n"
                    + "					          <div class=\"mask\">\n"
                    + "	                       		<div class=\"info\">Quick View</div>\n"
                    + "			                  </div>\n"
                    + "	                    </div>\n"
                    + "                       <div class=\"price\">Q" + p.getPrecio() + "</div>\n"
                    + "					   </div>\n"
                    + "					    </div>\n"
                    + "					   <span class=\"rating\">\n"
                    + "				        <input type=\"radio\" class=\"rating-input\" id=\"rating-input-1-5\" name=\"rating-input-1\">\n"
                    + "				        <label for=\"rating-input-1-5\" class=\"rating-star1\"></label>\n"
                    + "				        <input type=\"radio\" class=\"rating-input\" id=\"rating-input-1-4\" name=\"rating-input-1\">\n"
                    + "				        <label for=\"rating-input-1-4\" class=\"rating-star1\"></label>\n"
                    + "				        <input type=\"radio\" class=\"rating-input\" id=\"rating-input-1-3\" name=\"rating-input-1\">\n"
                    + "				        <label for=\"rating-input-1-3\" class=\"rating-star1\"></label>\n"
                    + "				        <input type=\"radio\" class=\"rating-input\" id=\"rating-input-1-2\" name=\"rating-input-1\">\n"
                    + "				        <label for=\"rating-input-1-2\" class=\"rating-star\"></label>\n"
                    + "				        <input type=\"radio\" class=\"rating-input\" id=\"rating-input-1-1\" name=\"rating-input-1\">\n"
                    + "				        <label for=\"rating-input-1-1\" class=\"rating-star\"></label>&nbsp;\n"
                    + "		        	  (45)\n"
                    + "		    	      </span>\n"
                    + "						 <ul class=\"list\">\n"
                    + "						  <li>\n"
                    + "						  	<img src=\"images/plus.png\" alt=\"\"/>\n"
                    + "						  	<ul class=\"icon1 sub-icon1 profile_img\">\n"
                    + "							  <li><a class=\"active-icon c1\" href=\"#\">Add To Bag </a>\n"
                    + "								<ul class=\"sub-icon1 list\">\n"
                    + "									<li><h3>sed diam nonummy</h3><a href=\"\"></a></li>\n"
                    + "									<li><p>Lorem ipsum dolor sit amet, consectetuer  <a href=\"\">adipiscing elit, sed diam</a></p></li>\n"
                    + "								</ul>\n"
                    + "							  </li>\n"
                    + "							 </ul>\n"
                    + "						   </li>\n"
                    + "					     </ul>\n"
                    + "			    	    <div class=\"clear\"></div>\n"
                    + "			    	</a></div>";

            if ((i + 1) % 3 == 0) {

                htmlcode += "<div class=\"clear\"></div>\n"
                        + "			    </div>";

            }
            i++;

        }

        return htmlcode;
    }

    public String getDetallesProductos(int idProducto) {

        String htmlcode = "";
        Producto pr = new ModeloProductos().getProducto(idProducto);

        htmlcode = " <div class='single'>\n"
                + "\n"
                + "<div class='cont span_2_of_3'>\n"
                + "  <div class='labout span_1_of_a1'>\n"
                + "  <!-- start product_slider -->\n"
                + "     <ul id='etalage'>\n"
                + "         <li>\n"
                + "		<a href=\"optionallink.html\">\n"
                + "                 <img class=\"etalage_thumb_image\" src='" + pr.getImg1() + "' />\n"
                + "                 <img class=\"etalage_source_image\" src='" + pr.getImg1() + "' />\n"
                + "		</a>\n"
                + "         </li>\n"
                + "         <li>\n"
                + "             <img class=\"etalage_thumb_image\" src='" + pr.getImg2() + "' />\n"
                + "		<img class=\"etalage_source_image\" src='" + pr.getImg2() + "' />\n"
                + "         </li>\n"
                + "         <li>\n"
                + "             <img class=\"etalage_thumb_image\" src='" + pr.getImg3() + "' />\n"
                + "		<img class=\"etalage_source_image\" src='" + pr.getImg3() + "' />\n"
                + "         </li>\n"
                + "         <li>\n"
                + "		<img class=\"etalage_thumb_image\" src='" + pr.getImg4() + "' />\n"
                + "		<img class=\"etalage_source_image\" src='" + pr.getImg4() + "' />\n"
                + "         </li>\n"
                + "         <li>\n"
                + "		<img class=\"etalage_thumb_image\" src='" + pr.getImg5() + "' />\n"
                + "		<img class=\"etalage_source_image\" src='" + pr.getImg5() + "' />\n"
                + "         </li>\n"
                + "	</ul>\n"
                + "	\n"
                + "	\n"
                + " <!-- end product_slider -->\n"
                + " </div>\n"
                + "<div class=\"cont1 span_2_of_a1\">\n"
                + " <h3 class=\"m_3\">" + pr.getNombre() + "</h3>\n"
                + " \n"
                + " <div class=\"price_single\">\n"
                + "  \n"
                + " <span class=\"actual\">$" + pr.getPrecio() + "</span><a href=\"#\">click for offer</a>\n"
                + "							</div>\n"
                + "				<ul class=\"options\">\n"
                + "					<h4 class=\"m_9\">Select a Size</h4>\n"
                + "					<li><a href=\"#\">" + pr.getSize() + "</a></li>\n"
                + "					<div class=\"clear\"></div>\n"
                + "				</ul>\n"
                + "				<div class=\"btn_form\">\n"
                + "				   <form>\n"
                + "					 <input type=\"submit\" value=\"buy now\" title=\"\">\n"
                + "				  </form>\n"
                + "				</div>\n"
                + "				<ul class=\"add-to-links\">\n"
                + "    			   <li><img src=\"images/wish.png\" alt=\"\"/><a href=\"#\">Add to wishlist</a></li>\n"
                + "    			</ul>\n"
                + "    			<p class=\"m_desc\">" + pr.getDescripcion() + "</p>\n"
                + "    			\n"
                + "                <div class=\"social_single\">	\n"
                + "				   <ul>	\n"
                + "					  <li class=\"fb\"><a href=\"#\"><span> </span></a></li>\n"
                + "					  <li class=\"tw\"><a href=\"#\"><span> </span></a></li>\n"
                + "					  <li class=\"g_plus\"><a href=\"#\"><span> </span></a></li>\n"
                + "					  <li class=\"rss\"><a href=\"#\"><span> </span></a></li>		\n"
                + "				   </ul>\n"
                + "			    </div>\n"
                + "			</div>\n"
                + "			<div class=\"clear\"></div>\n"
                + "     \n"
                + "     \n"
                + "       \n"
                + "	   \n"
                + "	 <div class=\"toogle\">\n"
                + "     	<h3 class=\"m_3\">Product Details</h3>\n"
                + "     	<p class=\"m_text\">" + pr.getDetalls() + "</p>\n"
                + "     </div>					\n"
                + "	 <div class=\"toogle\">\n"
                + "     	<h3 class=\"m_3\">Product Reviews</h3>\n"
                + "     	<p class=\"m_text\">" + pr.getReviews() + "</p>\n"
                + "     </div>\n"
                + "     </div>\n"
                + "     <div class=\"clear\"></div>\n"
                + "	 \n"
                + "	 \n"
                + "       </div>";

        return htmlcode;

    }
    
    
    public String getPanelView(){
        
        String htmlcode = "";
        
        ModeloProductos mp = new ModeloProductos();
        ArrayList<Producto> productos = mp.getAllProductos();
        
        
        htmlcode+="  <table border=\"1\">\n" +
"            <tr>\n" +
"                <th >Id</th>\n" +
"                <th>Nombre</th>\n" +
"                <th>Precio</th>\n" +
"                <th>Categoria</th>\n" +
"                <th>Acciones</th>\n" +
"            </tr>\n"; 

        
        for(Producto p: productos){
            
            htmlcode+="<tr>\n" +
"                <td id='id_producto'>"+p.getId()+"</td>\n" +
"                <td>"+p.getNombre()+"</td>\n" +
"                <td>"+p.getPrecio()+"</td>\n" +
"                <td>"+p.getCategoria()+"</td>\n" +
"                <td><a id='btn-eliminar' href=\"\">Eliminar</a><a href=\"\">Modificar</a></td>\n" +
"            </tr>\n" ;
            
        }
        
        htmlcode+= "</table>";
        
        
        return htmlcode;
    }
    
    public boolean deleteProducto(int id){
        
        ModeloProductos mp = new ModeloProductos();
        return mp.deleteProducto(id);
        
        
        
    }
    
    

}
