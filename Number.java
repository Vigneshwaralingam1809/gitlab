public class Number{
    public static void main(String[] args){
        int no = 7889;
        while(no>9){
            if(no>9){
                no = check(no); 
             }
        }
        System.out.println("Number : " + no);
            
    }

    public static int check(int no){
        int no1 = no % 100;//89,14
        int no2 = no / 100;//78,0
    
        while(no>9){
            if(no1>9){
                no1 = sumOfDigits(no1);//17,8
            }else{
                no = no1 + no2;
                return no;
            }
    
            if(no2>9){
                no2 = sumOfDigits(no2);//15,6
            }else{
                no = no1 + no2;
                return no;
            }
        }
        return no;
    }

    public static int sumOfDigits(int no){
        int sum = 0;
        while(no>0){
            sum += (no%10);
            no /= 10;
        }
        return sum;
    }
}
