package org.sparta.memo.entity;

import lombok.*;
import org.sparta.memo.dto.MemoRequestDto;
import jakarta.persistence.*;

@Entity // JPA가 관리할 수 있는 Entity 클래스 지정
@Data
@Table(name = "memo") // 매핑할 테이블의 이름을 지정
@NoArgsConstructor
@AllArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "contents", nullable = false, length = 500)
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