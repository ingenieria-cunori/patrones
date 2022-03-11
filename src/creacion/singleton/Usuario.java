/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creacion.singleton;

/**
 *
 * @author hendrick
 */
public class Usuario {
    private static Usuario usuario;
    private String nickname;
    private String password;
    
    private Usuario() {
        this.nickname = "Sistemas";
        this.password = "123";
    }
    
    public static Usuario getInstance(){
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    @Override
    public String toString() {
        return "Usuario{" + "nickname=" + nickname + ", password=" + password + '}';
    }
    
    
}
