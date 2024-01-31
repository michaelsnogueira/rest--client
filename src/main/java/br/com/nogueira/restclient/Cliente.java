package br.com.nogueira.restclient;

public record Cliente(
        String nome,
        String email,
        String cpf
) {
}
