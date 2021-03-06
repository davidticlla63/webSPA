package bo.com.erp360.webapp.service;

import javax.ejb.Stateless;

import bo.com.erp360.webapp.model.Proveedor;

//The @Stateless annotation eliminates the need for manual transaction demarcation

@Stateless
public class ProveedorRegistration extends DataAccessService<Proveedor>{
	public ProveedorRegistration(){
		super(Proveedor.class);
	}

}
