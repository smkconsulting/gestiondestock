package com.smkconsulting.gestiondestock.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "article")
public class Article extends AbstractEntity {

	@Column(name = "codearticle")
	private String codeArticle;

	@Column(name = "designation")
	private String designation;

	@Column(name = "prixunitaireht")
	private BigDecimal prixUnitaireHt;

	@Column(name = "tauxtva")
	private BigDecimal tauxTva;

	@Column(name = "prixunitairettc")
	private BigDecimal prixUnitaireTtc;

	@Column(name = "photo")
	private String photo;

	@Column(name = "identreprise")
	private Integer idEntreprise;

	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;

	@OneToMany(mappedBy = "article")
	private List<LigneVente> ligneVentes;

	@OneToMany(mappedBy = "article")
	private List<LigneCommandeClient> ligneCommandeClients;

	@OneToMany(mappedBy = "article")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

	@OneToMany(mappedBy = "article")
	private List<MvtStk> mvtStks;
}
