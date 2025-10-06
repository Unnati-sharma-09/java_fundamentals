import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class array_assignment {

//    public static int height(int[] gain){
//        int max=0;
//        int current=0;
//        for(int i= 0;i<gain.length;i++){
//            current+=gain[i];
//            max=Math.max(current,max);
//        }
//        return max;
//
//    }

//    array concatenation
    public static void main(String[] args) {
//        int [] a={10,20,30};
//        int [] b={40,50,60,70,80};
//        int a_leng=a.length;
//        int b_leng=b.length;
//        int c_leng=a_leng+b_leng;
//        int []c=new int[c_leng];
//        for(int i=0;i<a_leng;i++){
//            c[i]=a[i];
//        }
//        for(int i=0;i<b_leng;i++){
//            c[a_leng+i]=b[i];
//        }
//        for(int i=0;i<c_leng;i++){
//            System.out.print(c[i]+ " ");
//        }

//        int[]a={10,20,30};
//        System.out.println(a.length);
//        running sum of 1-D array
//        int [] num={1,3,5,7};
//        int[] result=new int[num.length];
//        result[0]=num[0];
//        for(int i=1;i<num.length;i++){
//            result[i]=result[i-1]+num[i];
//
//        }
//        for(int i=0;i<result.length;i++){
//            System.out.print(result[i]+ " ");
//        }
//        array shuffle
//        int[] nums={2, 5, 1, 3, 4, 7};
//        int n = nums.length/2;
//        int[] result=new int [nums.length];
//        int count=0;
//        for(int i=0;i<n;i++){
//            result[count++]=nums[i];
//            result[count++]=nums[i+n];
//
//
//
//        }
//        for(int i=0;i<result.length;i++){
//            System.out.print(result[i]+" ");
//        }


//        Kids With the Greatest Number of Candies
//        int [] candies={2, 3, 5, 1, 3};
//        int extracandies=3;
//        int maxcandies=0;
//        for(int i=0;i<candies.length;i++){
//            if(candies[i]>maxcandies){
//                maxcandies=candies[i];
//            }
//        }
//        List<Boolean> result=new ArrayList<>();
//        for (int i=0;i<candies.length;i++){
//            if(candies[i]+extracandies>=maxcandies){
//                result.add(true);
//            }else{
//                result.add(false);
//            }
//        }
//        System.out.println(result);
//        int [] nums={1,2,3,1,1,3};
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//
//            }
//
//        }
//        System.out.println(count);

//        int[] nums = {6,5,4,8};
//
//        int [] result=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            int count=0;
//            for(int j=0;j<nums.length;j++){
//                if(nums[j]<nums[i]){
//                    count++;
//                }
//            }
//            result[i]=count;
//        }
//        System.out.println(Arrays.toString(result));
//        Create Target Array in the Given Order
//        int [] nums= {1};
//        int[] index = {0};
//        List<Integer> targetList = new ArrayList<>();
//        for(int i =0; i<nums.length;i++){
//            targetList.add(index[i],nums[i]);
//        }
//        int[] result=new int[targetList.size()];
//        for(int i=0;i<targetList.size();i++){
//            result[i]=targetList.get(i);
//        }
//        System.out.println(Arrays.toString(result));
//        public boolean checkIfPangram(String sentence) {
//            Set<Character> set=new HashSet<>();
//            for(int i=0;i<sentence.length();i++){
//                set.add(sentence.charAt(i));
//            }
//            return set.size()==26;

//        }
//        class Solution {
//            public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//                int idx=0,res=0;
//                if(ruleKey.equals("type")){
//                    idx=1;
//                }else if(ruleKey.equals("color")){
//                    idx=2;
//
//                }else{
//                    idx=3;
//                }
//                for(int i=0;i<items.size();i++){
//                    if(items.get(i).get(idx-1).equals(ruleValue)){
//                        res++;
//                    }
//
//                }
//                return res;
//
//            }
//        }
//        int [] gain= {-5,1,5,0,-7};
//        int result=height(gain);
//        System.out.println(result);

//        int [] []images={{1,1,0},{1,0,1},{0,0,0}};
//        int m=images.length;
//        int n=images[0].length;
//        for(int i=0;i<m;i++){
//            for(int j=0;j<(n+1)/2;j++){
//                int temp=images[i][j];
//                images[i][j]=images[i][n-1-i];
//                images[i][n-1-i]=temp;
//
//
//            }
//        }
//        for(int i=0;i< images.length;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(images[i][j]+ " ");
//            }
//            System.out.println();
//        }








    }
}
