
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opcion = 0;
		do {
			Object seleccionConversor = (JOptionPane.showInputDialog(null,"Selecciona el tipo de conversion a realizar","TipodeConversor", JOptionPane.PLAIN_MESSAGE,null,new Object[] {"1.Conversor de moneda","2.Conversor de temperatura"},"Selecciona"));
		
			if (seleccionConversor == null){
				JOptionPane.showMessageDialog(null, "Programa cancelado");
				break;
			}
			
			String tipoConversor = seleccionConversor.toString();
			
			switch(tipoConversor) { 
			 	case "1.Conversor de moneda":
			 		new ConversorMoneda();
			 		break;
			 	case "2.Conversor de temperatura":
			 		new ConversorTemperatura();
			 		break;
			 	default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
			
		}
			
		opcion = JOptionPane.showConfirmDialog(null,"¿Deseas continuar?");
		
		}while (opcion == JOptionPane.YES_OPTION);
		
			
				opcion = JOptionPane.NO_OPTION; 	
				JOptionPane.showMessageDialog(null, "Programa terminado");
				
				
			
		
	}
	
	
}
