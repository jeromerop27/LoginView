/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tutoriallogin;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.Registration;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author Anabel Abreu
 */
public  class LoginView extends VerticalLayout implements View{
    
    public TextField email;
    public PasswordField password;
    public Button btnIniciar;
    
    public LoginView () {
        
        email = new TextField();
        email.setCaption("Email");
        email.setIcon(VaadinIcons.USER);
        email.setSizeFull();
        
        
        password = new PasswordField();
        password.setCaption("Password");
        password.setIcon(VaadinIcons.KEY);
        password.setSizeFull();
        
        btnIniciar = new Button ();
        btnIniciar.setCaption("Ingresar");
        btnIniciar.setIcon(VaadinIcons.CHECK);
        btnIniciar.addStyleName("primary");
        btnIniciar.setSizeFull();
        btnIniciar.addClickListener((event)->this.enter(event));
        
        FormLayout formLogin = new FormLayout(email, password,btnIniciar);
        formLogin.setMargin(true);
        
        Panel loginPanel = new Panel ("Ingreso a la Aplicacion", formLogin);
        loginPanel.setStyleName("primay");
        loginPanel.setWidth("450");
        loginPanel.setHeight("250");
        
        addComponent(loginPanel);
        setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
        setStyleName("fondologin",true);
        setHeight ("100%");
        
                
    }

    
   
       
    

    private void enter(Button.ClickEvent event) {
       Notification  notification = new Notification ("pendiente babilla");
        notification.show(this.getUI().getPage());
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
