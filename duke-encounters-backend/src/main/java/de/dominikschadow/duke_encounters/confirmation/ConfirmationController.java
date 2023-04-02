package de.dominikschadow.duke_encounters.confirmation;

import de.dominikschadow.duke_encounters.api.ConfirmationApi;
import de.dominikschadow.duke_encounters.model.ConfirmationList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfirmationController implements ConfirmationApi {
    @Override
    public ResponseEntity<ConfirmationList> readLatestConfirmations() {
        return ConfirmationApi.super.readLatestConfirmations();
    }

    @Override
    public ResponseEntity<ConfirmationList> readOwnConfirmations() {
        return ConfirmationApi.super.readOwnConfirmations();
    }
}
