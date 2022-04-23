Class Prenda {
	TipoPrenda tipo
	Material material
	Color colorPrimario
	Color colorSecundario
	Trama trama
	
	/* Tener un constructor con colorSecundario y otro sin él no aporta nada porque directamente podemos pasarle el valor en null cuando se instancia y listo.
	Tener un constructor sin colorSecundario y un setter tampoco es una buena opción ya que la Prenda pierde inmutabilidad.
	*/
	void Prenda (TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama){
		validarParametros(tipo, material, colorPrimario)
		this.tipo = tipo
		this.material = material
		this.colorPrimario = colorPrimario
		this.colorSecundario = colorSecundario
		this.trama = trama
	}
	
	void validarParametros(TipoPrenda tipo, Material material, Color colorPrimario) {
		if(tipo == NULL) {
			throw new PrendaInvalidaException("Falta el tipo") // extiende de RuntimeException
		}
		if(material == NULL) {
			throw new PrendaInvalidaException("Falta el material")
		}
		if(colorPrimario == NULL) {
			throw new PrendaInvalidaException("Falta el colorPrimario")
		}
	}
}


Class Color {
	Integer red
	Integer green
	integer blue
}

// No pedían Atuendo
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
	
	TipoPrenda(String nombre, Categoria categoria) { 
		this.nombre = nombre
		this.categoria = categoria
		}
	
	ZAPATO("Zapato", Categoria.CALZADO), CAMISA("Camisa", Categoria.SUPERIOR), PANTALON("Pantalon", Categoria.INFERIOR);
	
	// Prenda prenda = new Prenda(TipoMaterial.ZAPATO)
}

Enum Categoria {
	SUPERIOR, CALZADO, INFERIOR, ACCESORIOS
}