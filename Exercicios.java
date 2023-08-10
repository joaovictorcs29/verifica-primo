public class Exercicios{
    public int x;
    
    public static void  contador(int x){
    
          while (x < 300) {
                x ++;
             System.out.println(x);
        }
            
    }
    
    public static boolean verificaPrimo(int x){
        if ((x == 0)    ||  (x == 1))
            return (false);
        else {
            int i, fim;
            
            fim = (int) Math.sqrt(x);
            for(i = 2; i <= fim; i++){
                if ((x % i) == 0)
                    return(false);
            }
            
            return (true);
        }
    
    }
}

    
    