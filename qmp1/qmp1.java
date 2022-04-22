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

Enum TipoPrenda {
	Categoria categoria
	ZAPATO, CAMISA, PANTALON;
}

Enum Categoria {
	SUPERIOR, CALZADO, INFERIOR, ACCESORIOS
}