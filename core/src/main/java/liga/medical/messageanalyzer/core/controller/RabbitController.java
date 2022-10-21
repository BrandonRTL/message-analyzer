package liga.medical.messageanalyzer.core.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.messageanalyzer.core.config.RabbitConfig;
import liga.medical.dto.RabbitMessageDto;
import liga.medical.messageanalyzer.core.api.service.RabbitSenderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class RabbitController {
    private final RabbitSenderService rabbitSenderService;

    public RabbitController(RabbitSenderService rabbitSenderService) {

        this.rabbitSenderService = rabbitSenderService;
    }

    @PostMapping
    public void sendMessage(@RequestBody RabbitMessageDto message) throws JsonProcessingException {
        rabbitSenderService.sendMessage(message, RabbitConfig.ROUTER_QUEUE_NAME);
    }
}
