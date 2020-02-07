package com.sample;

import com.sample.details.DetailsType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectdetailsservlet",
        urlPatterns = "/SelectProfileType"
)

public class SelectDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String detailsType = request.getParameter("Type");
        ProfileService service = new ProfileService();
        DetailsType type = DetailsType.valueOf(detailsType);

        List details = service.getAvailableDetails(type);
        request.setAttribute("Type",details);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);

    }

}
