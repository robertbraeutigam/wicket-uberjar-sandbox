package com.github.robertbraeutigam.wicketuberjarsandbox;

import java.net.URI;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.apache.wicket.protocol.http.WicketServlet;
import org.apache.wicket.protocol.http.WicketFilter;
import org.apache.wicket.protocol.http.ContextParamWebApplicationFactory;

public class Main {
   public static final void main(String[] args) throws Exception {
      Server server = new Server(8080);
      ServletHolder servletHolder = new ServletHolder(WicketServlet.class);
      servletHolder.setInitParameter(ContextParamWebApplicationFactory.APP_CLASS_PARAM, Application.class.getName());
      servletHolder.setInitParameter(WicketFilter.FILTER_MAPPING_PARAM, "/*");
      ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
      servletContextHandler.addServlet(servletHolder, "/*");
      server.setHandler(servletContextHandler);
      server.start();
   }
}


