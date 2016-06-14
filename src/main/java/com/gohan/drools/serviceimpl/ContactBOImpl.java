package com.gohan.drools.serviceimpl;

import com.gohan.drools.dao.ContactDAO;
import com.gohan.drools.daoimpl.ContactDAOImpl;
import com.gohan.drools.models.Contact;
import com.gohan.drools.service.ContactBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactBOImpl implements ContactBO {

    @Autowired
    private ContactDAO contactDao;

    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }

    public List<Contact> listContact() {
        return contactDao.listContact();
    }

    public void removeContact(long id) {
        contactDao.removeContact(id);
    }

   
}
