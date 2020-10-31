class ReverseNum{
public static void main(String[] args){
String str="abc";
String rev="";

for(int i=str.length()-1;i>=str.length();i++){
rev=rev+str.charAt(i);
}
System.out.println(rev);
}
}