package com.ufn.escola.model.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdvertenciasResponseDTO {
	
	protected long id;
	protected AlunosResponseDTO aluno;
	protected String descricao;
	protected String status;
	protected LocalDate createAt;
	

}
