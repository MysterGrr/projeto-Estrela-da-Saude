
package br.com.estreladasaude.modelo;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    
    @Column(nullable = false)
    private LocalDate dataN;
    
    @Column(nullable = false, unique = false, length = 11)
    private String cell;
    
    @Column(nullable = true)
    private String email;
    
    @Column(nullable = true)
    private String convenio;

    public Paciente(Integer codigo, String nome, String cpf, LocalDate dataN, String cell, String email, String convenio) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataN = dataN;
        this.cell = cell;
        this.email = email;
        this.convenio = convenio;
    }

    public Paciente(String nome, String cpf, LocalDate dataN, String cell, String email, String convenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataN = dataN;
        this.cell = cell;
        this.email = email;
        this.convenio = convenio;
    }

    public Paciente(String nome, String cpf, LocalDate dataN, String cell, String convenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataN = dataN;
        this.cell = cell;
        this.convenio = convenio;
    }

    public Paciente(String nome, String cpf, String cell, String email, String convenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.cell = cell;
        this.email = email;
        this.convenio = convenio;
    }

    

    public Paciente(String cpf) {
        this.cpf = cpf;
    }
    
    public Paciente() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataN() {
        return dataN;
    }

    

    public String getCell() {
        return cell;
    }

    public String getEmail() {
        return email;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
    
    //Reescrita do método toScring para que ele retorne os atributos da classe Paciente
    @Override
    public String toString(){
       String resultado = "Paciente " + nome + "\n" +
               "CPF: " + (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
        cpf.substring(6, 9) + "-" + cpf.substring(9, 11)) + "\n" +
               "Nascido em  " + dataN + "\n" +
               "Com o celular: " + cell;
       if (email != null){
                resultado += "\nE o email: " + email;
               }
       return resultado;
    }   

}