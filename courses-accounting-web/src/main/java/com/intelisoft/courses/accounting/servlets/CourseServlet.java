package com.intelisoft.courses.accounting.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.intelisoft.courses.accounting.api.services.ICourseService;
import com.intelisoft.courses.accounting.models.Course;
import com.intelisoft.courses.accounting.services.CourseServiceImpl;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICourseService service = new CourseServiceImpl();

	public CourseServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();

		List<Course> courses = service.getAllCoursesWithLessons();

		// for (Course course : courses) {
		//
		// pw.append(course.toString()).append(course.getLessons().toString()).append("<br>");
		// }

		pw.append("<a href=\"./\">назад</a>");

		pw.append("<div alight = center><table border=1>");

		pw.append("<tr><td>название курса</td><td>количество часов</td><td>стоимость</td></tr>");

		for (Course course : courses) {

			pw.append("<tr>").append("<td>");

			pw.append(course.getName().toString());
			pw.append("</td><td>");
			pw.append(course.getDurationHours().toString());
			pw.append("</td><td>");
			pw.append(course.getCost().toString());

			pw.append("</td>").append("</tr>");
		}

		pw.append("</div></table>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(request.getParameter("id"));

		doGet(request, response);
	}

}
