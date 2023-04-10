package ru.job4j.text;

import java.io.FileOutputStream;
import java.io.IOException;

public class LatexText {
    public static void main(String[] args) {
        String n1 = """
                \\documentclass[a4paper, 12pt]{article}
                \\usepackage{ucs}
                \\usepackage[utf8x]{inputenc}
                \\usepackage[russian]{babel}
                \\title{Набор текста на Latex}
                \\date{10.04.2023}
                \\author{Муравьев А.А.} 
                \\begin{document}
                \\maketitle
                	Обходя окрестности Онежского озера, отец Онуфрий обнаружил медный рубль.
                	Больше на этом месте находок не было...
                	\\begin{eqnarray}
                	B = \\sqrt{A^{2}+ C^{2}}=100\\\\
                	J\\varphi = \\frac{U\\mu }{P{\\upsilon}}
                	\\end{eqnarray}
                \\end{document}         
                """;

        try (FileOutputStream f = new FileOutputStream("E:/ITMO/Java_new/latexfile.tex");) {
            f.write(n1.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
