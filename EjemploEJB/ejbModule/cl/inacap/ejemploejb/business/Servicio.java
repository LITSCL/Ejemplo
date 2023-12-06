package cl.inacap.ejemploejb.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Servicio
 */
@Stateless
@LocalBean
public class Servicio implements ServicioLocal {

    /**
     * Default constructor. 
     */
    public Servicio() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int sumar(int a, int b) {
		return a + b;
	}

	@Override
	public String concatenar(int a, int b) {
		String aString = Integer.toString(a);
		String bString = Integer.toString(b);
		return aString + bString;
	}

}
