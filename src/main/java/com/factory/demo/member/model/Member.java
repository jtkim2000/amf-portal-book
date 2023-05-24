package com.factory.demo.member.model;

import com.factory.demo.cmn.model.AmfBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Member extends AmfBaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String nickname;
    private String email;
    private String password;
}
