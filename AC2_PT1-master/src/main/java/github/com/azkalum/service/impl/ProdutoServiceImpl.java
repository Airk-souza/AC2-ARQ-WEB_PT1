package github.com.azkalum.service.impl;

import github.com.azkalum.entity.Produto;
import github.com.azkalum.repository.ProdutoRepository;
import github.com.azkalum.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto obterProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Produto atualizarProduto(Long id, Produto produto) {
        produto.setIdProduto(id);
        return produtoRepository.save(produto);
    }

    @Override
    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
