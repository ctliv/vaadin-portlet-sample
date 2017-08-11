package com.ctliv.vportlet.ui;

import javax.portlet.PortletMode;

import org.osgi.service.component.annotations.Component;

import com.ctliv.lvs.component.DebugLayout;
import com.ctliv.lvs.spring.util.BeanUtil;
import com.ctliv.lvs.ui.MultimodeUIExt;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Widgetset(AppWidgetSet.NAME)
@Theme(AppTheme.NAME)
@Component(immediate = false, service = UI.class, property = {
        "com.liferay.portlet.display-category=category.sample",
        "javax.portlet.name=SampleVSP",
        "javax.portlet.portlet-mode=text/html;view;edit",
        "javax.portlet.display-name=Sample Vaadin Spring Portlet",
        "javax.portlet.security-role-ref=power-user,user",
        "com.vaadin.osgi.liferay.portlet-ui=true"})
//@SpringUI
public class VPortletUI extends MultimodeUIExt {

//    private Log log = LogFactoryUtil.getLog(this.getClass());

    @Override
    protected void init(VaadinRequest request) {
    	/*
        final String portletContextName = getPortletContextName(request);
        final Integer numOfRegisteredUsers = getPortalCountOfRegisteredUsers();
        final VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(false);
//        setContent(layout);
        this.setComponent(PortletMode.VIEW, layout);

        final Button button = new Button("Click Me");
        button.addClickListener(event -> {
                layout.addComponents(new Label(
                        "Hello, World!<br>This is portlet "
                                + portletContextName
                                + ".<br>This portal has "
                                + numOfRegisteredUsers
                                + " registered users (according to the data returned by Liferay API call).",
                        ContentMode.HTML),
                        new Label("My Bus is: " + (uiBus == null ? "null" : uiBus.objToString())));
            }
        );
        layout.addComponent(button);
        */
    	
    	this.setComponent(PortletMode.VIEW, BeanUtil.getBean(DebugLayout.class));
    	this.setComponent(PortletMode.EDIT, BeanUtil.getBean(DebugLayout.class));
        
    }

//    private String getPortletContextName(VaadinRequest request) {
//        WrappedPortletSession wrappedPortletSession = (WrappedPortletSession) request
//                .getWrappedSession();
//        PortletSession portletSession = wrappedPortletSession
//                .getPortletSession();
//        
//        final PortletContext context = portletSession.getPortletContext();
//        final String portletContextName = context.getPortletContextName();
//        return portletContextName;
//    }
//
//    private Integer getPortalCountOfRegisteredUsers() {
//        Integer result = null;
//
//        try {
//            result = UserLocalServiceUtil.getService().getUsersCount();
//        } catch (SystemException e) {
//            log.error(e);
//        }
//
//        return result;
//    }
}
