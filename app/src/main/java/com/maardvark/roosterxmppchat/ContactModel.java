package com.maardvark.roosterxmppchat;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gakwaya on 4/16/2016.
 * Class representing the model of the user's roster.
 */
public class ContactModel {

    private static ContactModel sContactModel;
    private List<Contact> mContacts;

    public static ContactModel get(Context context)
    {
        if(sContactModel == null)
        {
            sContactModel = new ContactModel(context);
        }
        return  sContactModel;
    }

    private ContactModel(Context context)
    {
        mContacts = new ArrayList<>();
        populateWithInitialContacts(context);

    }

    private void populateWithInitialContacts(Context context)
    {
        //Create the users and add them to the list, hardcoded for now, full registration functionality could be added later.
        // ip of digital ocean vm droplet hosting the service (openfire) included in jid
        Contact contact0 = new Contact("alice@167.99.95.234");
        mContacts.add(contact0);
        Contact contact1 = new Contact("bob@167.99.95.234");
        mContacts.add(contact1);
    }

    public List<Contact> getContacts()
    {
        return mContacts;
    }

}
