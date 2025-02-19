package com.example.Hackentine.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
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
    private String description;
}
