package ie.atu.wtcemailservice;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class User {

    private String id;

    private String username;

    private String email;

    private String password;
    private Set<Role> roles = new HashSet<>();

}
