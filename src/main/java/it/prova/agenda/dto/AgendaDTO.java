package it.prova.agenda.dto;

import java.time.LocalDateTime;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgendaDTO {

	private Long id;	

	@NotBlank(message = "{titolo.notblank}")
	@Size(min = 4, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri")
	private String descrizione;
	
	@NotNull(message = "{dataPubblicazione.notnull}")
	private LocalDateTime dataOraInizio;
	
	@NotNull(message = "{minutiDurata.notnull}")
	private LocalDateTime dataOraFine;
	
	@JsonIgnoreProperties(value = { "films" })
	@NotNull(message = "{regista.notnull}")
	private UtenteDTO utente;

	public AgendaDTO(Long id,
			@NotBlank(message = "{titolo.notblank}") @Size(min = 4, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String descrizione,
			@NotNull(message = "{dataPubblicazione.notnull}") LocalDateTime dataOraInizio,
			@NotNull(message = "{minutiDurata.notnull}") LocalDateTime dataOraFine,
			@NotNull(message = "{regista.notnull}") UtenteDTO utente) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.dataOraInizio = dataOraInizio;
		this.dataOraFine = dataOraFine;
		this.utente = utente;
	}

	public AgendaDTO(
			@NotBlank(message = "{titolo.notblank}") @Size(min = 4, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String descrizione,
			@NotNull(message = "{dataPubblicazione.notnull}") LocalDateTime dataOraInizio,
			@NotNull(message = "{minutiDurata.notnull}") LocalDateTime dataOraFine) {
		super();
		this.descrizione = descrizione;
		this.dataOraInizio = dataOraInizio;
		this.dataOraFine = dataOraFine;
	}

	public AgendaDTO(
			@NotBlank(message = "{titolo.notblank}") @Size(min = 4, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String descrizione,
			@NotNull(message = "{dataPubblicazione.notnull}") LocalDateTime dataOraInizio,
			@NotNull(message = "{minutiDurata.notnull}") LocalDateTime dataOraFine,
			@NotNull(message = "{regista.notnull}") UtenteDTO utente) {
		super();
		this.descrizione = descrizione;
		this.dataOraInizio = dataOraInizio;
		this.dataOraFine = dataOraFine;
		this.utente = utente;
	}

	public AgendaDTO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public LocalDateTime getDataOraInizio() {
		return dataOraInizio;
	}

	public void setDataOraInizio(LocalDateTime dataOraInizio) {
		this.dataOraInizio = dataOraInizio;
	}

	public LocalDateTime getDataOraFine() {
		return dataOraFine;
	}

	public void setDataOraFine(LocalDateTime dataOraFine) {
		this.dataOraFine = dataOraFine;
	}

	public UtenteDTO getUtente() {
		return utente;
	}

	public void setUtente(UtenteDTO utente) {
		this.utente = utente;
	}
	
	
	
}

