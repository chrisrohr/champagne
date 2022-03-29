package org.kiwiproject.champagne.core;

import java.time.Instant;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
    
    private long id;
    private Instant createdAt;
    private Instant updatedAt;
    
    private String firstName;
    private String lastName;
    private String displayName;
    private String systemIdentifier;
    
}
