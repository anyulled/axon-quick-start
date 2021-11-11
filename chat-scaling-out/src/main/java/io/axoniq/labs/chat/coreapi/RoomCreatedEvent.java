package io.axoniq.labs.chat.coreapi;

public class RoomCreatedEvent {

    private final String roomId;
    private final String name;

    public RoomCreatedEvent(String roomId, String participant) {
        this.roomId = roomId;
        this.name = participant;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }
}
