package com.xiaobang.test;

import com.xiaobang.domain.Movie;

public class MovieTest {

    public static void main(String[] args) {

        Movie mv1 = new Movie(1, "敦刻尔克", "2017", 8.4, "英国", "战争", "克里斯托弗.诺兰", "菲恩.怀特海德");
        Movie mv2 = new Movie(2, "致命魔术", "2006", 8.9, "英国", "悬疑", "克里斯托弗.诺兰", "休.杰克曼");
        Movie mv3 = new Movie(3, "追随", "1998", 8.9, "英国", "犯罪", "克里斯托弗.诺兰", "杰里米");

        Movie[] movies = {mv1, mv2, mv3};

        MovieService movieService = new MovieService(movies);
        movieService.start();
    }
}
