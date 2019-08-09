package com.mt.model;
// Generated Jul 21, 2016 11:52:14 PM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Actor generated by hbm2java
 */
@Entity
@Table(name="actor"
    ,schema="public"
)
public class Actor  implements java.io.Serializable {


     private int actorId;
     private String firstName;
     private String lastName;

    public Actor() {
    }

	
    public Actor(int actorId, String firstName, String lastName) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
     @Id 
    
    @Column(name="actor_id", unique=true, nullable=false)
    public int getActorId() {
        return this.actorId;
    }
    
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}


