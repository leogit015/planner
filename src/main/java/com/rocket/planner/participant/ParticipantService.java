package com.rocket.planner.participant;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {

    public void registerParticipantsToEvent(List<String> ParticipantsToInvite, UUID tripId ){

    }

    public void triggerConfirmationEmailToParticipants(UUID tripID){};
}
