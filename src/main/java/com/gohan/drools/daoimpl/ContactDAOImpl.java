package com.gohan.drools.daoimpl;

import com.gohan.drools.dao.ContactDAO;
import com.gohan.drools.models.Contact;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;



    public void addContact(Contact contact) {

        sessionFactory.getCurrentSession().save(contact);

    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        String query1 = "select * from contact;";
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(query1);
        query.addEntity(Contact.class);
        List results = query.list();
        return null;

    }

    public void removeContact(long id) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
        if (contact != null)
            sessionFactory.getCurrentSession().delete(contact);
    }


/*    public void setsessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
	}

	public SessionFactory getsessionFactory() {
		return this.sessionFactory;
	}*/


}
