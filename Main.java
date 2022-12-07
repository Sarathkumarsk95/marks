import java.util.Scanner;
        public class Main
        {
            public static void main(String[] args) {
                int mark1,mark2,mark3,mark4,mark5,total,average,rollno;
                String name;

                Scanner sk=new Scanner(System.in);

                System.out.println("enter name");
                name=sk.next();
                System.out.println("mark1");
                mark1=sk.nextInt();

                System.out.println("mark2");
                mark2=sk.nextInt();
                System.out.println("mark3");
                mark3=sk.nextInt();
                System.out.println("mark4");
                mark4=sk.nextInt();
                System.out.println("mark5");
                mark5=sk.nextInt();

                total=mark1+mark2+mark3+mark4+mark5;
                System.out.println("total is"+total);
                average=total/5;
                System.out.println("average is"+average);
                if (average>90)
                {
                    System.out.println("padippist");
                } else if (average<60&&average>90) {
                    System.out.println("yedho padipan");

                }
                else
                {
                    System.out.println("poku");
                }

            }
        }



