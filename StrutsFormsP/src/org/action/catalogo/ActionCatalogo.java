/**
 * 
 */
package org.action.catalogo;

import java.util.ArrayList;
import java.util.List;

import org.dao.producto.DAOProducto;
import org.modelo.producto.Producto;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Ing. Meliton García Cruz
 *
 */
public class ActionCatalogo extends ActionSupport implements ModelDriven<Producto>{
	
	private Producto producto = new Producto();
	private DAOProducto daoProducto = new DAOProducto();
	private List<Producto> productos = new ArrayList<Producto>();
	private List<String> nombresProductos = new ArrayList<String>();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String catalogo() {
		setProductos(daoProducto.selectProducto());
		for (Producto x : productos) {
			nombresProductos.add(x.getNombre());
		}
		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Producto getModel() {
		// TODO Auto-generated method stub
		return producto;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<String> getNombresProductos() {
		return nombresProductos;
	}

	public void setNombresProductos(List<String> nombresProductos) {
		this.nombresProductos = nombresProductos;
	}
	

}
