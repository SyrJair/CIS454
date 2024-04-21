package com.moomeditate.moomeditation.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.moomeditate.moomeditation.models.ERole;
import com.moomeditate.moomeditation.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
