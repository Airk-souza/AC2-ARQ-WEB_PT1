package github.com.azkalum;

import github.com.azkalum.entity.Categoria;
import github.com.azkalum.entity.Produto;
import github.com.azkalum.repository.CategoriaRepository;
import github.com.azkalum.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Ac2Pt1Application {

//	@Bean
//	public CommandLineRunner init(@Autowired ProdutoRepository produtoRepository, @Autowired CategoriaRepository categoriaProdutoRepository) {
//
//		return args -> {
//
//			Categoria categoria = new Categoria();
//			categoria.setCatNome("Joias");
//
//			Categoria categoria2 = new Categoria();
//			categoria2.setCatNome("Relógios");
//
//			Categoria categoria3 = new Categoria();
//			categoria3.setCatNome("Eletrônico");
//
//			categoriaProdutoRepository.save(categoria);
//			categoriaProdutoRepository.save(categoria2);
//			categoriaProdutoRepository.save(categoria3);
//
//			Produto produto = new Produto();
//			produto.setProdNome("Rolex Submariner");
//			produto.setProdPreco(78.62);
//			produto.setCategoriaProduto(categoria2);
//
//			Produto produto2 = new Produto();
//			produto2.setProdNome("Aliança Life Love Pandora");
//			produto2.setProdPreco(35.00);
//			produto2.setCategoriaProduto(categoria);
//
//			Produto produto3 = new Produto();
//			produto3.setProdNome("Produto Dell G15");
//			produto3.setProdPreco(60.00);
//			produto3.setCategoriaProduto(categoria3);
//
//			produtoRepository.saveAll(List.of(produto,produto2,produto3));
//
//			System.out.println("Produtos com preço maior que 40R$: ");
//			List<Produto> produtosComPrecoMaiorQue35 = produtoRepository.findByProdPrecoGreaterThan(35.0);
//			produtosComPrecoMaiorQue35.forEach(System.out::println);
//
//			System.out.println("Produtos com preço menor que 50R$: ");
//			List<Produto> produtosComPrecoMenorQue50 = produtoRepository.findProdutoByProdPrecoLessThanEqual(50.0);
//			produtosComPrecoMenorQue50.forEach(System.out::println);
//
//			System.out.println("Produtos que o nome começa com 'Produto': ");
//			List<Produto> produtosQueComecamCom = produtoRepository.findProdutoByProdNomeStartingWith("Produto");
//			produtosQueComecamCom.forEach(System.out::println);
//
//			System.out.println("Produtos da categoria que começam com 'Joia': ");
//			List<Categoria> categoriasQueComecamCom = categoriaProdutoRepository.findByCatNomeStartingWith("Joia");
//			categoriasQueComecamCom.forEach(System.out::println);
//
//			System.out.println("Categoria pelo ID e todos os produtos relacionados a essa categoria: ");
//			Categoria categoriasQueComecamPeloID = categoriaProdutoRepository.findCategoriaWithProdutosById(2L);
//			System.out.println(categoriasQueComecamPeloID.getCatNome());
//			categoriasQueComecamPeloID.getProdutos().forEach(System.out::println);
//
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(Ac2Pt1Application.class, args);
	}

}
