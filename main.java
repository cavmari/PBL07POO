package library.main;

import library.items.Ebook;
import library.items.VideoDigital;

public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Java Programming", "John Smith");
        Ebook ebook2 = new Ebook("Python Basics", "Jane Doe");
        VideoDigital video1 = new VideoDigital("Introduction to Algorithms", "Professor X");
        VideoDigital video2 = new VideoDigital("Machine Learning Fundamentals", "Dr. Y");

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        ebook1.baixar();
        ebook2.baixar();

        video1.visualizar();
        video2.visualizar();
    }
}
