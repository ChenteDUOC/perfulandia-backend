package com.perfulandia.usuarioservice.repository;

import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//Importe sus metodos para trabajar con un CRUD
//findAll()bo listar
//findByID(id)
//save() guardar
//delete()

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
