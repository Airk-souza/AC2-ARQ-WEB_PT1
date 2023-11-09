package github.com.azkalum.repository;

import github.com.azkalum.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findByCatNomeStartingWith(String nome);
    @Query("SELECT c FROM Categoria c LEFT JOIN FETCH c.produtos WHERE c.idCategoria = :idCategoria")
    Categoria findCategoriaWithProdutosById(@Param("idCategoria") Long idCategoria);

}
