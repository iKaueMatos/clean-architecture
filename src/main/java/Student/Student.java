package Student;


import jakarta.persistence.*;

@Entity
@Table(name = "Aluno")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "matriculaDoAluno")
    private Long studentEnrollment;
    @Embedded
    private PersonData personData;
    @Embedded
    private Email address;

    public Student(PersonData personData, Email address) {
        this.personData = personData;
        this.address = address;
    }

    public Student(){

    }

    public Long getStudentEnrollment() {
        return studentEnrollment;
    }

    public void setStudentEnrollment(Long studentEnrollment) {
        this.studentEnrollment = studentEnrollment;
    }

    public PersonData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonData personData) {
        this.personData = personData;
    }

    public Email getAddress() {
        return address;
    }

    public void setAddress(Email address) {
        this.address = address;
    }
}
