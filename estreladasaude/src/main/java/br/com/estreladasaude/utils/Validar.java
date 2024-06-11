
package br.com.estreladasaude.utils;

import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



public class Validar {
    
    public static boolean nome(String nome) {
    return nome.matches("[a-zA-ZáéíóúÁÉÍÓÚãõÃÕâêîôûÂÊÎÔÛçÇ ]+");
}
    
    //Método para validar o cpf 
    public static boolean cpf(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
           return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int)(CPF.charAt(i) - 48); 
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    //Método para imprimir o cpf formatado
    public static String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
    
    //Método para validar o numero de celular
    public static boolean cell(String numero) {
        String padrao = "^\\(?[1-9]{2}\\)?9[0-9]{8}$";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(numero);
        return matcher.matches();
    }
    
    //Método para validar a data de nascimento
    public static boolean data(String data) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
        try {
            LocalDate dataNascimento = LocalDate.parse(data, formato);
            LocalDate hoje = LocalDate.now();
            return !dataNascimento.isAfter(hoje);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    //Método para validar o email
    public static boolean email(String email) {
    
    //O email não é obrigatorio no preenchimento do cadastro, então caso ele seja
    //nulo ou vazio também será válido
    if (email == null || email.isEmpty()) {
        return true;
    }
    
    //Caso seja inserido um email, o regex continuará testando sua veracidade
    String expressao = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
    Pattern pattern = Pattern.compile(expressao, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}
    
}
