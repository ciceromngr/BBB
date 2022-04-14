package me.dio.coding.votacao.bbb.api.service;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParticipantsModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VoteService {

    private static final String TOPIC_VOTE = "vote";
    private final KafkaTemplate<Object, Object> template;

    public void addEevent(ParticipantsModel participantsModel) {
        template.send(TOPIC_VOTE, participantsModel);
    }

}
