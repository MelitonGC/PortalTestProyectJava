/**
 * 
 */
package org.dao.producto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.producto.Producto;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

/**
 * @author Ing. Meliton García Cruz
 *
 */
public class DAOProducto {
	@SessionTarget // SessionFactory, Session
	private Session session;
	
	@TransactionTarget // getTransaction.begin(), getTransaction().commit()
	private Transaction transaction;
	
	public void addProducto(Producto producto) {
		try {
			session.save(producto);
		} catch (Exception e) {
			System.out.println("Exception add:" + e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> selectProducto(){
		List<Producto> list = null;
		
		try {
			list = (List<Producto>) session.createQuery("From Producto").list();
			
		}catch (Exception e) {
			System.out.println("Excepcion list:" + e.getMessage());
		}
		return list;
	}

}
