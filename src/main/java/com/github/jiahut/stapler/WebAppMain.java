package com.github.jiahut.stapler;

import org.kohsuke.stapler.framework.AbstractWebAppMain;

public class WebAppMain extends AbstractWebAppMain<Application> {
    public WebAppMain() {
        super(Application.class);
    }

    @Override
    protected String getApplicationName() {
        return "APP";
    }

    @Override
    protected Object createApplication() throws Exception {
        return new Application();
    }
}
