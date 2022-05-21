package calculadora;

public class FuncionesEspecificas extends Funciones {

 public int potencia (float numero1, float numero2){
  int potencia = (int) Math.pow(numero1, numero2);
 return potencia;
 }
 
 public int raizCuadrada (float numero1){
  int raiz = (int) Math.sqrt(numero1);
 return raiz;
 }   
    
@Override
public float multiplicacion(float numero1, float numero2){
        float multiplicacion=(numero1)*(numero2);
    return multiplicacion;
    }
    
}
