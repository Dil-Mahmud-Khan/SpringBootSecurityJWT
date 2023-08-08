package com.jwt.sbjwt.Model;


import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class User {
    private String  UserId;
    private String email;
    private String name;
}
