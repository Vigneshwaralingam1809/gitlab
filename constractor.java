class Constractor {

static String name ="vignesh";
static int age1 =28;
public static void main(String []args)
{
Constractor test = new Constractor("bala",35);
Constractor test2= new Constractor();

}
Constractor()
{
System.out.println("name =" + name + "   age =" +age1);

}
Constractor(String name,int agee)
{
this.name=name;
this.age1=agee;
System.out.println(this.age1);

}

}
