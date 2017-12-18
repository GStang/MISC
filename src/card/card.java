package card;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by DELL on 2016/10/13.
 */
public class card {
    public static String[] createCard(int number) {
        if (number < 2) {
            number = 2;
        }
            int cardNumber = number * 52;
            String[] cards = new String[cardNumber];
            int suit;
            int face;
            for (int i = 0; i < cardNumber; i++) {
                cards[i] = new String();
                suit = i % 4;
                switch (suit) {
                    case 0:
                        cards[i] = "红桃";
                        break;
                    case 1:
                        cards[i] = "黑桃";
                        break;
                    case 2:
                        cards[i] = "方块";
                        break;
                    case 3:
                        cards[i] = "梅花";
                        break;
                }
                face = i % 13;
                switch (face) {
                    case 0:
                        cards[i] = cards[i] + "A";
                        break;
                    case 1:
                        cards[i] = cards[i] + "2";
                        break;
                    case 2:
                        cards[i] = cards[i] + "3";
                        break;
                    case 3:
                        cards[i] = cards[i] + "4";
                        break;
                    case 4:
                        cards[i] = cards[i] + "5";
                        break;
                    case 5:
                        cards[i] = cards[i] + "6";
                        break;
                    case 6:
                        cards[i] = cards[i] + "7";
                        break;
                    case 7:
                        cards[i] = cards[i] + "8";
                        break;
                    case 8:
                        cards[i] = cards[i] + "9";
                        break;
                    case 9:
                        cards[i] = cards[i] + "10";
                        break;
                    case 10:
                        cards[i] = cards[i] + "J";
                        break;
                    case 11:
                        cards[i] = cards[i] + "Q";
                        break;
                    case 12:
                        cards[i] = cards[i] + "K";
                        break;
                }
            }
        return  cards;
    }

    public static void display(String[] cards) {
        for(int i = 0;i<cards.length;i++){
            System.out.printf("%-7s",cards[i]);
            if ((i+1)%13==0) {
                System.out.println();
            }
        }
    }
    public static void shuffle(String[] cards){
        Random r = new Random();
        String tmp = null;
        for(int i = 0;i<cards.length;i++){
            int k1 = r.nextInt(cards.length);
            int k2 = r.nextInt(cards.length);
            tmp = cards[k1];
            cards[k2] = tmp;
        }
    }

    public static void distribute(String[] cards,int player){
        int num = cards.length/player;
        for(int j = 0;j<cards.length;j++){
            System.out.printf("%-10s",cards[j]);
            if((j+1)%13==0) System.out.println();
            if ((j+1)%num==0){
                System.out.println("第"+(j+1)/num+"个人的牌如上");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number of pork:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] cards=createCard(num);
        System.out.println("Input a number of player:");
        Scanner sp=new Scanner(System.in);
        int per=sp.nextInt();
        System.out.println("显示所有的牌");
        display(cards);
        shuffle(cards);
        System.out.println(" 显示分配给每个人的牌：");
        distribute(cards,per);
    }
}

