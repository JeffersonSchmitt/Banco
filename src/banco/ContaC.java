package banco;

public class ContaC extends Conta {
   public void Saca(double valor) {
        if (valor > 1000) {
            System.out.println("Valor acima do limite");
        }else{
            valor-=this.saldo;
            
            
        }
    }
}
