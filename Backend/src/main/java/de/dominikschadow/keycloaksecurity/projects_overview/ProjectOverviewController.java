package de.dominikschadow.keycloaksecurity.projects_overview;

import de.dominikschadow.keycloaksecurity.api.ProjectOverviewApi;
import de.dominikschadow.keycloaksecurity.model.ProjectOverview;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectOverviewController implements ProjectOverviewApi {
    @Override
    public ResponseEntity<ProjectOverview> readProjectOverview() {
        return ProjectOverviewApi.super.readProjectOverview();
    }
}
