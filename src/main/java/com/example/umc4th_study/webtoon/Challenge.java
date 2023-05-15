package com.example.umc4th_study.webtoon;

import com.example.umc4th_study.work.Work;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Challenge extends Work {
	@Column(nullable = false)
	private Long see;

	@Column(nullable = false)
	private Long heart;
}
