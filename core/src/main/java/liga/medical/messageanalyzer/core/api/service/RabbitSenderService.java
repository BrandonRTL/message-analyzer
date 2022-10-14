package liga.medical.messageanalyzer.core.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.dto.RabbitMessageDto;

public interface RabbitSenderService {
    void sendMessage(RabbitMessageDto messageDto, String queue) throws JsonProcessingException;
}
