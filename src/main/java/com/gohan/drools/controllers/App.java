package com.gohan.drools.controllers;

import com.gohan.drools.models.Contact;
import com.gohan.drools.service.ContactBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;

@Controller
public class App {


    @Autowired
    private ContactBO contactBO;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/sud")
    public String indexSud(ModelMap modelAndView) {
        modelAndView.addAttribute("msg", "Spring MVC example message !");
        modelAndView.addAttribute("contactBO", contactBO);
        contactBO.listContact();
        return "index";
    }

    @RequestMapping("/contact")
    public String listContacts(Map<String, Object> map) {
        map.put("contact", new Contact());
        map.put("contactlist", contactBO.listContact());

        return "contact";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {
        contactBO.addContact(contact);
        return "redirect:/contact";

    }

    @RequestMapping(value = "/delete/{contactId}")
    public String deletecontact(@PathVariable("contactId") Integer contactId) {
        contactBO.removeContact(contactId);
        return "redirect:/contact";
    }


}
