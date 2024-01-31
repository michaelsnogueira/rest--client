package br.com.nogueira.restclient;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ClienteUseCase {

    private final RestClient restClient;

    public ClienteUseCase(RestClient restClient) {
        this.restClient = restClient;
    }


    public Cliente createCliente(Cliente cliente) {
        return restClient.post()
                .uri("/cliente")
                .body(cliente)
                .retrieve()
                .body(Cliente.class);
    }

    public Cliente findById(String id) {
        return restClient.get()
                .uri("/cliente/{id}", id)
                .retrieve()
                .body(Cliente.class);
    }
}
