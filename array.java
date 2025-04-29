class array{
public static void main(String []args)
{
int[] name = new int[5];
name[0]=1001;
name[1]=10002;
name[2]=10003;
name[3]=10004;
name[4]=10009;


System.out.println(name[4]+" hii "+name.length);
first(name);
}



public static void first(int[] name)
{
for (int i=0; i<= name.length -1;i++)
    {
        System.out.println(name[i]);

    }

System.out.println(" hii ");

}

}
