package com.research.user;

import com.research.common.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends AuditableEntity {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private UserRole role = UserRole.USER;

    @Column(nullable = false)
    private UserStatus status = UserStatus.ACTIVE;

    @Column(nullable = false)
    private boolean isEmailVerified = false;

    public static User register(String email, String passwordHash, String fullName){

        User user = new User();
        user.setEmail(email);
        user.setPasswordHash(passwordHash);
        user.setFullName(fullName);
        return user;
    }



}
