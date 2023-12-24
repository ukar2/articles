package net.softwaredevelopment.artcles.dto;

import lombok.*;
import net.softwaredevelopment.articles.base.BaseDTO;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderClassName = "AccountBuilder", builderMethodName = "getBuilder", setterPrefix = "set")
public class AccountDTO extends BaseDTO {

    private String accountName;

    private Long userId;

    public AccountDTO() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }

}
