package com.example.umc4th_study.work;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import com.example.umc4th_study.author.Author;
import com.example.umc4th_study.episode.Episode;
import com.example.umc4th_study.recent.Recent;
import com.example.umc4th_study.utils.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Work extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String workTitle;

	@Column(nullable = false)
	private String day;

	@Column(nullable = false)
	private Double GPA;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	@OneToMany(mappedBy = "work")
	private List<Episode> episodes = new ArrayList<>();

	@OneToMany(mappedBy = "work")
	private List<Recent> recents = new ArrayList<>();
}