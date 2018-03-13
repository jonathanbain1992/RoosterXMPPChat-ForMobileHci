package com.maardvark.roosterxmppchat;

/**
 * Created by gakwaya on 4/16/2016.
 * Class representing a contact for XMPP use via Smack. Consists of jid with getter and setter.
 */
public class Contact {
    private String jid;

    public Contact(String contactJid )
    {
        jid = contactJid;
    }

    public String getJid()
    {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }
}
