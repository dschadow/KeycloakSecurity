package de.dominikschadow.keycloaksecurity.projects;

import de.dominikschadow.keycloaksecurity.api.ProjectsApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController implements ProjectsApi {
    @Override
    public ResponseEntity<Void> readProjects() {
        return ProjectsApi.super.readProjects();
    }
}
