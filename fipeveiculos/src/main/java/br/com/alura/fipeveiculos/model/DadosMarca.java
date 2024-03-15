package br.com.alura.fipeveiculos.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Marcas")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosMarca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String codigo;
    @Column(name = "Marca")
    @JsonAlias("nome") private String marca;
//    @Enumerated(EnumType.STRING)
    private String segmento;
    private String detalheIa;

    @Transient
    private List<Veiculo> veiculos = new ArrayList<>();

//    public DadosMarca(Dados dados){
//        this.codigo = dados.codigo();
//        this.marca = dados.nome();
//        this.segmento = "carro";
//        this.detalheIA = "Data retornada da IA";
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getDetalheIa() {
        return detalheIa;
    }

    public void setDetalheIa(String detalheIa) {
        this.detalheIa = detalheIa;
    }



    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                " Código = " + codigo +
                ", Marca = " + marca +
                ", Segmento = " + segmento +
                ", Detalhe = " + detalheIa;
    }
}


