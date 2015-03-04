def lenguajes = ["groovy", "java", "list", "scheme", "elixir", "ocaml"]

lenguajes.each{
	println it
}

lenguajes.eachWithIndex{ nombre, indice ->
	println indice
	println nombre
}