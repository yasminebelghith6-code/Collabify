package com.collabify.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity /*spring va creer une table user */
@Getter
@Setter/*lombook creer les methodes automatiquement */
@NoArgsConstructor
@AllArgsConstructor
public class User {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String email;

    private String password;

    private String role;
}
