/**
 * 
 */
package org.action.consulta;

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


@SuppressWarnings("serial")
public class ActionConsulta extends ActionSupport implements ModelDriven<Producto>{

	private Producto producto = new Producto();
	private DAOProducto dao = new DAOProducto();
	private List<Producto> listProducto = new ArrayList<Producto>();
		
	public String execute() {
		return SUCCESS;
	}
	
	public String consultaProducto() {
		setListProducto(dao.selectProducto());
		return SUCCESS;
	}

	@Override
	public Producto getModel() {
		// TODO Auto-generated method stub
		return producto;
	}

	public List<Producto> getListProducto() {
		return listProducto;
	}

	public void setListProducto(List<Producto> listProducto) {
		this.listProducto = listProducto;
	}

	
}
