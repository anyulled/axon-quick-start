package io.axoniq.labs.chat.coreapi;

public class RoomMessagesQuery {

    private final String roomId;

    public RoomMessagesQuery(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }
}
