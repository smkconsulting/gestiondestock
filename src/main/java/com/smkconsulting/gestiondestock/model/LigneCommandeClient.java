package com.smkconsulting.gestiondestock.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "idcommandeclient")
	private CommandeClient commandeClient;

	@Column(name = "quantite")
	private BigDecimal quantite;

	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;

	@Column(name = "identreprise")
	private Integer idEntreprise;
}
