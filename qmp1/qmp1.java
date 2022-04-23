Class Prenda {
	TipoPrenda tipo
	Material material
	Color colorPrimario
	Color colorSecundario
	Trama trama
}

Class Color {
	Integer red
	Integer green
	integer blue
}

Class Atuendo {
	Prenda parteSuperior
	Prenda parteInferior
	Prenda calzado
}

Enum Material {
	CUERO, JEAN, TELA, GOMA
}

Enum Trama {
	LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO
}

/* Descartamos usar String porque a pesar de que aportaría Simplicidad queremos que haya UNIFORMIDAD de valores (que no haya pantalon, pantaloncito, jean, vaquero, etc). 
Opciones: Clase o Enum.
Clase: restringimos un poco más que con un String pero sigue estando el problema de que pueden meter fruta en el nombre. Ventaja: se puede cambiar en tiempo de ejecución. Desventaja: mayor complejidad.
Enum: más restringido que String o Clase. Ventaja: menos complejidad que Clase. Desventaja: hay que agregar los tipos al código y recompilar.
Elegimos Enum porque por el enunciado no creemos que sea necesaria tanta granularidad en los distintos TipoPrenda.
*/
Enum TipoPrenda {
	Categoria categoria
	String nombre
	
	TipoPrenda(String nombre) { this.nombre = nombre}
	
	ZAPATO("Zapato"), CAMISA("Camisa"), PANTALON("Pantalon");
	
	// Prenda prenda = new Prenda(TipoMaterial.ZAPATO)
}

Enum Categoria {
	SUPERIOR, CALZADO, INFERIOR, ACCESORIOS
}