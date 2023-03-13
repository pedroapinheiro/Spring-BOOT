package org.generation.atividadehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/bsm/objetivo")
public class AtividadeBsm {
    
    @GetMapping("/bsm")
    public String bsm() {
        return "BSMs da Generation Brasil - Lista " +
                "- Persistência<br>" +
                "- Mentalidade de Crescimento<br> " +
                "- Orientação ao Futuro<br> " +
                "- Responsabilidade Pessoal<br> " +
                "- Trabalho em Equipe<br> " +
                "- Comunicação<br> " +
                "- Comunicação Não Violenta<br> " +
                "- Atenção para Detalhes<br> " +
                "- Proatividade<br> ";
    }

    @GetMapping("/objetivo")
    public String objetivo() {
        return "Objetivos da semana:" +
                "Aulas Spring" +
                "Entrega de atividades " +
                "Desenvolvimento do Projeto" +
                "Assistir vídeos da plataforma";
    }
}