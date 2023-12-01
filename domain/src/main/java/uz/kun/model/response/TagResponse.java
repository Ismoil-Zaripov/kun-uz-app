package uz.kun.model.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TagResponse {
    private Integer id;
    private String key;
    private String name;
    private String nameUz;
    private String nameRu;
    private String nameEn;
    private Boolean visible;
    private Integer creatorId;
    private LocalDateTime createdDate;
}
