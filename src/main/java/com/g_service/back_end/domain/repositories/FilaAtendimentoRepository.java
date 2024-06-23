package com.g_service.back_end.domain.repositories;

import com.g_service.back_end.domain.entities.FilaAtendimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilaAtendimentoRepository extends JpaRepository<FilaAtendimento, String> {
}
