/**
 * 
 */
package org.action.alta;

import org.dao.producto.DAOProducto;
import org.modelo.producto.Producto;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * @author Ing. Meliton García Cruz
 *
 */
@SuppressWarnings("serial")
public class ActionAlta extends ActionSupport implements ModelDriven<Producto>{
	
	private Producto producto = new Producto();
	private DAOProducto dao = new DAOProducto();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String addProducto() {
		dao.addProducto(producto);
		return SUCCESS;
		
	}

	@Override
	public Producto getModel() {
		// TODO Auto-generated method stub
		return producto;
	}
}
