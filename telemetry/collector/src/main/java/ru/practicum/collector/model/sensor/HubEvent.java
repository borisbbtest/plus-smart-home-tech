package ru.practicum.collector.model.sensor;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Schema(description = "Событие от хаба")
public class HubEvent {
    private String hubId;
    private Instant timestamp;
    private Object payload;
}
