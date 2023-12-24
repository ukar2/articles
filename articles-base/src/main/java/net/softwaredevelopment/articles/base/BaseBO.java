package net.softwaredevelopment.articles.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
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
@MappedSuperclass
public abstract class BaseBO implements Serializable, Comparable<BaseBO> {

    @Serial
    private static final long serialVersionUID = 3280644625089973273L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime changeOn;
    private String changeBy;
    private String uuid;
    private LocalDateTime validFrom;
    private LocalDateTime validTo;

    protected BaseBO() {
        // Noncompliant - constructor is empty.
        // Default constructor is recommended for some frameworks
    }

    public int compareTo(BaseBO other) {
        return this.id.compareTo(other.id);
    }
}
