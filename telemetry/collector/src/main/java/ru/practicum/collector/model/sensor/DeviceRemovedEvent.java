package ru.practicum.collector.model.sensor;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Schema(description = "Удаление устройства")
public class DeviceRemovedEvent {
    private String id;
}
