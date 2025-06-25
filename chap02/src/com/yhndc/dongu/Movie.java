package com.yhndc.dongu;

public class Movie {
	String title;
	int runTime;
	String genre;

	Movie() {
		this("더 퍼스트 슬램덩크", 124, "스포츠");
	}

	Movie(String title, int runTime, String genre) {
		this.title = title;
		this.runTime = runTime;
		this.genre = genre;
	}

	void printMovieInfo() {
		System.out.println("영화: " + title + ", 상영 시간: " + runTime + ", 장르: " + genre);
		if (runTime >= 120) {
			System.out.println(title + "은/는 긴 영화입니다.");
		} else {
			System.out.println(title + "은/는 짧은 영화입니다.");
		}
	}

	void checkLength(int run) {
		if (run >= 120) {
			System.out.println(title + "은 긴 영화입니다.");
		} else {
			System.out.println(title + "은 짧은 영화입니다.");
		}

	}
}
