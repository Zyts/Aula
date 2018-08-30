package mes;

public class Mes {

    public static void main(String[] args) {
      ExibirMes(12);
    }
    public static void ExibirMes (int numero){
    switch (numero){
        case 1: System.out.println("Janeiro");
        break;
        case 2: System.out.println("Fevereiro");
        break;
        case 3: System.out.println("Marco");
        break;
        case 4: System.out.println("Abril");
        break;
        case 5: System.out.println("Maio");
        break;
        case 6: System.out.println("Junho");
        break;
        case 7: System.out.println("Julho");
        break;
        case 8: System.out.println("Agosto");
        break;
        case 9: System.out.println("Setembro");
        break;
        case 10: System.out.println("Outubro");

        case 11: System.out.println("Novembro");

        case 12: System.out.println("Dezembro");
        
        case 13: System.out.println("Mes invalido");
     
        default:
            System.out.println("Numero invalido");
            
            System.out.println("Até mais!");
            
                    
        
       
    }
    }
    
}
