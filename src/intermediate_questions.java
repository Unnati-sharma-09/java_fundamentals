import java.util.Scanner;
public class intermediate_questions {
    public static void main(String[] args) {
//        Calculate Electricity Bill
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the amount: ");
//        int u=sc.nextInt();
//        int b;
//        if(u<=100){
//            b=u*3;
//        } else if (u>=101 && u<=300) {
//            b=(100*3)+(u-100)*4;
//
//        }else{
//            b=(100*3)+200*4+(u-300)*5;
//        }
//        System.out.println("the amount is: "+ b);
//        Calculate Average Of N Numbers
//        Scanner a=new Scanner(System.in);
//        System.out.println("enter the number(N): ");
//        int n= a.nextInt();
//        double sum =0;
//
//        for(int i=1;i<=n;i++){
//            System.out.println("enter number "+i);
//            double number=a.nextDouble();
//            sum+=number;
//
//        }
//        double average =sum/n;
//        System.out.println(" the average is : "+average);


//        Calculate Discount Of Product
//        Scanner d= new Scanner(System.in);
//        System.out.println("enter the sale: ");
//        int s=d.nextInt();
//        double dis;
//        if(s>=1000){
//            dis=s*4/100;
//        } else if (s>=1001 && s<=5000) {
//            dis=s*5/100;
//
//        } else if (s>=5001 && s<=10000) {
//            dis=s*6/100;
//
//        }else{
//            dis=s*8/100;
//        }
//        System.out.println("discount you got is : "+dis);
//        Calculate Distance Between Two Points
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the co-ordintes of first point: ");
//        int x1= sc.nextInt();
//        int y1=sc.nextInt();
//        System.out.println("enter the co-ordinates of second points: ");
//        int x2= sc.nextInt();
//        int y2=sc.nextInt();
//        double d;
//        d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//        System.out.println("distance between two points: "+ d);

//        Calculate Commission Percentage
//        Scanner co=new Scanner(System.in);
//        System.out.println("enter the commisionAmount: ");
//        double CA=co.nextDouble();
//        System.out.println("enter the total sales amount: ");
//        double SA= co.nextDouble();
//        double commision_percentage;
//        commision_percentage=(CA/SA)*100;
//        System.out.println("the calculated commision-percentage is : "+commision_percentage);


//        Power In Java
//        double base=2;
//        double exponent=0.5;
//        double result=Math.pow(2,0.5);
//        System.out.println("result " + result);

//        Calculate Depreciation of Value
//        straight line depriciation
//        Scanner dp=new Scanner(System.in);
//        System.out.println("enter the asset cost: ");
//        double c=dp.nextDouble();
//        System.out.println("enter the salvage year ");
//        double sy=dp.nextDouble();
//        System.out.println("enter the year: ");
//        double y=dp.nextDouble();
//        double dep=(c-sy)/y;
//        System.out.println("the depriciated value is: "+ dep );
//        Calculate Batting Average
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the total run scored: ");
//        int hits=sc.nextInt();
//        System.out.println("enter the  dismissal : ");
//        int dismissal=sc.nextInt();
//        double batting_average= (double) hits /dismissal;
//        System.out.println("the batting average is "+batting_average);

//   Compound Interest Java Program
//        Scanner CI=new Scanner(System.in);
//        System.out.println("enter the principal amount(P) : ");
//        double p=CI.nextDouble();
//        System.out.println("enter the annual interest rate: ");
//        double r= CI.nextDouble();
//        System.out.println("enter the year: ");
//        int y= CI.nextInt();
//        double amount=p*Math.pow((1+r/100),y);
//        double compound=amount-p;
//        System.out.println("the compound interest is : "+ compound);
//        System.out.println("total amount is "+amount);

//        Calculate Average Marks
//        Scanner a=new Scanner(System.in);
//        System.out.println("enter the number of subject: ");
//        int n=a.nextInt();
//        double sum=0;
//        for(int i=1;i<=n;i++){
//            System.out.println("enter the marks"+i+":");
//            double marks=a.nextDouble();
//            sum+=marks;
//
//        }
//        double avg= sum/n;
//        System.out.println("the average is "+ avg);

//        Sum Of N Numbers

//        Scanner N=new Scanner(System.in);
//        System.out.println("how many number you want to enter : ");
//        int num=N.nextInt();
//        int sum=0;
//        for(int i=1; i<=num;i++){
//            System.out.println("enter the "+i + ":");
//            int number=N.nextInt();
//            sum+=number;
//        }
//        System.out.println("the sum is: "+sum);

//        reverse a string
//        Scanner st=new Scanner(System.in);
//        System.out.println("enter the string: ");
//        String input=st.nextLine();
//        String reversed ="";
//        for(int i=input.length()-1;i>=0; i--){
//            reversed+=input.charAt(i);
//        }
//        System.out.println(" reversed stering: "+ reversed);


//        Scanner input = new Scanner(System.in);
//
//        // Get number from user
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        int original = number;
//        int reversed = 0;
//
//        // Reverse the number
//        while (number != 0) {
//            int digit = number % 10;
//            reversed = reversed * 10 + digit;
//            number = number / 10;
//        }
//
//        // Check if original and reversed are same
//        if (original == reversed) {
//            System.out.println(original + " is a Palindrome number.");
//        } else {
//            System.out.println(original + " is NOT a Palindrome number.");
//        }
//
//  Future Investment Value
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the principal : ");
//        double p=sc.nextDouble();
//        System.out.println("enter the rate : ");
//        double r=sc.nextDouble();
//        System.out.println("enter the no.of year: ");
//        int y=sc.nextInt();
//        System.out.println("enter compound per year: ");
//        int compound_year=sc.nextInt();
//        double arate= r/100;
//        double fi=p*Math.pow((1+arate/y),y*compound_year);
//        System.out.println("the future investment is " +fi);



//hcf of 2 number
//        int n1=8;
//        int n2=20;
//        int hdf=1;
//        for (int i =1; i<=n1;i++){
//            if(n1%i==0&&n2%i==0){
//                hdf=i;
//            }
//
//
//        }
//        System.out.println("the o/p is : "+hdf );

//        int n1=8;
//        int n2=20;
//        int hdf=1;
//        int lcm;
//
//        for(int i=1; i<=n1;i++){
//            if(n1%i==0&&n2%i==0){
//                hdf=i;
//            }
//        }
//        lcm=(n1*n2)/hdf;
//        System.out.println("the lcm is :"+ lcm);
//Java Program Vowel Or Consonant
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the vowel: ");
//        char ans=sc.nextLine().charAt(0);
//        System.out.println(ans);
//        if( ans=='a'||ans=='e'||ans=='i'||ans=='o'||ans=='u'){
//            System.out.println("its an vowel  "+ans);
//        }else{
//            System.out.println(" its an consonants ");
//        }
//Perfect Number In Java
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<n;i++){
//
//            if(n%i==0){
//                sum+=i;
//
//            }
//
//        }
//        if(sum==n){
//            System.out.println("this is perfect ");
//        }else{
//            System.out.println("this is not perfect: ");
//        }


//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n=sc.nextInt();
//        if(((n%4==0)&&(n%100!=0)||(n%400==0))){
//            System.out.println(n+ ", this is leap year ");
//        }else{
//            System.out.println("not a leap year");
//        }
//        Sum Of A Digits Of Number
//        Scanner sc=new Scanner(System.in);
//        int m= sc.nextInt();
//        int sum=0;
//        while(m!=0){
//            int rm=m%10;
//            sum+=rm;
//            m=m/10;
//        }
//        System.out.println("sum of digit: "+sum);
//
//        Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//        int days=0;
//        for(int i=1;i<=31;i++){
//            if(i%2==0){
//                days++;
//
//            }
//
//        }
//        System.out.println("even days are: "+days);
//        Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner sc=new Scanner(System.in);
        int pos_num=0;
        int neg_num=0;
        int odd_num=0;
        System.out.println("enter numbers: ");
        while (true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                pos_num+=n;
            } else if (n>0) {
                if(n%2==0){
                    neg_num+=n;
                }else {
                    odd_num+=n;
                }
                
            }


        }
        System.out.println("Sum of negative numbers: " + pos_num);
        System.out.println("Sum of positive even numbers: " + neg_num);
        System.out.println("Sum of positive odd numbers: " + odd_num);




    }
}
