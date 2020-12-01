import Domain.Member;
import Domain.Movie;
import Domain.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTicketing {

    public static final Scanner sc = new Scanner(System.in);

    // 로그인 했냐 안했냐 무언가. -> Member 변수
    private static Member loginMember = null;
    private static boolean running = true;
    private static int input;

    private static ArrayList<Member> memberRepository = new ArrayList<>();

    private static ArrayList<Movie> movieRepository = new ArrayList<>();

    private static ArrayList<Room> roomRepository = new ArrayList<>();
//    private static

    public static void main(String[] args) {
        // TODO : 영화 예매 프로그램 시작하기.

        try {
            // 1. 메인화면
            while (running) {

                System.out.println("========[메뉴를 선택하세요.]========\n");
                System.out.println("1. 예매    2. 로그인    3. 회원가입    0. 종료\n");
                System.out.println("==================================");
                System.out.print("입력 : ");
                input = sc.nextInt();

                // TODO : 예매
                if (input == 1) {
                    if (loginMember == null) {
                        System.out.println("\n\n\n          로그인 해주세요.\n\n\n");
                        continue;
                    }
                    System.out.println("========[영화를 선택해주세요.]========\n");
                    // TODO : 영화 리스트 forEach
                    System.out.println("0. 취소");
                    System.out.println("\n===============================");
                    input = sc.nextInt();
//                    if (input > 0) {
                    // TODO : 영화 선택 후 로직
//                    }


                }

                // TODO : 로그인
                if (input == 2) {
                    loginMember = new Member();
                    System.out.println("============[로그인]============\n");
                    System.out.print("이름 : ");
                    loginMember.setName(sc.next());
                    if(memberRepository.stream().anyMatch(m -> m.getName().equals(loginMember.getName()))){
                        System.out.println("\n로그인 성공!");
                    }else{
                        System.out.println("\n등록되지 않은 회원입니다.");
                    }


                    System.out.println("\n===========================");

                }
                // TODO : 회원가입
                if (input == 3) {
                    System.out.println("============[회원가입]============\n");
                    Member signUpMember = new Member();
                    System.out.print("이름 : ");
                    signUpMember.setName(sc.next());
                    System.out.print("\n나이 : ");
                    signUpMember.setAge(sc.nextInt());
                    memberRepository.add(signUpMember);
                    System.out.println("\n=================================");
                }
                // TODO : 종료
                if (input == 0) {
                    System.out.println("============[종료 합니다.]============\n");
                    running = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
