/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase que genera el serializable para una gramatica con su estructura
 * @author Joaquin Gayoso-Cabada
 *
 */
public class GrammarJSON implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7127361258801014570L;
	private List<StructureJSON> ListaS;
	
	private Long Id;
	private String Name;
	private String Description;
	private Long Coleccion;
	private List<OperationalValueTypeJSON> Operational;	
	
	
	public GrammarJSON() {

		ListaS=new ArrayList<StructureJSON>();
	}

	/**
	 * @param g
	 * @param listaS
	 */
	public GrammarJSON(Long id, String name, String description,
			Long coleccion, 
			List<OperationalValueTypeJSON> operational, List<StructureJSON> listaS) {
		super();
		Id = id;
		Name = name;
		Description = description;
		Coleccion = coleccion;
		Operational = operational;
		ListaS = listaS;
	}



	/**
	 * @return the listaS
	 */
	public List<StructureJSON> getListaS() {
		return ListaS;
	}

	/**
	 * @param listaS the listaS to set
	 */
	public void setListaS(List<StructureJSON> listaS) {
		ListaS = listaS;
	}
	
	/**
	 * @return the operational
	 */
	public List<OperationalValueTypeJSON> getOperational() {
		return Operational;
	}

	/**
	 * @param operational the operational to set
	 */
	public void setOperational(List<OperationalValueTypeJSON> operational) {
		Operational = operational;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * @return the coleccion
	 */
	public Long getColeccion() {
		return Coleccion;
	}

	/**
	 * @param coleccion the coleccion to set
	 */
	public void setColeccion(Long coleccion) {
		Coleccion = coleccion;
	}


	
}
