package com.factory.demo.post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Data
public class Post extends AmfBaseEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private Author author;
}
