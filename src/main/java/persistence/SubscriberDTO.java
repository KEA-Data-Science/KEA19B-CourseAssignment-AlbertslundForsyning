package persistence;

import java.io.Serializable;

/**
 * Class describes a subscriber as a data object
 */
public class SubscriberDTO implements Serializable
{
    private int id;
    private String name;
    private String address;
    private String email;
    private String phonen;
    private String comment;

    public SubscriberDTO(int id, String name, String address, String email, String phonen, String comment)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phonen = phonen;
        this.comment = comment;
    }

    public SubscriberDTO(){ }

    public int getId(){ return id; }

    public void setId(int id){ this.id = id; }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public String getAddress(){ return address; }

    public void setAddress(String address){ this.address = address; }

    public String getEmail(){ return email; }

    public void setEmail(String email){ this.email = email; }

    public String getPhonen(){ return phonen; }

    public void setPhonen(String phonen){ this.phonen = phonen; }

    public String getComment(){ return comment; }

    public void setComment(String comment){ this.comment = comment; }

    @Override
    public String toString()
    {
        return "SubscriberDTO{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", address='" + address + '\'' +
               ", email='" + email + '\'' +
               ", phonen='" + phonen + '\'' +
               ", comment='" + comment + '\'' +
               '}';
    }
}
