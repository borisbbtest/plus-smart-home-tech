package ru.practicum.collector.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Schema(description = "Добавление устройства")
public class DeviceAddedEvent {
    private String id;
    private DeviceType type;
}
