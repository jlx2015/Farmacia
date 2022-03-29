 package ifrn.pi.farmacia.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity 
public class Compra {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Remedio> remedios;
	
	private String texto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<Remedio> getRemedios() {
		return remedios;
	}

	public void setRemedios(List<Remedio> remedios) {
		this.remedios = remedios;
	}
	
	
}
