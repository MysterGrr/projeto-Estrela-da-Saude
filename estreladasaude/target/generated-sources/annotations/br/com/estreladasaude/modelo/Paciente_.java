package br.com.estreladasaude.modelo;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-10T13:00:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Integer> codigo;
    public static volatile SingularAttribute<Paciente, String> cpf;
    public static volatile SingularAttribute<Paciente, String> convenio;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile SingularAttribute<Paciente, LocalDate> dataN;
    public static volatile SingularAttribute<Paciente, String> cell;
    public static volatile SingularAttribute<Paciente, String> email;

}