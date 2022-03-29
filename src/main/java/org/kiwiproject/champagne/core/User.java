package org.kiwiproject.champagne.core;

import java.time.Instant;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
    
    long id;
    Instant createdAt;
    Instant updatedAt;
    
    String firstName;
    String lastName;
    String displayName;
    String systemIdentifier;
    
}
