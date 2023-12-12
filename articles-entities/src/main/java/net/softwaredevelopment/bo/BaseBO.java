package net.softwaredevelopment.bo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@MappedSuperclass
public abstract class BaseBO implements Serializable, Comparable<BaseBO> {

    @Serial
    private static final long serialVersionUID = 164637575726314707L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected LocalDateTime createdOn;
    protected String createdBy;
    protected LocalDateTime changeOn;
    protected String changeBy;
    protected String uuid;
    protected LocalDateTime validFrom;
    protected LocalDateTime validTo;

    protected BaseBO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getChangeOn() {
        return changeOn;
    }

    public void setChangeOn(LocalDateTime changeOn) {
        this.changeOn = changeOn;
    }

    public String getChangeBy() {
        return changeBy;
    }

    public void setChangeBy(String changeBy) {
        this.changeBy = changeBy;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDateTime validTo) {
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseBO baseBO)) return false;
        return Objects.equals(id, baseBO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(BaseBO other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseBO:{");
        return sb.append("id=").append(id)
                .append(", createdOn=").append(createdOn)
                .append(", createdBy='").append(createdBy).append('\'')
                .append(", changeOn=").append(changeOn)
                .append(", changeBy='").append(changeBy).append('\'')
                .append(", uuid='").append(uuid).append('\'')
                .append(", validFrom=").append(validFrom)
                .append(", validTo=").append(validTo)
                .append('}')
                .toString();
    }
}
