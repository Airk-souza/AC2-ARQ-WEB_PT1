package github.com.azkalum.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(schema = "tbl_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private String prodNome;

    private double prodPreco;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoriaProduto;

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", prodNome='" + prodNome + '\'' +
                ", prodPreco=" + prodPreco  +
                '}';
    }
}
