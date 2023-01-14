package de.dominikschadow.duke_encounters.encounter;

import de.dominikschadow.duke_encounters.api.EncounterApi;
import de.dominikschadow.duke_encounters.model.CreateEncounter;
import de.dominikschadow.duke_encounters.model.Encounter;
import de.dominikschadow.duke_encounters.model.EncounterList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class EncounterController implements EncounterApi {
    @Override
    public ResponseEntity<Encounter> createEncounter(CreateEncounter createEncounter) {
        return EncounterApi.super.createEncounter(createEncounter);
    }

    @Override
    public ResponseEntity<Encounter> readEncounter(UUID encounterId) {
        return EncounterApi.super.readEncounter(encounterId);
    }

    @Override
    public ResponseEntity<EncounterList> readEncounters() {
        return EncounterApi.super.readEncounters();
    }

    @Override
    public ResponseEntity<EncounterList> readLatestEncounters() {
        return EncounterApi.super.readLatestEncounters();
    }
}
