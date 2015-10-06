package com.github.robertbraeutigam.wicketuberjarsandbox;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class Application extends WebApplication {
   @Override
   public Class<? extends WebPage> getHomePage() {
      return Index.class;
   }
}


