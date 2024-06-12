package kz.baltabayev.userdetailsservice.model.entity;

import jakarta.persistence.*;
import kz.baltabayev.userdetailsservice.model.types.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Represents a user entity in the system.
 * This entity contains basic user information and references to user preferences and user information.
 * Extends the {@link BaseEntity} class to include common entity properties.
 * Uses Lombok annotations for boilerplate code reduction.
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    /**
     * The unique identifier of the user.
     */
    @Id
    private Long id;

    /**
     * The username of the user.
     */
    private String username;

    /**
     * The status of the user, represented by the {@link Status} enum.
     */
    @Enumerated(EnumType.STRING)
    private Status status;

    /**
     * The user's preferences, represented by the {@link UserPreference} entity.
     */
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private UserPreference userPreference;

    /**
     * The user's additional information, represented by the {@link UserInfo} entity.
     */
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private UserInfo userInfo;

    /**
     * Constructs a new User with the specified id and username.
     *
     * @param id       The unique identifier of the user.
     * @param username The username of the user.
     */
    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}