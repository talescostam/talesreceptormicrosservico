package com.senac.TalesReceptorMicroservico.repositories;

import com.senac.TalesReceptorMicroservico.entitiy.Zap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZapRepository extends JpaRepository<Zap, Integer> {
}
