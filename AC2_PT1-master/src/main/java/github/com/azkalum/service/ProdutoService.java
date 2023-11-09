package github.com.azkalum.service;

import github.com.azkalum.entity.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> listarProdutos();
    Produto obterProdutoPorId(Long id);
    Produto criarProduto(Produto produto);
    Produto atualizarProduto(Long id, Produto produto);
    void excluirProduto(Long id);

}
