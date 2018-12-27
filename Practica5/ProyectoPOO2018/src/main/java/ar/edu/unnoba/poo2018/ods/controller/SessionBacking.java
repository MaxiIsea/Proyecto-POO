package ar.edu.unnoba.poo2018.ods.controller;

import ar.edu.unnoba.poo2018.dao.UsuarioDAO;
import ar.edu.unnoba.poo2018.model.Usuario;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionBacking {

    private Usuario user;
    private String email;
    private String password;

    @EJB
    private UsuarioDAO usuarioDAO;

    public String login() {
        user = null;
        user = usuarioDAO.login(email, password);
        if (user == null) {            
            return "error.xhtml";
        }
        return "welcome.xhtml";
    }

    public String logout() {
        user = null;
        return "index.xhtml";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
