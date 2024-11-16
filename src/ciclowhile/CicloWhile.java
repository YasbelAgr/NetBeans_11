import javax.swing.JOptionPane;
public class CicloWhile {
    public static void main(String[] args){
       float estatura,imc;
       short peso;
       int contador;
       byte x; 
       x= Byte.parseByte(JOptionPane.showInputDialog("Ingresa la cantidad de veces que quieres que se repita"));
       contador=1;
        while (contador<=x){
            peso=Short.parseShort(JOptionPane.showInputDialog("Captura tu peso"));
            estatura=Float.parseFloat(JOptionPane.showInputDialog("captura estatura "));
            imc=(peso/(estatura*estatura));
            if (imc<=18.49){
            JOptionPane.showMessageDialog(null, "Peso bajo");
            }else if(imc>=18.50 && imc<=24.99){
                JOptionPane.showMessageDialog(null, "Peso normal");
            }else if (imc>=25 && imc<=29.99){
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            }else if (imc>=30 && imc<=34.99){
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            }else if (imc>=35 && imc<=39.99){
                JOptionPane.showMessageDialog(null, "Obesidad media");
            }else if (imc>=40){
                JOptionPane.showMessageDialog(null, "Obesidad morbida");
            }contador++;
        }
    }
}
