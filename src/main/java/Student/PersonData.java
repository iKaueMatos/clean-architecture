package Student;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.time.LocalDate;

//Classe faz uma herança com a classe Student -> estudantes
@Embeddable
public class PersonData {

    @Embedded
    private CPF cpf;
    @Column(name="nome")
    private String name;

    @Column(name="Data")
    private LocalDate age = LocalDate.now();

    public PersonData(CPF cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public PersonData() {

    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
