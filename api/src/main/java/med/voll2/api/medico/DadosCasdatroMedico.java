package med.voll2.api.medico;

import med.voll2.api.endereco.DadosEndereco;

public record DadosCasdatroMedico(String nome, String email, String telefone, String crm, Especialidade especialidade, DadosEndereco endereco  ) {
}
