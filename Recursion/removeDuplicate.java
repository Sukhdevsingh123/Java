// .....................Remove all duplicates in an String..................... 

public class removeDuplicate {
    public static boolean [] map=new boolean[26];
    public static void Duplicate(String str,int idx,String newString){

if(idx==str.length()){
    System.out.println("remove duplicate:"+newString);
    return;
}

char currChar=str.charAt(idx);
if(map[currChar-'a']==true){
    Duplicate(str, idx+1, newString);
}
else{
    newString+=currChar;
    map[currChar-'a']=true;
    Duplicate(str, idx+1, newString);
}

    }
    public static void main(String args[]){
String str="java";
Duplicate(str, 0, " ");
    }
}
