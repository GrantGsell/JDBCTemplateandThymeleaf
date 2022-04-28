package com.sg.classroster.dto;

import java.util.Objects;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


/**
 * @author Grant
 * 
 * Creates a Teacher object class
 */
public class Teacher {
    private int id;
    
    @NotBlank(message = "First name must not be empty.")
    @Size(max = 30, message = "First name must be less than 30 characters.")
    private String firstName;
    
    @NotBlank(message = "Last name must not be empty.")
    @Size(max = 50, message = "Last name must be less than 50 characters.")
    private String lastName;
    
    @Size(max = 50, message = "Specialty must be less than 50 characters")
    private String specialty;

    // Teacher setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Teacher getters
    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
   
    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    // Teacher hashcode override function
    @Override 
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.firstName);
        hash = 23 * hash + Objects.hashCode(this.lastName);
        hash = 23 * hash + Objects.hashCode(this.specialty);
        return hash;
    }

    // Teacher Equals override function
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return Objects.equals(this.specialty, other.specialty);
    }
 
}
