import javax.swing.JOptionPane;

public class ConversorMoneda {
	String inputValor, conversorMoneda;
	double valorConvertir, pesoConvertir;
	
	public ConversorMoneda(){ 
		
		inputValor = JOptionPane.showInputDialog("Ingresa la cantidad de Dinero que deseas convertir: ");
		if (inputValor== null) {
			JOptionPane.showMessageDialog(null, "Programa cancelado");
			return;
		}
		
		
		try {
			valorConvertir = Double.parseDouble(inputValor);
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor numérico.");
            return;
		}
		
		Object[] divisas ={"De pesos a Dolares","De pesos a Euros","De pesos a Libras esterlinas","De pesos a Yenes", "De pesos a Won Coreano",
						"De Dolares a pesos", "De Euros a pesos", "De Libras a Pesos", "De Yenes a Pesos", "De Won coreano a Pesos"};
		
		Object select = JOptionPane.showInputDialog(null,
				"Selecciona el tipo de conversion a realizar",
				"MonedaConversor",JOptionPane.PLAIN_MESSAGE, null, divisas, divisas[0]);
		
		if(select == null) {
			JOptionPane.showMessageDialog(null, "Programa cancelado");
			return;
		}else {
			
		conversorMoneda = select.toString();
		
		
		switch(conversorMoneda) {
			//Dolar
			case "De pesos a Dolares":
				pesoConvertir = valorConvertir / 4000;
				JOptionPane.showMessageDialog(null, "Tienes: $" + pesoConvertir + " Dolares");
				break;
			//Euro	
			case "De pesos a Euros":
				pesoConvertir = valorConvertir / 4450;
				JOptionPane.showMessageDialog(null, "Tieness: $" + pesoConvertir + " Euros");
				break;
			//A libras esterlinas	
			case "De pesos a Libras esterlinas":
				pesoConvertir = valorConvertir / 5100;
				JOptionPane.showMessageDialog(null, "Tienes: $" + pesoConvertir + " Libras");
				break;
			//A yenes	
			case "De pesos a Yenes":
				pesoConvertir = valorConvertir / 0.035;
				JOptionPane.showMessageDialog(null, "Tienes: $" + pesoConvertir + " Yenes");
				break;
			//A won Coreano	
			case "De pesos a Won Coreano":
				pesoConvertir = valorConvertir / 0.32;
				JOptionPane.showMessageDialog(null, "Tienes: $" + pesoConvertir + " Wones coreanos");
				break;
				
			//De Dolar
			case "De Dolares a pesos":
				pesoConvertir = valorConvertir * 4000;
				JOptionPane.showMessageDialog(null, "Con: $" + valorConvertir+ " dolares tienes " + pesoConvertir + " Pesos Colombianos");
				break;
			//De Euro	
			case "De Euros a pesos":
				pesoConvertir = valorConvertir * 4450;
				JOptionPane.showMessageDialog(null, "Con: $" + valorConvertir+ " duros tienes " + pesoConvertir + " Pesos Colombianos");
				break;
			//De Libras	
			case "De Libras a Pesos":
				pesoConvertir = valorConvertir * 5100;
				JOptionPane.showMessageDialog(null, "Con: $" + valorConvertir+ " libras tienes " + pesoConvertir + " Pesos Colombianos");
				break;
			//De Yenes	
			case "De Yenes a Pesos":
				pesoConvertir = valorConvertir * 0.035;
				JOptionPane.showMessageDialog(null, "Con: $" + valorConvertir+ " yenes tienes " + pesoConvertir + " Pesos Colombianos");
				break;
			//De Won Coreano	
			case "De Won coreano a Pesos":
				pesoConvertir = valorConvertir * 0.32;
				JOptionPane.showMessageDialog(null, "Con: $" + valorConvertir+ " won tienes " + pesoConvertir + " Pesos Colombianos");
				break;
			
		}
		}
	}
}
