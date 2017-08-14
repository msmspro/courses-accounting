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

	public CourseServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();

		ICourseService service = new CourseServiceImpl();

		List<Course> courses = service.getAllCoursesWithLessons();
		for (Course course : courses) {

			pw.append(course.toString()).append(course.getLessons().toString()).append("<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
