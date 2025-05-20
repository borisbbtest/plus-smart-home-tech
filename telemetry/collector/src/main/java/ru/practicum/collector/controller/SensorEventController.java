package ru.practicum.collector.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.practicum.collector.model.hub.SensorEvent;
import ru.practicum.collector.model.sensor.HubEvent;

@RestController
@RequestMapping("/events")
@Slf4j
@Tag(name = "events", description = "API для передачи событий от датчиков и хабов")
public class SensorEventController {

    @PostMapping("/sensors")
    @Operation(summary = "Обработчик событий датчиков")
    public void collectSensorEvent(@Valid @RequestBody SensorEvent event) {
        log.info("Принято событие от сенсора: {}", event);
        // Здесь можно вызвать kafkaProducer.sendToSensorTopic(event);
    }

    @PostMapping("/hubs")
    @Operation(summary = "Обработчик событий хабов")
    public void collectHubEvent(@Valid @RequestBody HubEvent event) {
        log.info("Принято событие от хаба: {}", event);
        // Здесь можно вызвать kafkaProducer.sendToHubTopic(event);
    }
}
