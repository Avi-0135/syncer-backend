package com.syncer.syncer_backend.repository;

import com.syncer.syncer_backend.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContentRepository
        extends JpaRepository<Content, Long> {

    List<Content> findByIsTrendingTrue();

    List<Content> findByIsNewReleaseTrue();
}