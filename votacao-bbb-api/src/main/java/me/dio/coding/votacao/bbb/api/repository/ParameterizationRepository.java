package me.dio.coding.votacao.bbb.api.repository;

import me.dio.coding.votacao.bbb.api.model.ParameterizationModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParameterizationRepository extends MongoRepository<ParameterizationModel, String> {
}
