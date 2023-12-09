package cl.inacap.ejemplowar.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.ejemploejb.business.ServicioLocal;

/**
 * Servlet implementation class SumarControlador
 */
@WebServlet("/SumarControlador")
public class SumarControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    public ServicioLocal servicioLocal;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumarControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numero1 = Integer.parseInt(request.getParameter("numero1"));
		int numero2 = Integer.parseInt(request.getParameter("numero2"));
		int resultadoSuma = servicioLocal.sumar(numero1, numero2);
		request.setAttribute("resultadoSuma", resultadoSuma); //este método permite comunicar un JSP con un Servlet.
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
