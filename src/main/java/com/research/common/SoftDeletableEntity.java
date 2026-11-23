package com.research.common;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
public abstract class SoftDeletableEntity extends AuditableEntity{

    private Instant deleteAt;

    public boolean isDeleted(){
        return deleteAt != null;
    }

    public void softDelete(){
        this.deleteAt = Instant.now();
    }
}
