package ru.practicum.collector.model.sensor;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Schema(description = "Добавление сценария")
public class ScenarioAddedEvent {
    private String name;
    private List<ScenarioCondition> conditions;
    private List<DeviceAction> actions;
}
