import java.math.BigDecimal;

public class Engenheiro extends  Funcionarios{

    private String crea, departamento;

 @Override

 public BigDecimal calcularSalario(){
    return salario 1.5;
 }

 @Override
 public String dados(){
    return "\ncrea" + getCrea() + "\ndepartamento" + getDepartamento() + "\ncodigo" + getCodigo() + "\nnome" + getNome();
 }

    
public Engenheiro(String nome, String codigo, BigDecimal salario, String crea, String departamento) {
    super(nome, codigo, salario);
    this.crea = crea;
    this.departamento = departamento;
}




    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
