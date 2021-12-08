package controller.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Attraction;
import services.AttractionService;

@WebServlet("/guest")
public class GuestServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = -6744456932336971308L;
	private AttractionService attractionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionService = new AttractionService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 	String lado = req.getParameter("lado");
		
		List<Attraction> attractions = attractionService.list();
		
		List<Attraction> attractionsFiltred = new ArrayList<Attraction>();
		
		for (Attraction atracction : attractions) {
			if (atracction.getTipoAtraccion().getNombre().equals(lado)) {
				attractionsFiltred.add(atracction);
			} 
		}
	
	
		
		req.setAttribute("attractions", attractionsFiltred);
		req.setAttribute("lado", lado.toUpperCase() );
		
	
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/guest/index.jsp");
		dispatcher.forward(req, resp);
		

	}

}


