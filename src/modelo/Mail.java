package model;
/**
 * @author -_R.S.C_-
 */
public class Mail {
    //inicializamos string para el Email
    private String email;
    public Mail(String mail){
        this.email = mail;
    }
    //Funcion detectora de domain
    public String getDomain(){
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@') return email.substring(i+1);
        }
        return null;
    }

}
