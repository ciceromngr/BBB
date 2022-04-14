package me.dio.coding.votacao.bbb.api.repository;

import me.dio.coding.votacao.bbb.api.model.ParticipantsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipantsRepository extends MongoRepository<ParticipantsModel, String> {
}
