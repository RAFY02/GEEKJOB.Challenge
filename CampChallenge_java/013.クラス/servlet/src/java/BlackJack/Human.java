/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 研人
 */
    //**----------Humanのクラス（継承先）-----------**//

    abstract class Human {
        
        //abstractなメソッド
        abstract public int open();
        abstract public void setCard(ArrayList<Integer> set);
        abstract public boolean checkSum();
        
        //ディール、ヒットしたカードをまとめて、所持する変数
        public static ArrayList<Integer>dealermyCards = new ArrayList();
        public static ArrayList<Integer>usermyCards = new ArrayList();
    }

//**----------ディーラーのクラス（継承先）-----------**//

class Dealer extends Human {
    
    //----------以下ディーラークラス限定のメソッド----------//
    
        
        ArrayList<Integer> cards = new ArrayList();
        
        // ディーラーに全カードを持たせ、シャッフルする初期値
        public Dealer(){
            
            cards.add(1); cards.add(1); cards.add(1); cards.add(1); 
            cards.add(2); cards.add(2); cards.add(2); cards.add(2);
            cards.add(3); cards.add(3); cards.add(3); cards.add(3);
            cards.add(4); cards.add(4); cards.add(4); cards.add(4);
            cards.add(5); cards.add(5); cards.add(5); cards.add(5);
            cards.add(6); cards.add(6); cards.add(6); cards.add(6);
            cards.add(7); cards.add(7); cards.add(7); cards.add(7);
            cards.add(8); cards.add(8); cards.add(8); cards.add(8);
            cards.add(9); cards.add(9); cards.add(9); cards.add(9);
            cards.add(10); cards.add(10); cards.add(10); cards.add(10);
            cards.add(11); cards.add(11); cards.add(11); cards.add(11);
            cards.add(11); cards.add(11); cards.add(11); cards.add(11);
            cards.add(11); cards.add(11); cards.add(11); cards.add(11);
            
            Collections.shuffle(cards);
        }
        //ディーラーが2枚のカードを引き、myCardsに追加するメソッド
        public ArrayList<Integer> deal(){
            
            ArrayList <Integer> drawcards = new ArrayList(); 
            
            int n =(cards.get(0));
            cards.remove(0);
            int m =(cards.get(0));
            cards.remove(0);
            
            drawcards.add(n);drawcards.add(m);
            
            return drawcards;
        }
        // ディーラーが追加でカードを一枚引き、myCardsに追加するメソッド
        public ArrayList<Integer> hit(){
            
            ArrayList <Integer> drawcard = new ArrayList();
            
            int l =(cards.get(0));
            cards.remove(0);
            
            drawcard.add(l);
            
            return drawcard;
            }
        
        //----------以下Humanクラスに共通のメソッド-----------//
        
        
        //引いたカードの合計値を計算し、その合計を返すメソッド
        @Override
        public int open(){
            int sum = 0;
            for(int i = 0; i < dealermyCards.size(); i++){
                sum += dealermyCards.get(i); 
            }
        return sum;
        }
        
        //配られたカードを「myCards」に格納するメソッド
        @Override
        public void setCard(ArrayList<Integer> set){
            for(int i = 0;i < set.size(); i++){
                dealermyCards.add(set.get(i));
            }
        }
        
        //カードの値が16以下ならtrue、17以上ならfalseを返すメソッド
        
        @Override
        public boolean checkSum(){
            
            if(open() < 17){
                return true;
            }
            return false;
          }
        }

//**----------ユーザーのクラス（継承先）-----------**//

class User extends Human{
    
    //----------以下Humanクラスに共通のメソッド-----------//
    
    
    //引いたカードの合計値を計算し、合計を返すメソッド
        @Override
        public int open(){
            int sum = 0;
            for(int i = 0; i < usermyCards.size(); i++){
                sum += usermyCards.get(i); 
            }
        return sum;
        }
        
        //配られたカードを「myCards」に格納するメソッド
        @Override
        public void setCard(ArrayList<Integer> set){
            for(int i = 0;i < set.size(); i++){
                usermyCards.add(set.get(i));
            }
        }
        
        //カードが17以下ならtrue、18以上ならfalseを返すメソッド
        @Override
        public boolean checkSum(){
            
            if(open() < 18){
                
                return true;
            }
            return false;
        }
}