package com.example.Hackentine.Entity;

import java.util.Base64;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private String eventName;
    private String eventDate;
    private int teamSize;
    private String eventType;
    private String duration;
    private boolean internship;
    private String rank1Prize;
    private String rank2Prize;
    private String rank3Prize;
    
    @Column(columnDefinition = "TEXT")
    private String poster; // Store Base64 String directly

    public void setPoster(String base64Poster) {
        this.poster = base64Poster;
    }

    public String getPoster() {
        return this.poster;
    }

    
    @Lob
    @Column(columnDefinition = "TEXT")
    private String description;
}
