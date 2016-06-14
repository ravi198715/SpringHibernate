package com.gohan.drools.models;


//import java.util.Calendar;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact implements Serializable {


    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lasstname")
    private String lastname;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

	/*@Temporal(TemporalType.TIMESTAMP)
	@Generated(GenerationTime.ALWAYS)
	private Calendar created;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
