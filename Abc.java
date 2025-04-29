class Abc{

static int no =9876;
static int total=0;
static int no1=0;

public static void main(String[]args)
{

if (no<9)
    {
        System.out.println("total  ;" + no);
    }
else
    {
    int result=Abc.abc(total);

    }
System.out.println(total);
}

public static int abc(int total)
{

while (total>9){
while(no>0)
    {
         no1=no%10;
         total=total+no1;
         no=no/10;
    }
    }
System.out.println(total);
return total;



}

}
