package ru.practicum.collector.model.sensor;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Schema(description = "Удаление сценария")
public class ScenarioRemovedEvent {
    private String name;
}
