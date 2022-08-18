package br.com.bieniek.repository;

import br.com.bieniek.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<AlunoEntity, Long> {
}
