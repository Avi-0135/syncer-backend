package com.syncer.syncer_backend.service;

import com.syncer.syncer_backend.model.Content;
import com.syncer.syncer_backend.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public List<Content> getTrendingContent() {
        return contentRepository.findByIsTrendingTrue();
    }

    public List<Content> getNewReleases() {
        return contentRepository.findByIsNewReleaseTrue();
    }
}