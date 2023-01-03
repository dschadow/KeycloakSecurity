package de.dominikschadow.keycloaksecurity.projects;

import de.dominikschadow.keycloaksecurity.api.ProjectApi;
import de.dominikschadow.keycloaksecurity.model.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController implements ProjectApi {
    @Override
    public ResponseEntity<List<Project>> readProjects() {
        return ProjectApi.super.readProjects();
    }
}
