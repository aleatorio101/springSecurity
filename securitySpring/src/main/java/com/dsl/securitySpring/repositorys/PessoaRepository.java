package com.dsl.securitySpring.repositorys;

import com.dsl.securitySpring.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel,Long> {
}
