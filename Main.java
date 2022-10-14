// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2
//  
// [2,4]  Target = 6, Answer =0,1
import java.util.*;
  
class Main {
  public static void ans(int[] arr,int target){
    for(int i=0;i< arr.length;i++){
      for(int j=i+1;j< arr.length;j++ ){
      //  System.out.println("var i="+i +"j="+j+"result="+(arr[i]+arr[j]));
        if((arr[i]+arr[j])==target){
          System.out.println("answer i,j="+i +","+j);
        }
      }
    }
  }

  public static void ans2(List<Integer> arr,int target){
    int[] newArr;
    for(int j=0;j< arr.length;j++ ){
           Integer diff=target-arr.get(j);
           int indexExists=arr.indexof(diff)
           if(indexExists!=-1 ){
             System.out.println(//j, arr.indexOf(diff));
           } 
      }
    
    
  }
  
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int target=3;
    int[] test={1,9,2,19};
     Integer[] arr=new ArrayList();
     // Map<Integer> arrMap=new Hashmap();
     // for(int i=0;i<test.length;i++){
     //   arrMap.put(test[i],"");
     // }
    System.out.println(arrMap);
    // ans(test,target);
  }

  //  1
}