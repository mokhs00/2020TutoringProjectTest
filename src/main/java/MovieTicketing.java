import Domain.Member;
import Domain.Movie;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicketing {


    private static final Scanner sc = new Scanner(System.in);

    private static Member loginMember = null;
    private static boolean running = true;
    private static int input;

    // memberRepository
    private static ArrayList<Member> memberRepository = new ArrayList<>();

    // movieRepository
    private static ArrayList<Movie> movieRepository = new ArrayList<>();

    // roomRepository

    public static void main(String[] args) {
        // TODO : 영화 예매 프로그램 시작하기.

        movieRepository.add(new Movie("런", LocalTime.of(1,29),15,"미스터리, 스릴러"));
        movieRepository.add(new Movie("라푼젤", LocalTime.of(1,40),0,"애니메이션, 모험"));
        movieRepository.add(new Movie("포드 V 페라리", LocalTime.of(2,32),12,"액션, 드라마"));
        movieRepository.add(new Movie("레 미제라블", LocalTime.of(2,40),12,"뮤지컬/드라마"));
        movieRepository.add(new Movie("해리포터", LocalTime.of(2,32),0,"판타지"));
        movieRepository.add(new Movie("어벤져스: 엔드게임", LocalTime.of(3,1),12,"액션, SF"));
        movieRepository.add(new Movie("극한직업", LocalTime.of(1,51),15,"코미디"));
        movieRepository.add(new Movie("범죄도시", LocalTime.of(2,1),19,"액션"));
        movieRepository.add(new Movie("겨울왕국", LocalTime.of(1,48),0,"애니메이션, 모험, 코미디, 가족, 판타지, 뮤지컬"));
        movieRepository.add(new Movie("시카고", LocalTime.of(1,53),15,"뮤지컬"));



        // 메인 화면
        while(running){

            System.out.println("=========[메뉴를 선택하세요.]=========\n");
            System.out.println("1. 예매   2. 로그인      3. 회원가입     0. 종료\n");
            System.out.println("====================================");
            System.out.print("입력 : ");
            input = sc.nextInt();

            // TODO : 예매
            if (input == 1) {
                if (loginMember == null){
                    System.out.println("\n\n\n      로그인 해주세요. \n\n\n");
                    continue;
                }
                System.out.println("=========[영화를 선택해주세요.]=========\n");
                for (Movie movie : movieRepository) {
                    System.out.println((movieRepository.indexOf(movie)+1)+". "
                            + movie.getName() + " / " + movie.getGenre() + " / "
                            + movie.getRunTime() + " / " + movie.getAgeLimit() +"세 이상");
                }
                System.out.println("0. 취소");
                System.out.println("====================================");
                System.out.print("입력 : ");
                input = sc.nextInt();

                if (input == 0){
                    continue;
                }
                // 영화 선택 후 로직

            }

            if (input == 2){
                if (loginMember != null){
                    System.out.println("\n\n\n 이미 로그인 되어있습니다!\n\n\n");
                }

                loginMember = new Member();
                System.out.println("=========[로그인]=========\n");
                System.out.print("이름 : ");
                loginMember.setName(sc.next());
                // 회원가입 검증
                if (memberRepository.stream().anyMatch(m -> m.getName().equals(loginMember.getName()))){
                    System.out.println("\n 로그인 성공!");
                }else{
                    System.out.println("\n 등록되지 않은 회원입니다.");
                    loginMember = null;
                }
                System.out.println("====================================");

            }

            if (input == 3){
                System.out.println("=========[회원가입]=========\n");
                Member signUpMember = new Member();
                System.out.print("이름 : ");
                signUpMember.setName(sc.next());
                System.out.print("\n나이 : ");
                signUpMember.setAge(sc.nextInt());
                memberRepository.add(signUpMember);
                System.out.println("====================================");
            }

            if (input == 0){
                running=false;
                System.out.println("\n\n\n 종료 . . .\n\n\n");
            }
        }

        sc.close();


    }

}
