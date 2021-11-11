package io.axoniq.labs.chat.coreapi;

public class RoomCreatedEvent {

    private final String roomId;
    private final String participant;

    public RoomCreatedEvent(String roomId, String participant) {
        this.roomId = roomId;
        this.participant = participant;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getParticipant() {
        return participant;
    }
}
