package practiceMVC.controller;

import java.util.Scanner;

public class BoardApp {
    ArticleController articleController = new ArticleController();
    Scanner scan = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.print("명령어 입력 : ");
            String command = scan.nextLine();
            //article 이 뭔지부터 정의하자


            if (command.equals("exit")) {
                break;


            } else if (command.equals("add")) {
                articleController.add();


            } else if (command.equals("list")) {
                System.out.print("수정할 게시물 번호 : ");
                articleController.list();


            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                articleController.update();


            } else if (command.equals("delete")) {
                articleController.delete();


            } else if (command.equals("detail")) {
                articleController.detail();
            }
        }
    }
}