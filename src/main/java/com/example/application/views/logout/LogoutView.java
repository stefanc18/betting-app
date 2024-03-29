package com.example.application.views.logout;

import com.example.application.views.login.LoginView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("logout")
@PageTitle("Logout")
public class LogoutView extends Composite<VerticalLayout> {

    public LogoutView() {
        LoginView.MODE = LoginView.NORMAL_MODE;
        UI.getCurrent().getPage().setLocation("login");
        VaadinSession.getCurrent().getSession().invalidate();
        VaadinSession.getCurrent().close();
    }

}
