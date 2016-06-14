package com.gohan.drools.service;

import com.gohan.drools.models.Contact;

import java.util.List;


public interface ContactBO {

    void addContact(Contact contact);

    List<Contact> listContact();

    void removeContact(long id);


}
