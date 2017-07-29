package com.intelisoft.model;

import java.util.List;

public class Lessons extends Model{

	private static final long serialVersionUID = -1666874779326644816L;

	private Short sequenceNumber;
	private String name;
	private List<Topics> topics;
	private Courses course;
	private List<CompleteLessons> completeLessons;

}
