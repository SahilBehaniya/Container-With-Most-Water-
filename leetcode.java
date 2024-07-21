import java.util.Scanner;

public class leetcode {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
       int i=0, j=n-1;int maxx=0;
        while(i<j){
            int minheight=0,width=0;
           
                 minheight=Math.min(height[i],height[j]);
                  width=Math.abs(i-j);
                  int area=width*minheight;
                        maxx=Math.max(maxx,area);
                          if(height[i]>height[j]){
                            j--;
                          }else{
                            i++;
                          }
            
        }

        System.out.println(maxx);
    }
}
