package de.dominikschadow.keycloaksecurity.projects_overview;

import de.dominikschadow.keycloaksecurity.api.ProjectOverviewApi;
import de.dominikschadow.keycloaksecurity.model.ProjectOverview;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectOverviewController implements ProjectOverviewApi {
    @Override
    public ResponseEntity<List<ProjectOverview>> readProjectOverview() {
        return ProjectOverviewApi.super.readProjectOverview();
    }
}
