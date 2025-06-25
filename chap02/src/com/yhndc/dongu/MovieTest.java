package com.yhndc.dongu;

public class MovieTest {

	public static void main(String[] args) {
		Movie myMovie = new Movie();
		myMovie.printMovieInfo();

		Movie myMovie2 = new Movie("어벤져스", 111, "액션");
		myMovie2.printMovieInfo();
	}

}
