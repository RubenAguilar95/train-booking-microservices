package com.example.ticketservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListeners {

    @KafkaListener(topics = "train-booking-events", groupId = "ticket-service-group")
    public void handleBookingEvent(String message) {
        System.out.println("Ticket Service received booking event: " + message);
        // TODO: Parse message and create ticket or update internal state accordingly
    }
}