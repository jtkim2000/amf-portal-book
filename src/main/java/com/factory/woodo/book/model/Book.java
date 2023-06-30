package com.factory.woodo.book.model;

import com.factory.woodo.cmn.model.AmfBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Book extends AmfBaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String category;
    private String rentStatus;
    private Author author;

    public void update(String title, String content, String category, String rentStatus) {
        this.title = title;
        this.content = content;        
        this.category = category;              
        this.rentStatus = rentStatus;
    }
}
