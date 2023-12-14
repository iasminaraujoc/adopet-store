package br.com.alura.adopetstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "perfis")
public class Perfil implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public boolean isAdmin() {
        return this.nome.equals("ROLE_ADMIN");
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getAuthority() {
        return nome;
    }

}
