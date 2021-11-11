package io.axoniq.labs.chat.coreapi;

public class RoomParticipantsQuery {

    private final String roomId;

    public RoomParticipantsQuery(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }
}
