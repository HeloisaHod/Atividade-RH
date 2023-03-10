import java.math.BigDecimal;

public class Gerente  extends Funcionarios{

    private String area; 
     private BigDecimal bonus;



   

    public Gerente(int codigo, Object nome, double salario, Object area2, Object bonus2) {
        super(codigo, nome, salario);
        this.area = area2;
        this.bonus = (BigDecimal) bonus2;
    }

    @Override
    public String dados(){
        return "\narea" + getArea() + "\nnome" + getNome() + "\ncodigo" + getCodigo();   }

        @Override
        public BigDecimal calcularSalario(){
            return getSalario() ;
        }

        public BigDecimal getBonus() {
                return bonus;
            }
     public String getArea() {
        return area;
    }
    
}
