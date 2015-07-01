package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    @Past
    private Date birthDate;
    private Gender gender;

    private String mailAdres;

    private String telNummer;

    /**
     * Used by JPA.
     */
    public User() {
    }

    public User(String firstName, String lastName, Date birthDate,Gender gender, String mailAdres,String telNummer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMailAdres() {
        return mailAdres;
    }

    public void setMailAdres(String mailAdres) {
        this.mailAdres = mailAdres;
    }

    public String getTelNummer() {
        return telNummer;
    }

    public void setTelNummer(String telNummer) {
        this.telNummer = telNummer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

}
