import java.util.*;
class MissingNum{
public static void main(String[] args){
int[] ar={1,5,3,4};
int totalexpnum=ar.length+1;
int totalexpsum=(totalexpnum*(totalexpnum+1))/2;//natural num sum
int realsum=0;

for(int i=0;i<=ar.length-1;i++){
realsum=realsum+ar[i];
}
int expnum=totalexpsum-realsum;
System.out.println(expnum);
}
}