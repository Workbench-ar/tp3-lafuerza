package controller.attractions;

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

@WebServlet("/guest/index.guest")
public class ListIndexAttractionsGuestServlet extends HttpServlet implements Servlet {
	

	private static final long serialVersionUID = 2552664789545594075L;
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
			if (atracction.getTipoAtraccion().toString().equals(lado)) {
				attractionsFiltred.add(atracction);
			} 
		}
	
		
		req.setAttribute("attractions", attractionsFiltred);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/guest/index.jsp");
		dispatcher.forward(req, resp);

	}

}


