package com.spring.spring_boot_study.Question;

import java.time.LocalDateTime;
import java.util.List;

import com.spring.spring_boot_study.Answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // 이 애너테이션을 적용해야 QUestion()을 엔터티로 인식.
public class Question {
    @Id // 기본키로 설정한다.
    @GeneratedValue // 데이터를 저장할 떄해상 속성에 값을 자동으로 1씩 증가하여 저장한다.
    private Integer Id;

    @Column(length = 200)
    private String subject;;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
    
}
