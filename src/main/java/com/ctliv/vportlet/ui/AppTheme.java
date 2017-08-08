package com.ctliv.vportlet.ui;

import org.osgi.service.component.annotations.Component;

import com.vaadin.osgi.resources.OsgiVaadinTheme;
import com.vaadin.ui.themes.ValoTheme;

@Component(immediate = true, service = OsgiVaadinTheme.class)
public class AppTheme extends ValoTheme implements OsgiVaadinTheme {
	
	public static final String NAME = "com.ctliv.vportlet.ui.AppTheme";
	
    @Override
    public String getName() {
        return NAME;
    }

}