package de.dominikschadow.duke_encounters.encounter;

import de.dominikschadow.duke_encounters.api.EncounterApi;
import de.dominikschadow.duke_encounters.model.Encounter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EncounterController implements EncounterApi {
    @Override
    public ResponseEntity<List<Encounter>> readEncounters() {
        return EncounterApi.super.readEncounters();
    }
}
