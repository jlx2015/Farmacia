package ifrn.pi.farmacia.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.farmacia.models.Remedio;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {
	
	List<Remedio> findBySelecionado(boolean selecionado);
}
