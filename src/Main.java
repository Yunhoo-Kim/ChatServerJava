import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public void mainaAA(){


        System.out.println("#### 끝말 잇기 게임을 시작하겠습니다. ####");
        Scanner scan = new Scanner(System.in);


        boolean turn = true;

        ArrayList<String> strList = new ArrayList<String>();


        HashMap<String, Integer> ordered = new HashMap<>(); // 카페의 메뉴를 저장
        HashMap<String, Integer> menu = new HashMap<>(); // 카페의 메뉴를 저장

        menu.put("아아",  5000);
        menu.put("카페라떼", 5500);
        ordered.put("아아", 0);
        ordered.put("카페라떼", 0);
        ordered.put("아아", 1);


        for( String key : menu.keySet() ){
            System.out.println( String.format("키 : %s, 값 : %s", key, menu.get(key)) );
        }
//        System.out.println("Player 1 : 단어를 입력하세요.");
//        String lastWord = scan.nextLine();
//
//
//        while(true){
//            strList.add(lastWord);
//            String playerName = "Player 1";
//            if(turn)
//                playerName = "Player 2";
//
//            System.out.println(playerName+" : 단어를 입력하세요. ");
//            String temp = scan.nextLine();
//
//            if(!lastWord.substring(lastWord.length() - 1).equals(temp.substring(0, 1)) || temp.length() < 2){
//                System.out.println("게임을 종료합니다. ");
//                playerName = "Player 1";
//                if (!turn)
//                    playerName = "Player 2";
//                System.out.println("게임을 종료합니다.");
//                System.out.println("승자는 " + playerName);
//                break;
//            }
//            lastWord = temp;
//            turn = !turn;
//        }
//
//        System.out.println("\n####게임에서 나온 단어 목록####");
//        for(String a : strList){
//           System.out.print(a + " ");
//        }

    }
}
