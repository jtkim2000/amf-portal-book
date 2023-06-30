package com.factory.woodo.member.model;

import com.factory.woodo.cmn.model.AmfBaseEntity;
import jakarta.persistence.Column;
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

    @Column(unique = true)
    private String email;
    private String password;
}
