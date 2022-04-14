package me.dio.coding.votacao.bbb.api.controller;

import lombok.AllArgsConstructor;
import me.dio.coding.votacao.bbb.api.model.ParticipantsModel;
import me.dio.coding.votacao.bbb.api.service.VoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voted")
@AllArgsConstructor
public class VoteController {

    private final VoteService service;

    @PostMapping
    public ResponseEntity<String> vote(@RequestBody ParticipantsModel participant) {
        service.addEevent(participant);
        return ResponseEntity.ok("voto computado");
    }

}
