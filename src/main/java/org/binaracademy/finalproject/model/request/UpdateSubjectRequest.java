package org.binaracademy.finalproject.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSubjectRequest {

    private String title;
    private String code;
    private String description;
    private String linkVideo;
    private Boolean isPremium;
}