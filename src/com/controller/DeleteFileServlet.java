package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.mapred.JobConf;

import com.model.HdfsDAO;

/**
 * Servlet implementation class DeleteFileServlet
 */
public class DeleteFileServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3231868022896157308L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getSession()
				.getAttribute("username");

		String filePath = new String(request.getParameter("filePath").getBytes(
				"ISO-8859-1"), "GB2312");

		JobConf conf = HdfsDAO.config();
		HdfsDAO hdfs = new HdfsDAO(conf);
		hdfs.rmr(filePath);
		System.out.println("====" + filePath + "====");
		FileStatus[] list = hdfs.ls("/" + username + "/");
		request.setAttribute("list", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
