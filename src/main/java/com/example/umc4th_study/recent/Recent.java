package com.example.umc4th_study.recent;

import com.example.umc4th_study.member.Member;
import com.example.umc4th_study.utils.BaseTimeEntity;
import com.example.umc4th_study.work.Work;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Recent extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String date;

	private Member member;

	private Work work;
}
