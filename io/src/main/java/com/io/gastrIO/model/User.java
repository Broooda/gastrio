package com.io.gastrIO.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Encja User odpowiedzialna za reprezentacje u¿ytkownika.
 */
@Entity
public class User implements Serializable {

    /**
     * Sta³a do serializacji.
     */
    private static final long serialVersionUID = 6352264346596269821L;

    /**
     * ID pola wraz z automatyczna generacja w bazie danych.
     */
    @GeneratedValue(generator = "User_SEQUENCE")
    @Id
    @SequenceGenerator(name = "User_SEQUENCE", sequenceName = "User_SEQ")
    private int id;

    /**
     * Pole reprezentuj¹ce adres e-mail u¿ytkownika (jednoczeœnie login).
     */
    @NotNull(message = "{empty.error}")
    @NotEmpty(message = "{empty.error}")
    @Email(message = "{email.error}")
    @Column(unique = true)
    private String email;

    /**
     * Has³o.
     */
    @NotNull(message = "{empty.error}")
    @NotEmpty(message = "{empty.error}")
    private String password;

    /**
     * Pole isActive, s³u¿y do ustawienia czy u¿ytkownik jest aktywny.
     */
    private boolean isActive;

    /**
     * Lista rol które posiada u¿ytkownik.
     */
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<Role>();

    /**
     * Obiekt UserDetails przypisany OneToOne do konta.
     */
    @OneToOne
    @Valid
    private UserDetails userDetails;

    /**
     * Konstruktor domyœlny.
     */
    public User() {
        this.email = "";
        this.password = "";
        this.isActive = false;
        this.roles = new ArrayList<Role>();
        this.userDetails = new UserDetails();
    }

    /**
     * Getter pola user details.
     *
     * @return wartoœæ user details
     */
    public UserDetails getUserDetails() {
        return userDetails;
    }

    /**
     * Setter pola user details.
     *
     * @param userDetails dane osobowe u¿ytkownika
     */
    public void setUserDetails(final UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    /**
     * Getter pola email.
     *
     * @return wartoœæ email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter pola email.
     *
     * @param email nowy email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Getter pola password.
     *
     * @return has³o
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter pola password.
     *
     * @param password nowe has³o
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Getter pola isActive.
     *
     * @return wartoœæ true, jeœli u¿ytkownik jest aktywny
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * Getter pola isActive.
     *
     * @return wartoœæ true, jeœli u¿ytkownik jest aktywny
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Getter pola role.
     *
     * @return lista rol u¿ytkownika
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Setter pola role.
     *
     * @param roles nowa lista rol u¿ytkownika
     */
    public void setRoles(final List<Role> roles) {
        this.roles = roles;
    }

    /**
     * Getter pola id.
     *
     * @return ID u¿ytkownika
     */
    public int getId() {
        return id;
    }

    /**
     * Setter pola Id.
     *
     * @param id ID u¿ytkownika
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", isActive=" + isActive +  ", role=" + roles + ", userDetails=" + userDetails + "]";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return id;
    }

}