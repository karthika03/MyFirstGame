/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Win10
 */
public class UnoDeckCards {
    private int Number;
    private ArrayList<UnoCard> multiplecards;
    public UnoDeckCards(){
        multiplecards=new ArrayList<UnoCard>();
    }

    public ArrayList<UnoCard> getList() {
        return multiplecards;
    }

    public int getNumber() {
        Number=multiplecards.size();
        return Number;
    }
    public void setValue(int num) {
        Number =num;
    }
public void AddCard(UnoCard unocard){
    multiplecards.add(unocard);
    
}
    public void CreateNewDeck(){
        String a="";
        String b="";
        int c=0;
        String color[]={"Red","Yellow","Blue","Green","Black"};
        String cardtype[]={"Normal","Reverse","skip","Draw(+2)","Wild","Wild Draw(+4)"};
        int cardvalue[]={0,1,2,3,4,5,6,7,8,9,20,50};
        for(int j=0;j<4;j++)
        {
            a=color[j];
            for(int i=1;i<10;i++){
                b=cardtype[0];
                c=cardvalue[i];
                UnoCard  xx=new UnoCard(a,b,c,a+b+c);
              
                UnoCard yy=new UnoCard(a,b,c,a+b+c);
                AddCard(xx);
                AddCard(yy);
            }
        }
        for(int i=0;i<4;i++)
        {
            a=color[i];b=cardtype[0];c=cardvalue[0];
            UnoCard xx=new UnoCard(a,b,c,a+b+c);
            AddCard(xx);
        }
        for (int i=0;i<4;i++)
        {
            a=color[i];
            for(int j=1;j<4;j++)
            {
                b=cardtype[j];
                c=cardvalue[10];
                UnoCard xx=new UnoCard(a,b,c,a+b+c);
                UnoCard yy=new UnoCard(a,b,c,a+b+c);
                AddCard(xx);
                AddCard(yy);
            }
        }
        for(int i=4;i<6;i++){
            a=color[4];
            b=cardtype[i];
            c=cardvalue[11];
            UnoCard x=new UnoCard(a,b,c,a+b+c);
            UnoCard y=new UnoCard(a,b,c,a+b+c);
            UnoCard xx=new UnoCard(a,b,c,a+b+c);
            UnoCard z=new UnoCard(a,b,c,a+b+c);
            AddCard(x);AddCard(y);AddCard(xx);AddCard(z);
        }
            }
    public UnoCard TakeAcard(){
        int a=(int)(Math.random()*(multiplecards.size()-1));
        UnoCard unocard=multiplecards.get(a);
        multiplecards.remove(a);
        return unocard;
    }
    public void getunocard( )
    {
        Iterator<UnoCard> i= multiplecards.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
                
        
    }  
        }
    

