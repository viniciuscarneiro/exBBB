package csvReader.csvReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadCSV 
{
    public static void main( String[] args )
    {
    	ReadCSV obj = new ReadCSV();
    	obj.run();
    }

	private void run() {
		String csvFile = "C:/Users/lucas.gondim/Desktop/exemplo.csv";
		BufferedReader reader = null;
		String line = "";
		
		String fullName = "LUCAS CARVALHO GONDIM";
		String firstName, lastName = "";
		String[] nome = fullName.split(" ");
		firstName = nome[0];
		for(int i = 1; i< nome.length; i++) {
			if(lastName.isEmpty()) {
				lastName = nome[i];
			} else {
				lastName = lastName + " " + nome[i];
			}
		}
		System.out.println("NOME COMPLETO: " + fullName);
		System.out.println("PRIMEIRO NOME: " + firstName);
		System.out.println("SOBRENOME: " + lastName);
		
		List<Product> products = new ArrayList<Product>();
		Product product;
		Integer material, codigo, quantidade;
		Double preco;
		
		double angle = 20.3034;

	    DecimalFormat df = new DecimalFormat("#.00");
	    
		try {
			reader = new BufferedReader(new FileReader(csvFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    try {
	    	Pattern pattern = Pattern.compile("^([0-9]+)\\s*;\\s*([0-9]*)\\s*;\\s*\"?\\s*(.*?)\\s*\"?\\s*;\\s*([0-9]+)\\s*;\\s*([0-9]*[0-9]+(?:,[0-9]*)?)\\s*;?\\s*$");
	    	Matcher m;
	    	Integer contador=1;
			while ((line = reader.readLine()) != null) {
				m = pattern.matcher(line);
				if(m.matches()) {
				    if(m.group(1) == null || m.group(1).equals("")) {
				    	codigo = null;
				    } else {
				    	codigo = Integer.valueOf(m.group(1));
				    }
				    
				    if(m.group(2) == null || m.group(2).equals("")) {
				    	material = null;
				    } else {
				    	material = Integer.valueOf(m.group(2));
				    }
				    
				    if(m.group(4) == null || m.group(4).equals("")) {
				    	quantidade = null;
				    } else {
				    	quantidade = Integer.valueOf(m.group(4));
				    }

				    
				    if(m.group(5) == null || m.group(5).equals("")) {
				    	preco = null;
				    } else {
				    	preco = Double.valueOf(m.group(5).replaceAll("\\.", "").replaceAll(",", "."));
				    }
				    
				    product = new Product(codigo, material, m.group(3), quantidade, preco);
				    products.add(product);
					System.out.println(product);
				} else if (!(line.replaceAll("[ ;]+", "").equals(""))){
					System.out.println("Linha ignorada: ["+ contador + "] " + line);
				    System.out.println();
				} else{
					//System.out.println("Linha vazia: ["+ contador + "] " + line);
				    //System.out.println();
				}
			    //products.add(product);
				contador++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	    
	}
}