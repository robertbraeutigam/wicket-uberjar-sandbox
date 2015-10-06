package com.github.robertbraeutigam.wicketuberjarsandbox;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.Component;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.IModel;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import static java.util.Arrays.asList;
import java.util.Iterator;
import java.util.Collections;

public class Index extends WebPage {
   @Override
   public void onInitialize() {
      super.onInitialize();

      add(createEmptyTable("table"));
   }

   private Component createEmptyTable(String componentId) {
      DefaultDataTable<String, Void> emptyTable = new DefaultDataTable<String, Void>(
            componentId,
            asList(new PropertyColumn<String, Void>(Model.of("Column"), "property")),
            new SortableDataProvider<String, Void>() {
               @Override
               public IModel<String> model(String value) {
                  return Model.of(value);
               }

               @Override
               public long size() {
                  return 0;
               }

               @Override
               public Iterator<String> iterator(long start, long length) {
                  return Collections.<String>emptyList().iterator();
               }
            }, 20);
      return emptyTable;
   }
}


