package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart")
@Getter @Setter
@ToString
public class Cart {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Make 'id' as PK
    private Long id;

    //Make 'member_id' as FK
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
