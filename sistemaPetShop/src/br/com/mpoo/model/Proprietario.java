package br.com.mpoo.model;

import java.util.ArrayList;

public class Proprietario extends Pessoa{
	private ArrayList<Animal> animais;
	
	public Proprietario() {
		animais = new ArrayList<>();
	}
	
	private Animal buscarAnimal(Animal animal) {
		
		for (Animal a : animais) {
			if (a.getId() == animal.getId()) {
				return a;
			}
		}
		return null;
	}
	
	private Animal buscarAnimal(int id) {
		for (Animal a : animais) {
			if (a.getId() == id) {
				return a;
			}
		}
		return null;
	}

	public boolean addAnimal(Animal animal) {
		
		int id = 0;
		
		if (animais.size() != 0) {
			id = animais.get(animais.size()-1).getId()+1;
		}
		
		return animais.add(animal);
	}
	
	public boolean removerAnimal(Animal animal) {
		return animais.remove(buscarAnimal(animal));
	}
	
	public boolean isAnimal(Animal animal) {
		return animais.contains(buscarAnimal(animal));
	}
	
	public boolean atualizarAnimal(Animal animalOld, Animal animalNew) {
		
		Animal animalBD = buscarAnimal(animalOld);
		
		int index = animais.indexOf(animalBD);
		
		if (animais.contains(animalBD)) {
			animalBD.setNome(animalNew.getNome());
			animalBD.setIdade(animalNew.getIdade());
			animalBD.setEstado(animalNew.getEstado());
			animalBD.setPeso(animalNew.getPeso());
			animalBD.setRaca(animalNew.getRaca());
			animais.set(index, animalBD);
		}
		
		return false;
	}
	
	public String getDadosAnimal(int id) {
		return buscarAnimal(id).toString();
	}
	
	public ArrayList<Animal> getAnimais() {
		return animais;
	}

}
