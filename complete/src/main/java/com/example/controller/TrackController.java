package com.example.controller;

import com.example.model.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/track")
public class TrackController {

    private Curs curs; 

    public TrackController() {
        Trainer trainer = new Trainer("Costica Costin", "Java");
        List<Explorer> exploreri = Arrays.asList(
            new Explorer("Alex", "ID1"),
            new Explorer("Duta", "ID2")
        );
        List<Activitate> activitati = Arrays.asList(
            new Activitate("Workout", "Testeaza-ti cunostintele dobandite!"),
            new Activitate("Proiect", "Arata ce ai invatat!")
        );

        this.curs = new Curs("Cursul de Java", trainer, exploreri, activitati);
    }

    @GetMapping("/curs")
    public Curs getCurs() {
        return curs;
    }

    @GetMapping("/exploreri")
    public List<Explorer> getExploreri() {
        return curs.getExploreri();
    }
    
    @GetMapping("/trainer")
    public Trainer getTrainer() {
        return curs.getTrainer();
    }

    @GetMapping("/activitati")
    public List<Activitate> getActivitati() {
        return curs.getActivitati();
    }

    @GetMapping("/activitate")
    public Activitate getActivitateByName(@RequestParam String name) {
        return curs.getActivitati().stream()
                   .filter(activitate -> activitate.getName().equalsIgnoreCase(name))
                   .findFirst()
                   .orElse(null);
    }

    @GetMapping("/explorer/{id}")
    public Explorer getExplorerById(@PathVariable String id) {
        return curs.getExploreri().stream()
                   .filter(explorer -> explorer.getId().equals(id))
                   .findFirst()
                   .orElse(null);
    }

}
