package library.items;

import library.interfaces.Baixavel;
import library.interfaces.Visualizavel;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + titulo + " - Autor: " + autor;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo: " + titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando o vídeo: " + titulo);
    }
}
