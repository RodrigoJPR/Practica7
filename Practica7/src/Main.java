import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException, ClassNotFoundException {

		
		
		
		ObjectInputStream lector = new ObjectInputStream(new FileInputStream("web.obj"));
		PrintWriter escritor = new PrintWriter("main.html");
		WebMaker pagina = (WebMaker) lector.readObject();
		escritor.print(pagina.printPage());
		lector.close();
		escritor.close();
		
		
		
		
		
		
		
		
		
		
		
		/*DataOutputStream escritor = new DataOutputStream(new FileOutputStream("hola.bin"));
		escritor.writeInt(33465);
		escritor.writeChar('a');
		escritor.writeChar('z');
		escritor.writeShort(10);
		escritor.close();
		
		DataInputStream lector = new DataInputStream(new FileInputStream("hola.bin"));
		System.out.println(lector.readChar());
		System.out.println(lector.readShort());
		System.out.println(lector.readChar());
		System.out.println(lector.readInt());
		
		lector.close();
		
		
		
		
		WebMaker generador = new WebMaker();
		
		PrintWriter escritor = new PrintWriter("index.html");
		
		Scanner lector = new Scanner(new FileReader("form.txt"));
		
		
		escritor.println(generador.imprimirEncabezado());	
		escritor.println(generador.imprimirTexto("It is the K-CHOW"));
		escritor.println(generador.insertarImagen("McQueen11.jpg"));
		
		
			while(lector.hasNext())	{
			escritor.println(lector.nextLine());
		}
		escritor.println(generador.imprimirCierre());
		lector.close();
		escritor.close();
		
	
		*/
		
		
		}
}	