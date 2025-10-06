import java.sql.SQLOutput;
import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
//        int radius=5;
//        double pi=3.14;
//        double area;
//        area= pi* radius* radius;
//        System.out.println("the area of circle is : "+ area);


//        double base=5;
//        double height= 8;
//        double area;
//        area = 0.5 * base * height;
//        System.out.println("the area of triangle is : "+ area);

        //area of rectangle
//        Scanner sc =new Scanner(System.in);
//        double length;
//        double width;
//        System.out.print("please enter the length: ");
//        length= sc.nextDouble();
//        System.out.print("please enter the width : ");
//        width= sc.nextDouble();
//        double area;
//        area=length*width;
//        System.out.println("the area of rectangle is : " + area);

//area of isoceles triangle
//        Scanner it = new Scanner(System.in);
//        System.out.println("please enter the base: ");
//        double base= it.nextDouble();
//        System.out.println("please enter the side: ");
//        double side =it.nextDouble();
//        double area;
//        area = (base/4) * Math.sqrt((4*side*side-base*base));
//        System.out.println("the area is : " + area);
//        area of parallellogram


//        Scanner PG = new Scanner(System.in);
//        System.out.println("please enter the base : ");
//        double breadth=PG.nextDouble();
//        System.out.println("please enter the height: ");
//        double height= PG.nextDouble();
//        double area;
//        area = breadth*height;
//        System.out.println(" the area of parallellogram is " + area );
//        area of rhombus
//        Scanner rm=new Scanner(System.in);
//        System.out.println("enter the breadth : ");
//        double breadth= rm.nextDouble();
//        System.out.println("enter the height: ");
//        double height= rm.nextDouble();
//        double area;
//        area = breadth * height;
//        System.out.println(" the ared of triangle is : " + area);

//        area of equaliteral triangle
//        double a=20;
//        double area;
//        area=(Math.sqrt(3)/4)*a*a;
//        System.out.println("the area of equilateral triangle is "+ area);

//        perimeter of circle
//        Scanner ci=new Scanner(System.in);
//        System.out.println("please enter the radius : ");
//        double radius = ci.nextDouble();
//        double pi=3.14;
//        double perimeter = 2*pi*radius;
//        System.out.println("the perimeter of circle is: "+ perimeter);


//        perimeter of equilateral triangle
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the side: ");
//        int side=sc.nextInt();
//        int perimeter= 3*side*side;
//        System.out.println("the area of triangle is " + perimeter);


//        perimeter of parallelogram
//        Scanner p=new Scanner(System.in);
//        System.out.println("please enter the base: ");
//        double base = p.nextDouble();
//        System.out.println("please enter the side : ");
//        double side=p.nextDouble();
//        double perimeter=2*(side+base);
//        System.out.println("the perimeter of parallelogram is "+ perimeter);

//        Scanner r=new Scanner(System.in);
//        System.out.println("enter the length: ");
//        int length=r.nextInt();
//        System.out.println("enter the width: ");
//        int width= r.nextInt();
//        int perimeter=2*(length+width);
//        System.out.println("the perimeter is : "+ perimeter);


//        perimeer of square

//        Scanner sq=new Scanner(System.in);
//        System.out.println("enter the side: ");
//        int side= sq.nextInt();
//        int perimeter= 4 * side;
//        System.out.println("the perimeter is: " + perimeter);

//        perimeter of rhombus is same as square
//volume of cone
//        Scanner c=new Scanner(System.in);
//        System.out.println("enter the radius : ");
//        double radius= c.nextDouble();
//        System.out.println("enter the height: ");
//        double height= c.nextDouble();
//        double pi=3.14;
//        double volume=pi*radius*radius*(height/3);
//        System.out.println("the volume of cone is: "+ volume);


//        volume of prism(rectangular prism)
//        Scanner p=new Scanner(System.in);
//        System.out.println("enter the length: ");
//        int length= p.nextInt();
//        System.out.println("enter the breadth : ");
//        int b=p.nextInt();
//        System.out.println("enter the height: ");
//        int h= p.nextInt();
//        int volume= (length*b)*h;
//        System.out.println("the volume of prism: "+ volume);
// for square prism
//        Scanner sq=new Scanner(System.in);
//        System.out.println("enter the base: ");
//        double base=sq.nextDouble();
//        System.out.println("enter the heigth: ");
//        double h=sq.nextDouble();
//        double v= (0.5* base*h)*h;
//        System.out.println("the volume of square prism is: "+v);


//        volume of cyclinder
//        Scanner sq=new Scanner(System.in);
//        System.out.println("enter the radius: ");
//        double r=sq.nextDouble();
//        System.out.println("enter the height");
//
//        double h=sq.nextDouble();
//        double pi=3.14;
//        double v= pi*r*r*h;
//        System.out.println("the volume of cyclinder " + v );
//        volume of sphere
//        Scanner sq=new Scanner(System.in);
//        double pi =3.14;
//        System.out.println("enter the radius ");
//        double r=sq.nextDouble();
//        double v= ((double) 4 /3)*pi*r*r*r;
//        System.out.println("the volume is: "+v);
//        volume of pyramind
//        Scanner p=new Scanner(System.in);
//        System.out.println("enter the length: ");
//        double l=p.nextDouble();
//        System.out.println("enter the width: ");
//        double w=p.nextDouble();
//        System.out.println("enter the height: ");
//        double h=p.nextDouble();
//        double v= (l*w*h)/3;
//        System.out.println("the volume is : "+v);


//        curved surfacr area cyclinder

//        Scanner csa=new Scanner(System.in);
//        double pi=3.14;
//        System.out.println("enter the radius: ");
//        double r=csa.nextDouble();
//        System.out.println("enter the height: ");
//        double h=csa.nextDouble();
//        double CSA= 2*pi*r*h;
//        System.out.println("the csa of cyclinder is : "+CSA);


//        tsa of cube
//        Scanner csa=new Scanner(System.in);
//        System.out.println("enter the side: ");
//        int side=csa.nextInt();
//        int tsa=6*side*side;
//        System.out.println("the total surface area is: "+ tsa);


//        fibonacci series
//        int count=10;
//        int firstnum=0, secondnum=1;
//        for(int i=0; i<=10; i++){
//            System.out.print(firstnum + ", ");
//            int nextnum;
//            nextnum=firstnum+secondnum;
//            firstnum=secondnum;
//            secondnum=nextnum;
//
//        }

//subtract the product and addition of integer
//        int n=234;
//
//        int sum=0;
//        int product=1;
//        while(n>0){
//            int num=n%10;
//            n=n/10;
//            sum=sum+num;
//            product=product*num;
//
//
//        }
//        int result=product-sum;
//        System.out.println(result);




//        factor or divisor of number
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        for(int i=1; i<=num; i++){
//            if((num % i) == 0){
//                System.out.println(i);
//
//            }
//
//        }


//take inpit from user until user entered the 0 and return all of its sum

//        Scanner sc=new Scanner(System.in);
//        int num;
//        int sum=0;
//        do{
//            num=sc.nextInt();
//            sum+=num;
//        }
//        while(num!=0);
//        System.out.println("the sum is " + sum);

//        Scanner s=new Scanner(System.in);
//        int num;
//        int max=Integer.MIN_VALUE;
//        System.out.println("enter the number: ");
//        while(true){
//            num=s.nextInt();
//            if(num==0){
//                break;
//            }
//            if(num>max){
//                max=num;
//            }
//        }
//        if(max==Integer.MIN_VALUE){
//            System.out.println("no number were entered : ");
//        }else{
//            System.out.println("largest value is "+ max);
//        }

        //addition of 2 numbers
//        Scanner sc=new Scanner(System.in);
//        int num1 =sc.nextInt();
//        int num2=sc.nextInt();
//        int sum=num1+num2;
//        System.out.println("sum of "+ num1 + " and "+ num2 +  " is " + sum);



//        factorial of given number
        int num=6;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);






    }



}
