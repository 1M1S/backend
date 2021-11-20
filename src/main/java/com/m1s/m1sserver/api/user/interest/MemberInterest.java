package com.m1s.m1sserver.api.user.interest;

import com.m1s.m1sserver.api.admin.interest.Interest;
import com.m1s.m1sserver.auth.member.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class MemberInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    @Getter @Setter
    private Member member;

    @ManyToOne
    @JoinColumn(name = "interest_id")
    @Getter @Setter
    private Interest interest;

    @Getter @Setter
    private Integer level;
}
