package life.richard.community.dto;

import lombok.Data;

/**
 * Created by Richard on 2020/5/18.
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
