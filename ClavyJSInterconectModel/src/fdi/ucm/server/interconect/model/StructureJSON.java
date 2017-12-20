/**
 * 
 */
package fdi.ucm.server.interconect.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Crea el objeto base que define un coleccion attribute
 * @author Joaquin Gayoso-Cabada
 *
 */
public class StructureJSON implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	protected List<StructureJSON> Sons=new ArrayList<StructureJSON>();
	
	protected ArrayList<Long> Id;
	
	protected String Name;

	protected ArrayList<OperationalValueTypeJSON> Shows;  
	
	protected boolean Multivalued;
	
	protected boolean Browseable;
	
	protected boolean Selected;
	
	protected boolean Extended;
	
	protected boolean Filtro;
	
	protected Long ClaseOf;
	
	protected String Value;
	
	protected Long ElementId;
	
	private boolean SelectedValue;
	
	protected ArrayList<OperationalValueJSON> OperationalValues;  
	
	public enum TypeOfStructureEnum {Text,Resource,Link,Basic};

	protected TypeOfStructureEnum TypeOfStructure;
	/**
	 * Consctructor por defecto
	 */
	public StructureJSON() {
		Sons=new ArrayList<StructureJSON>();	
		Id=new ArrayList<Long>();
		Name="unknown";
		Shows=new ArrayList<OperationalValueTypeJSON>();
		Multivalued=false;
		Browseable=false;
		ClaseOf=0l;
		Selected=false;
		Filtro=false;
		Value="";
		OperationalValues=new ArrayList<OperationalValueJSON>();
		TypeOfStructure=TypeOfStructureEnum.Basic;
		Extended=false;
		ElementId=0l;
		SelectedValue=false;
	}
	
	
	/** Constructor con todos los parametros
	 * @param father Padre del attibuto.
	 * @param name Nombre del atributo.
	 * @param browseable Define si es navegable
	 */
		public StructureJSON(String name,ArrayList<Long> id,boolean multivalued,
				boolean browseable,boolean Selected,boolean extended,boolean filtro,
				Long ClaseOf,String Value,boolean SelectedValue,ArrayList<OperationalValueTypeJSON> OperationalTypeValues,
				ArrayList<OperationalValueJSON> OperationalValues,TypeOfStructureEnum typeOfStruture,Long elementId) {
			super();
			Sons=new ArrayList<StructureJSON>();	
			this.Id=id;
			Name = name;
			Shows=OperationalTypeValues;
			Multivalued=multivalued;
			Browseable=browseable;
			this.ClaseOf=ClaseOf;
			this.Selected=Selected;
			this.Filtro=filtro;
			this.Value=Value;
			this.OperationalValues=OperationalValues;
			this.TypeOfStructure=typeOfStruture;
			Extended=extended;
			ElementId=elementId;
			this.SelectedValue=SelectedValue;
		}



	/**
	 * @return the sons
	 */
	public List<StructureJSON> getSons() {
		return Sons;
	}

	/**
	 * @param sons the sons to set
	 */
	public void setSons(List<StructureJSON> sons) {
		Sons = sons;
	}


	/**
	 * @return the id
	 */
	public ArrayList<Long> getId() {
		return Id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(ArrayList<Long> id) {
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
	 * @return the shows
	 */
	public ArrayList<OperationalValueTypeJSON> getShows() {
		return Shows;
	}




	/**
	 * @param shows the shows to set
	 */
	public void setShows(ArrayList<OperationalValueTypeJSON> shows) {
		Shows = shows;
	}


	/**
	 * @return the multivalued
	 */
	public boolean isMultivalued() {
		return Multivalued;
	}


	/**
	 * @param multivalued the multivalued to set
	 */
	public void setMultivalued(boolean multivalued) {
		Multivalued = multivalued;
	}


	/**
	 * @return the browseable
	 */
	public boolean isBrowseable() {
		return Browseable;
	}


	/**
	 * @param browseable the browseable to set
	 */
	public void setBrowseable(boolean browseable) {
		Browseable = browseable;
	}

public Long getClaseOf() {
	return ClaseOf;
}


public void setClaseOf(Long claseOf) {
	ClaseOf = claseOf;
}


public boolean isSelected() {
	return Selected;
}


public void setSelected(boolean selected) {
	Selected = selected;
}

public boolean isFiltro() {
	return Filtro;
}

public void setFiltro(boolean filtro) {
	Filtro = filtro;
}

public String getValue() {
	return Value;
}

public void setValue(String value) {
	Value = value;
}

public ArrayList<OperationalValueJSON> getOperationalValues() {
	return OperationalValues;
}

public void setOperationalValues(ArrayList<OperationalValueJSON> operationalValues) {
	OperationalValues = operationalValues;
}

public TypeOfStructureEnum getTypeOfStructure() {
	return TypeOfStructure;
}

public void setTypeOfStructure(TypeOfStructureEnum typeOfStructure) {
	TypeOfStructure = typeOfStructure;
}

public boolean isExtended() {
	return Extended;
}

public void setExtended(boolean extended) {
	Extended = extended;
}

public Long getElementId() {
	return ElementId;
}

public void setElementId(Long elementId) {
	ElementId = elementId;
}

public boolean isSelectedValue() {
	return SelectedValue;
}


public void setSelectedValue(boolean selectedValue) {
	SelectedValue = selectedValue;
}

}
