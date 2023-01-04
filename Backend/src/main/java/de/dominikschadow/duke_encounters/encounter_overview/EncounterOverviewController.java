package de.dominikschadow.duke_encounters.encounter_overview;

import de.dominikschadow.duke_encounters.api.EncounterOverviewApi;
import de.dominikschadow.duke_encounters.model.EncounterOverview;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EncounterOverviewController implements EncounterOverviewApi {
    @Override
    public ResponseEntity<List<EncounterOverview>> readEncountersOverview() {
        return EncounterOverviewApi.super.readEncountersOverview();
    }
}
