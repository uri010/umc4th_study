package com.example.umc4th_study.episode;

import com.example.umc4th_study.utils.BaseTimeEntity;
import com.example.umc4th_study.work.Work;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Episode extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String episodeTitle;

	@Column(nullable = false)
	private Double GPA;

	@ManyToOne
	@JoinColumn(name = "work_id")
	private Work work;
}