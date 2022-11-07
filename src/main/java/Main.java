public class Main {

	public static void main(String[] args) {
		Escuela escuela = new Escuela("Adventista");

		Persona hugo = new Persona("Hugo", 8);
		Persona pepe = new Persona("Pepe", 7);
		Persona juan = new Persona("Juan", 7);
		Persona diego = new Persona("Diego", 7);

		Persona sofia = new Persona("Sofia", 6);
		Persona pablo = new Persona("Pablo", 10);
		Persona pedro = new Persona("Pedro", 10);


		Perro firulais = new Perro("Firulais", sofia, "Cafe");
		firulais.añadirOtroDueno(pablo);
		Gato misifus = new Gato("Misifus", pedro, false);

		sofia.añadirFamiliar(pablo);
		pablo.añadirFamiliar(sofia);

		pablo.añadirAmigo(pedro);
		pedro.añadirAmigo(pablo);

		escuela.agregarAlumno(hugo);
		escuela.agregarAlumno(pepe);
		escuela.agregarAlumno(juan);
		escuela.agregarAlumno(diego);
		escuela.agregarAlumno(sofia);
		escuela.agregarAlumno(pablo);
		escuela.agregarAlumno(pedro);

		System.out.println(escuela);
		System.out.println();
		System.out.println(sofia);
		System.out.println(pablo);
		System.out.println(pedro);
		System.out.println();
		System.out.println(firulais);
		System.out.println(misifus);
		System.out.println();
		firulais.comer();
		firulais.ladrar();
		misifus.morder();
		misifus.rasgunar();
	}
}