public class Main {


    
    public static void main(String[] args){
        double number[]={1.2,3.5,-2.2,33.14,-55.55,-1.4,44.55,77.13,43.44,99.55,11.33,55.66,31.77,65.43,78.00,};
        double summa = 0;
        int col = 0;
        boolean proverka = false;
        for (double forEach:number) {
            if (forEach < 0){
                proverka=false;
            }else if (forEach > 0 && proverka){
                summa+=forEach;
                col++;
                System.out.println(forEach);
            }


        }
        System.out.println("Арифметическое число"+summa/col);
        }
        }

