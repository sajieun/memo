package org.sparta.memo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sparta.memo.entity.Memo;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemoResponseDto {

    private Long id;

    private String username;

    private String contents;

    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.username = memo.getUsername();
        this.contents = memo.getContents();
    }
}
