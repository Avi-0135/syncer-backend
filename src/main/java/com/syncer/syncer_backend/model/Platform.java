package com.syncer.syncer_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "platforms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "color_hex")
    private String colorHex;

    @Column(name = "website_url")
    private String websiteUrl;

    @Column(name = "monthly_price")
    private Double monthlyPrice;
}