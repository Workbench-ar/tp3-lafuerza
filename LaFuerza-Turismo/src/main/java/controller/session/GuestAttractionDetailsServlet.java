package controller.session;

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Attraction;
import services.AttractionService;

@WebServlet("/guestAtracction")
public class GuestAttractionDetailsServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = -6744456932336971308L;
	private AttractionService attractionService;

	@Override
	public void init() throws ServletException {
		super.init();
		this.attractionService = new AttractionService();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 	String attractionID = req.getParameter("attractionID");
		
	 	Attraction attraction = attractionService.find(Integer.parseInt(attractionID));
		
			
		req.setAttribute("attraction", attraction);
		req.setAttribute("lado", attraction.getTipoAtraccion().getNombre().toUpperCase() );
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/guest/attraction.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 	String attractionID = req.getParameter("attractionID");
		
	 	Attraction attraction = attractionService.find(Integer.parseInt(attractionID));
		
			
		req.setAttribute("attraction", attraction);
		req.setAttribute("lado", attraction.getTipoAtraccion().getNombre().toUpperCase() );
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/views/guest/attraction.jsp");
		dispatcher.forward(req, resp);
		
	}
		

}