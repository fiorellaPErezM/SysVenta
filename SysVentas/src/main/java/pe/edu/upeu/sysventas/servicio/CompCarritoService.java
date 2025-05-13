package pe.edu.upeu.sysventas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysventas.modelo.CompCarrito;
import pe.edu.upeu.sysventas.repositorio.CompCarritoRepository;

import java.util.List;

@Service
public class CompCarritoService {
    @Autowired
    private CompCarritoRepository clienteRepository;
    // Create
    public CompCarrito guardarEntidad(CompCarrito to) {
        return comp.save(to);
    }
    // Report
    public List<CompCarrito> listarEntidad() {
        return clienteRepository.findAll();
    }
    // Update
    public CompCarrito actualizarEntidad(CompCarrito) {
        return clienteRepository.save(to);
    }
    // Delete
    public void eliminarRegEntidad(Long id) {
        clienteRepository.deleteById(id);
    }
    // Buscar por ID
    public CompCarrito buscarEntidad(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
