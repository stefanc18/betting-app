package com.example.application.data.service;

import com.example.application.data.entity.BettingTicket;
import com.example.application.data.repositories.BettingTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BettingTicketService {

    @Autowired
    private BettingTicketRepository bettingTicketRepository;

    public void addBettingTicket(BettingTicket bettingTicket) {
        bettingTicketRepository.save(bettingTicket);
    }

    public void deleteBettingTicketById(int id) {
        bettingTicketRepository.deleteById(id);
    }

}