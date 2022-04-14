package me.dio.coding.votacao.bbb.api.controller;


import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParticipantsModel;
import me.dio.coding.votacao.bbb.api.repository.ParticipantsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participants")
@AllArgsConstructor
public class ParticipantsController {

    private final ParticipantsRepository repository;

    @PostMapping("/saving")
    public ResponseEntity<ParticipantsModel> save(@RequestBody ParticipantsModel participantsModel) {
        ParticipantsModel saving = repository.save(participantsModel);
        return ResponseEntity.ok(saving);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ParticipantsModel>> getAllParticipants() {
        List<ParticipantsModel> participants = repository.findAll();
        return ResponseEntity.ok(participants);
    }

    @GetMapping
    public ResponseEntity<ParticipantsModel> getParticipantsById(@RequestParam String id) {
        Optional<ParticipantsModel> opt = repository.findById(id);
        if(opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(opt.get());
    }


}
