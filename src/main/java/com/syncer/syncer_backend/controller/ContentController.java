package com.syncer.syncer_backend.controller;

import com.syncer.syncer_backend.model.Content;
import com.syncer.syncer_backend.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping("/trending")
    public ResponseEntity<List<Content>> getTrending() {
        List<Content> trending = contentService.getTrendingContent();
        return ResponseEntity.ok(trending);
    }

    @GetMapping("/new-releases")
    public ResponseEntity<List<Content>> getNewReleases() {
        List<Content> newReleases = contentService.getNewReleases();
        return ResponseEntity.ok(newReleases);
    }
}