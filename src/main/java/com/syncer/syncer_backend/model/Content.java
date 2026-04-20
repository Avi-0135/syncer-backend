package com.syncer.syncer_backend.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "content")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(name = "poster_emoji")
    private String posterEmoji;

    @Column(name = "imdb_rating")
    private Double imdbRating;

    private String genre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @Column(name = "is_trending")
    private Boolean isTrending = false;

    @Column(name = "is_new_release")
    private Boolean isNewRelease = false;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}