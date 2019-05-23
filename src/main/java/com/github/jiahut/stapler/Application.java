package com.github.jiahut.stapler;

import com.github.jiahut.stapler.bean.Item;
import com.github.jiahut.stapler.bean.Person;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;
import org.kohsuke.stapler.export.Flavor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *  jiahut@gmail.com
 *
 */

public class Application {
    private  static Logger logger = LoggerFactory.getLogger(Application.class);

    public Map<String, Item> getItems() {
        Map<String, Item> items = new HashMap();
        items.put("1", new Item("item1"));
        items.put("2", new Item("item2"));

        return items;
    }

    public void doHello(StaplerRequest request, StaplerResponse response) throws ServletException, IOException {
        logger.info("doHello called");

        response.forwardToPreviousPage(request);
    }

    public void doPerson(StaplerRequest request, StaplerResponse response) throws ServletException, IOException {
        logger.info("do Person");
        response.serveExposedBean(request, new Person(), Flavor.JSON);
    }
}
