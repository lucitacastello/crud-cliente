package com.acrdev.crudcliente.dto;

import com.acrdev.crudcliente.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "Campo obrigatório!")
    private String name;

    @NotBlank(message = "Campo obrigatório!")
    private String cpf;

    @Positive(message = "A renda deve ser um valor positivo!")
    private Double income;

    @PastOrPresent(message = "A data de nascimento não pode ser uma data futura!")
    private LocalDate birthDate;

    @PositiveOrZero(message = "O campo não pode ser negativo. Deve ser 0 ou mais!")
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthDate = entity.getBirthDate();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
