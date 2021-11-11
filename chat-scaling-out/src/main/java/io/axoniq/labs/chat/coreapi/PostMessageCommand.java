package io.axoniq.labs.chat.coreapi;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class PostMessageCommand {
    @TargetAggregateIdentifier
    private final String roomId;
    private final String participant;
    private final String message;

    public PostMessageCommand(String roomId, String participant, String message) {
        this.roomId = roomId;
        this.participant = participant;
        this.message = message;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getParticipant() {
        return participant;
    }

    public String getMessage() {
        return message;
    }
}
