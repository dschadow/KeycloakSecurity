package de.dominikschadow.keycloaksecurity.projects;

import de.dominikschadow.keycloaksecurity.api.ProjectApi;
import de.dominikschadow.keycloaksecurity.model.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController implements ProjectApi {
    @Override
    public ResponseEntity<Project> readProjects() {
        return ProjectApi.super.readProjects();
    }
}
