package cl.inacap.ejemploejb.business;

import javax.ejb.Local;

@Local
public interface ServicioLocal {
	public int sumar(int a, int b);
	public String concatenar(int a, int b);
}





