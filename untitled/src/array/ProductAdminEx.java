package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_PRODUCTS = 10;
        // 배열 선언
        String[] productNames = new String[10];
        int[] productPrices = new int[10];


        int productCount = 0;   // 힌트********

        while (true) {  // 힌트: 종료를 선택할 때까지 계속해서 반복되기 때문************
            System.out.println("1. 상품 등록| 2. 상품 목록| 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // nextInt 후에 남은 줄바꿈 문자 제거************

            if (choice == 1) {
//                String lastProductName = productNames.toString();   // NullPointerException 에러를 없애기 위해 문자열로 명시
//                ObjectUtils.notEqual(%s, %s) = %s"
                if (productCount < MAX_PRODUCTS) {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();
                    scanner.nextLine(); // nextInt 후에 남은 줄바꿈 문자 제거************

                    productCount++;

                }else {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
            }

            if (choice == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");    // 왜 메뉴가 출력이 안될까..? => nextLine() 코드를 추가했어야했음.
                }
                //                for (String productName : productNames) {
//                    for (int productPrice : productPrices) {
//                        System.out.println(productName + ": " + productPrice + "원");
//                    }
//                }
            }
            if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
        }

    }
