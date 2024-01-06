package com.ufn.escola.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EscolasRequestDTO {
	
	protected long id;
	protected String nome;
	protected String endereco;

}
