package net.softwaredevelopment.articles.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, doNotUseGetters = true)
@ToString
public abstract class BaseDTO implements Serializable, Comparable<BaseDTO> {
    @Serial
    private static final long serialVersionUID = -1197213051079582461L;

    @EqualsAndHashCode.Include
    private Long id;

    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime changeOn;
    private String changeBy;
    private String uuid;
    private LocalDateTime validFrom;
    private LocalDateTime validTo;

    protected BaseDTO() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }

    @Override
    public int compareTo(BaseDTO other) {
        return this.id.compareTo(other.id);
    }
}
