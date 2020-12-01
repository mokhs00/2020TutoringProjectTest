import Domain.Movie;

import java.util.ArrayList;

public class MovieTicketing {

    // 로그인 했냐 안했냐 무언가. boolean 변수

    public static void main(String[] args) {
        // TODO : 영화 예매 프로그램 시작하기.

        print("헿");
        Movie movie1 = new Movie();
        movie1.setAgeLimit(1);
        Movie movie2 = new Movie();
        movie2.setAgeLimit(2);
        Movie movie3 = new Movie();
        movie3.setAgeLimit(3);
        Movie movie4 = new Movie();
        movie4.setAgeLimit(4);

        ArrayList<Movie> movieArrayList = new ArrayList<>();

        movieArrayList.add(movie1);
        movieArrayList.add(movie2);
        movieArrayList.add(movie3);
        movieArrayList.add(movie4);

        movieArrayList.forEach(m -> System.out.println(m.getAgeLimit()));






    }

    public static void print(String target){
        // 출력해주는 기능
        System.out.println(target);
    }


}
