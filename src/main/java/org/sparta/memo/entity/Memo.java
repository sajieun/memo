package org.sparta.memo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sparta.memo.dto.MemoRequestDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Memo {
    private Long id;

    private String username;

    private String contents;

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void update(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
}
