package com.atmosware.library_project.business.dtos;

import com.atmosware.library_project.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {

    private String userName;
    private String password;
    private String email;
    private Role role;
}
