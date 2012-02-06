package com.carcasser.radiochan.server;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * Icecast statistic servlet
 */
public class StatisticServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String callback = request.getParameter("callback");
        response.setContentType("application/json");
        response.addHeader("Pragma", "no-cache");
        response.setStatus(200);

        URL statistic = new URL("http://radiochan.maped.by:8000/statistic.xsl");
        URLConnection conn = statistic.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        PrintWriter pw = response.getWriter();
        pw.write("" + callback + "(");
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            pw.write(inputLine);
        }
        pw.write(");");
        in.close();
        pw.flush();
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
