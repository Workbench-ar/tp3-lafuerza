package model;

import java.util.HashMap;
import java.util.Map;

public class Attraction extends Propuesta {

	private Integer id;
	private String name;
	private Integer cost;
	private Double duration;
	private Integer capacity;
	private TipoAtraccion tipoAtraccion;
	private String descripcion;

	private Map<String, String> errors;

	public Attraction(Integer id, String name, Integer cost, Double duration, Integer capacity,
			TipoAtraccion tipoAtraccion, String descripcion) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.duration = duration;
		this.capacity = capacity;
		this.tipoAtraccion = tipoAtraccion;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}

	public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
		this.tipoAtraccion = tipoAtraccion;
	}

	public boolean isValid() {
		validate();
		return errors.isEmpty();
	}

	public void validate() {
		errors = new HashMap<String, String>();

		if (cost <= 0) {
			errors.put("cost", "Debe ser positivo");
		}
		if (duration <= 0) {
			errors.put("duration", "Debe ser positivo");
		}
		if (capacity <= 0) {
			errors.put("capacity", "Debe ser positivo");
		}
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Attraction [id=" + id + ", name=" + name + ", cost=" + cost + ", duration=" + duration + ", capacity="
				+ capacity + "]";
	}

	public boolean canHost(int i) {
		return capacity >= i;
	}

	public void host(int i) {
		this.capacity -= i;
	}

}
