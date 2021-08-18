package com.dsu2021.pj.domain.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Category {
	private Long categoryIndex;
	private String location;
	private String kind;
}
