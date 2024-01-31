package br.com.nogueira.restclient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteUseCase clienteUseCase;

    public ClienteController(ClienteUseCase clienteUseCase) {
        this.clienteUseCase = clienteUseCase;
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente clienteResponse = clienteUseCase.createCliente(cliente);
        return ResponseEntity.ok(clienteResponse);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable String id) {
        Cliente clienteResponse = clienteUseCase.findById(id);
        return ResponseEntity.ok(clienteResponse);
    }
}
