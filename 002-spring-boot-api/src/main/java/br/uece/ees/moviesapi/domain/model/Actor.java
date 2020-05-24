package br.uece.ees.moviesapi.domain.model;

import lombok.Data;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "actors")
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Actor {

	@Id
	@EqualsAndHashCode.Include
	@Column(name = "actor_id", nullable = false)
	// @GenericGenerator(name = "custom", strategy = "uuid")
	@GeneratedValue(generator = "custom", strategy = GenerationType.IDENTITY)
	private String id;

	@NotNull
	@NotEmpty
	@Size(max = 25)
	@Column(name = "actor_name", nullable = false)
	private String name;

}