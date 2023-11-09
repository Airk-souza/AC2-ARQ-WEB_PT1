package github.com.azkalum.service;

import github.com.azkalum.entity.Categoria;

import java.util.List;

public interface CategoriaService {

    List<Categoria> listarCategorias();
    Categoria obterCategoriaPorId(Long id);
    Categoria criarCategoria(Categoria categoria);
    Categoria atualizarCategoria(Long id, Categoria categoria);
    void excluirCategoria(Long id);

}
