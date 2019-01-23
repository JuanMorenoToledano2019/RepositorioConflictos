package clasepruebaconflictos;

public class ClasePruebaConflictos {

	public static void main(String[] args) {
		String[] colores = { "rojo", "morado", "azul", "verde", "amarillo", "naranja", "rojo", "negro", "gris",
				"blanco", "lila" };

		for (int i = 0; i < colores.length; i++) {
			System.out.println("Color en la posición " + (i + 1));

			System.out.println(colores[i]);
		}

	}

}
