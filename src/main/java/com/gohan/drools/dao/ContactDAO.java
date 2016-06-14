package com.gohan.drools.dao;

import com.gohan.drools.models.Contact;

import java.util.List;


public interface ContactDAO {

    void addContact(Contact contact);

    List<Contact> listContact();

    void removeContact(long id);

}
