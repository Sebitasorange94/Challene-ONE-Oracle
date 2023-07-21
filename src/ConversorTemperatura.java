import javax.swing.JOptionPane;

public class ConversorTemperatura {
		
		double valorConvertir = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a convertir: "));
		String conversorTemperatira = (JOptionPane.showInputDialog(null,"Selecciona el tipo de conversion a realizar","MonedaConversor", JOptionPane.PLAIN_MESSAGE,null,new Object[] 
				{"De Celsius a Fahrenheit","De Celcius a Kelvin","De Fahrenheit a Celcius","De Fahrenheit a Kelvin","De Kelvin a Celcius","De Kelvin a Fahrenheit"},"Selecciona")).toString();
		
		double escalaConvertir;
		
		public ConversorTemperatura() {
			
			switch(conversorTemperatira) {
			case "De Celsius a Fahrenheit":
				escalaConvertir = (valorConvertir*1.8)+32;
				JOptionPane.showMessageDialog(null, valorConvertir + " ºC e quivalen a: " + escalaConvertir + " ºF");
				break;
				
			case "De Celcius a Kelvin":
				escalaConvertir = valorConvertir + 273.15;
				JOptionPane.showMessageDialog(null, valorConvertir + " ºC e quivalen a: " + escalaConvertir + " ºK");
				break;
			
			case "De Fahrenheit a Celcius":
				escalaConvertir = (valorConvertir-32)/1.8;
				JOptionPane.showMessageDialog(null, valorConvertir + " ºF e quivalen a: " + escalaConvertir + " ºC");
				break;
			
			case "De Fahrenheit a Kelvin":
				double valorUno = valorConvertir-32;
				double valorDos = 5;
				System.out.println(valorDos);
				escalaConvertir = valorUno*(valorDos/9)+273.15;
				JOptionPane.showMessageDialog(null, valorConvertir + " ºF e quivalen a: " + escalaConvertir + " ºK");
				break;
				
				
			case "De Kelvin a Celcius":
				escalaConvertir = valorConvertir-273.15;
				JOptionPane.showMessageDialog(null, valorConvertir + " ºK e quivalen a: " + escalaConvertir + " ºC");
				break;	
				
			case "De Kelvin a Fahrenheit":
				escalaConvertir = 1.8*(valorConvertir-273.15)+32;
				JOptionPane.showMessageDialog(null, valorConvertir + " ºK e quivalen a: " + escalaConvertir + " ºF");
				break;	
				
			}
			
			
			
			
		}
}
