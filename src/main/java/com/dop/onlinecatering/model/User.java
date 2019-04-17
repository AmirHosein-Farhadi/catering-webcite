package com.dop.onlinecatering.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AuditModel implements UserDetails {

    @NotBlank
    @NotNull
    @Column(unique = true)
    @Size(min = 8, max = 20)
    private String phoneNumber;         //this is the field which should be unique and identifies the user

    @Column(unique = true)
    @Size(min = 8, max = 20)
    private String username;            //or we can switch to user name
                                        //todo Decide Which one to implement

    @Column(length = 100)
    private String password;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    private String firstName;
    private String lastName;
    private char gender = 'u';
    private String email;
    private String nationalCode;

    @OneToOne
    private Address address;

    @OneToMany
    private List<Review> reviews = new ArrayList<>();

    //todo check with front if need a field for orderList to save unfinished orders

    @OneToMany
    private  List<Transaction> transactions = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.getName()));
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}