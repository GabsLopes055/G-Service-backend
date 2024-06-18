package com.g_service.back_end.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.g_service.back_end.domain.tipoUsuario.tipoUsuario;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idUser;

    private String nomeCompleto;

    private String usuario;

    private String email;

    private String senha;

    private LocalDateTime dataCadastro;

    private tipoUsuario tipoUsuario;

    @PrePersist
    private void prePersist() {
        this.dataCadastro = LocalDateTime.now();
    }

}
