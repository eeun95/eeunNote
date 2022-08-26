package com.eeunnote.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Board {
    @Id @GeneratedValue
    private Long no;                    // 게시글 번호
    private Enum<Category> category;    // 카테고리
    private String title;               // 제목
    private String content;             // 내용
    @Column(name = "regist_date")
    private LocalDate registDate;       // 등록일
    @Column(name = "edit_date")
    private LocalDate editDate;         // 수정일

    public Long getNo() {
        return no;
    }

    public Enum<Category> getCategory() {
        return category;
    }

    public void setCategory(Enum<Category> category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getRegistDate() {
        return registDate;
    }

    public void setRegistDate(LocalDate registDate) {
        this.registDate = registDate;
    }

    public LocalDate getEditDate() {
        return editDate;
    }

    public void setEditDate(LocalDate editDate) {
        this.editDate = editDate;
    }
}
