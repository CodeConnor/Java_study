package com.xiaobang.test;

import com.xiaobang.domain.Movie;

import java.util.Scanner;

public class MovieService {

    private Movie[] movies;
    private Scanner sc = new Scanner(System.in);

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    /**
     * 启动电影信息管理系统
     */
    public void start() {

        lo:
        while (true) {
            System.out.println("----------电影信息系统----------");
            System.out.println("请输入您的选择:");
            System.out.println("1.查询每部电影评分信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出\n: ");

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    queryMoviesScore();
                    break;
                case 2:
                    queryMovieInfos();
                    break;
                case 3:
                    System.out.println("感谢您的使用, 再见!");
                    break lo;
                default:
                    System.out.println("您的输入有误, 请重新输入\n: ");
                    break;
            }
        }
    }

    // 查询电影评分
    private void queryMoviesScore() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println("tittle: " + movies[i].getTitle() + "---score: " + movies[i].getScore());
        }
    }

    // 按编号查询电影信息
    private void queryMovieInfos() {
        System.out.println("请输入需要查询的电影编号:");
        int id = sc.nextInt();
        Movie movie;

        for (int i = 0; i < movies.length; i++) {
            if (id == movies[i].getId()) {
                movie = movies[i];
                System.out.println("片名:" + movie.getTitle());
                System.out.println("评分:" + movie.getScore());
                System.out.println("导演:" + movie.getDirector());
                System.out.println("主演:" + movie.getStarring());
                System.out.println("类型:" + movie.getType());
                System.out.println("地区:" + movie.getArea());
                System.out.println("时间:" + movie.getTime());
                return;
            }
        }

        System.out.println("未查询到该电影编号, 请检查输入!");
    }


}








