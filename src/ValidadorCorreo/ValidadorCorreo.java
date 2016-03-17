/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValidadorCorreo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author josediaz
 */
public class ValidadorCorreo {
    private final Pattern patron;
    private Matcher coincidente;
    private static final String PATRON_CORREO = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public ValidadorCorreo(){
        patron = Pattern.compile(PATRON_CORREO);
    }
    
    /**
     * @param correo
     * @return true si valido, false si es invalido
     * 
     */
    public boolean validarCorreo(String correo) {
	coincidente = patron.matcher(correo);
	return coincidente.matches();
    }
}