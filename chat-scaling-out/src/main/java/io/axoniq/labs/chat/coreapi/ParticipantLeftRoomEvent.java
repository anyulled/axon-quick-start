package io.axoniq.labs.chat.coreapi;

public class ParticipantLeftRoomEvent {

    private final String roomId;
    private final String participant;

    public ParticipantLeftRoomEvent(String roomId, String participant) {
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
