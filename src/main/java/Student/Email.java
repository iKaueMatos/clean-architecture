package Student;

import jakarta.persistence.Embeddable;

@Embeddable
public class Email {

    //Value object
    private String address;


    public Email(String address) {

        if (address == null ||
                !address.matches("\"`^[a-zA-z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw  new IllegalArgumentException("E-mail invalido");
        }
        this.address = address;
    }

    public Email() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
