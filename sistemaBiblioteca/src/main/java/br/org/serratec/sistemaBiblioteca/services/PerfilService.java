package br.org.serratec.sistemaBiblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.sistemaBiblioteca.entities.Perfil;
import br.org.serratec.sistemaBiblioteca.repositories.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	PerfilRepository perfilRepository;

	public List<Perfil> findAll() {
		return perfilRepository.findAll();
	}

	public Perfil findById(Integer id) {
		return perfilRepository.findById(id).orElse(null);
	}

	public Perfil save(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	public Perfil update(Perfil perfil) {
		return perfilRepository.save(perfil);
	}
	
	public boolean deleteById(Integer id) {
		if (perfilRepository.existsById(id)) {
			perfilRepository.deleteById(id);
			Perfil perfilDeletado = perfilRepository.findById(id).orElse(null);
			if (perfilDeletado == null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public long count() {
		return perfilRepository.count();
	}
}

