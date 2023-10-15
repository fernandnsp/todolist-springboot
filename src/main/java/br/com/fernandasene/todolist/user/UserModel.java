package br.com.fernandasene.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Adiciona get e set pelo lombok
@Entity(name = "tb_users") // Entidade = Tabela
public class UserModel {

    @Id // Especifica como chave primária)
    @GeneratedValue(generator = "UUID") // Gera valores aletatórios do tipo UUID
    private UUID id;

    @Column(unique = true) // atributo único
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // Atribui o tempo de criação da variável (coluna)
    private LocalDateTime createdAt;
}
