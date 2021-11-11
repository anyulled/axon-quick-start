package io.axoniq.labs.chat.coreapi;

public class ParticipantJoinedRoomEvent {

    private final String roomId;
    private final String participant;

    public ParticipantJoinedRoomEvent(String roomId, String participant) {
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
