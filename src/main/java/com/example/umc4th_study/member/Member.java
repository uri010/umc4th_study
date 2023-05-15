package com.example.umc4th_study.member;

import java.util.ArrayList;
import java.util.List;

import com.example.umc4th_study.episode.Episode;
import com.example.umc4th_study.recent.Recent;
import com.example.umc4th_study.utils.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Member extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nickName;

	private String profileImage;

	@Column(nullable = false)
	private String joinDate;

	@OneToMany(mappedBy = "member")
	private List<Recent> recents = new ArrayList<>();
}
