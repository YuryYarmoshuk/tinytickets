package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.Access;

public interface AccessRepository extends JpaRepository<Access, Long> {
}
