package com.boulhosa.notificacao.controller;

import com.boulhosa.notificacao.business.EmailService;
import com.boulhosa.notificacao.business.dtos.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefaDTO tarefaDTO){

        emailService.enviarEmail(tarefaDTO);
        return ResponseEntity.ok().build();

    }
}
