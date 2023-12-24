package net.softwaredevelopment.artcles.dto;

import lombok.*;
import net.softwaredevelopment.articles.base.BaseDTO;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderClassName = "UserBuilder", builderMethodName = "getBuilder", setterPrefix = "set")
public class UserDTO extends BaseDTO {

    private Boolean blocked;
    private String email;
    private String loginName;
    private String forename;
    private String surname;
    private String password;

    public UserDTO() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }
}
