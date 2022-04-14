package me.dio.coding.votacao.bbb.api.controller;

import me.dio.coding.votacao.bbb.api.model.ParameterizationModel;
import me.dio.coding.votacao.bbb.api.repository.ParameterizationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parameterizations")
public class ParameteriazationController {

    private final ParameterizationRepository repository;

    public ParameteriazationController(ParameterizationRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/saving")
    public ResponseEntity<ParameterizationModel> save(@RequestBody ParameterizationModel parameter) {
        ParameterizationModel savedParameter = repository.save(parameter);
        return ResponseEntity.ok(savedParameter);
    }

    @GetMapping("/query")
    public ResponseEntity<ParameterizationModel> queryParameterization(@RequestParam String key) {
        Optional<ParameterizationModel> optParameter = repository.findById(key);
        if(optParameter.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optParameter.get());
    }
}
