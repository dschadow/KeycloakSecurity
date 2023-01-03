package de.dominikschadow.keycloaksecurity.project_details;

import de.dominikschadow.keycloaksecurity.api.ProjectDetailsApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectDetailsController implements ProjectDetailsApi {
    @Override
    public ResponseEntity<Void> readProjectDetails() {
        return ProjectDetailsApi.super.readProjectDetails();
    }
}
