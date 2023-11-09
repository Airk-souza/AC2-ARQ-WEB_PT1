package github.com.azkalum.repository;

import github.com.azkalum.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByProdPrecoGreaterThan(Double valor);
    List<Produto> findProdutoByProdPrecoLessThanEqual(Double valor);
    List<Produto> findProdutoByProdNomeStartingWith (String nome);

}
