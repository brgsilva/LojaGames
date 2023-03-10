package com.example.LojaGames.repository;

import com.example.LojaGames.model.Categoria;
import com.example.LojaGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
        public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String nome);
}
