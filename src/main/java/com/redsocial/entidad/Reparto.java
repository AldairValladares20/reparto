package com.redsocial.entidad;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "reparto")
	public class Reparto {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idreparto")
		private int idreparto;
		
		@Column(name = "direccion")
		private String direccion;
		
		@Column(name = "codrepartidor")
		private String codrepartidor;
		
		@Column(name = "nombreTienda")
		private String nombreTienda;
		
		@Column(name = "nombrecliente")
		private String nombrecliente;
		
		@Column(name = "total")
		private Double total;

		public int getIdreparto() {
			return idreparto;
		}

		public void setIdreparto(int idreparto) {
			this.idreparto = idreparto;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCodrepartidor() {
			return codrepartidor;
		}

		public void setCodrepartidor(String codrepartidor) {
			this.codrepartidor = codrepartidor;
		}

		public String getNombreTienda() {
			return nombreTienda;
		}

		public void setNombreTienda(String nombreTienda) {
			this.nombreTienda = nombreTienda;
		}

		public String getNombrecliente() {
			return nombrecliente;
		}

		public void setNombrecliente(String nombrecliente) {
			this.nombrecliente = nombrecliente;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}
		
		
		
	}

