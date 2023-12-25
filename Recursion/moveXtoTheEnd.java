import java.util.*;
public class moveXtoTheEnd{
    public static void moveX(String str,int idx,int count,String newString){
    //    base case 
        if(idx==str.length()){
            for(int i=0; i<=count;i++){
                newString+='x';
            }
            System.out.println("move all x to the end:"+newString);
            return;
        }


        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveX(str, idx+1, count, newString);
        }
        else{
            newString+=currChar;
            moveX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]){
        String str="axbxxcd";
        moveX(str, 0, 0, "");

    }
}