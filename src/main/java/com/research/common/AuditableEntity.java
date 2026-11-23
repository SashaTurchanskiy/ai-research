package com.research.common;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@MappedSuperclass
@Getter
public abstract class AuditableEntity extends BaseEntity{

    @LastModifiedDate
    private Instant  updatedAt;
}
