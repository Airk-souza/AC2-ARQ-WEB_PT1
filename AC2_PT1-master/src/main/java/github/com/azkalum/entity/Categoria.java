package github.com.azkalum.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(schema = "tbl_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    private String catNome;

    @OneToMany(mappedBy = "categoriaProduto", fetch = FetchType.EAGER)
    private List<Produto> produtos;

    @Override
    public String toString() {
        return "Categoria{" +
                "produtos=" + produtos +
                '}';
    }
}