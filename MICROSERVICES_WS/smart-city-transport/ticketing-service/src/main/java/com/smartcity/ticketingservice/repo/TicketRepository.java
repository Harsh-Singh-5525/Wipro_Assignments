package com.smartcity.ticketingservice.repo;
import org.springframework.data.jpa.repository.JpaRepository; import java.util.List; import com.smartcity.ticketingservice.model.Ticket;
public interface TicketRepository extends JpaRepository<Ticket, Long>{ List<Ticket> findByUserId(Long userId); }
