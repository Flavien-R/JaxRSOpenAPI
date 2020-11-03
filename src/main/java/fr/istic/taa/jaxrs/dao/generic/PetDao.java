package fr.istic.taa.jaxrs.dao.generic;

import java.util.List;

import fr.istic.taa.jaxrs.domain.Pet;

public class PetDao implements IGenericDao<Long, Pet>{
	
	public PetDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pet findOne(Long id) {
		// TODO Auto-generated method stub
		Pet p = new Pet();
		p.setId(id);
		return p;
	}

	@Override
	public List<Pet> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Pet entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pet update(Pet entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Pet entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long entityId) {
		// TODO Auto-generated method stub
		
	}
}
