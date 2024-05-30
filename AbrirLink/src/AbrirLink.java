import java.awt.Desktop;
import java.net.URI;

public class AbrirLink {

    public static void main(String[] args) {
        try {
            // Cria o URI para o link fornecido
            URI link = new URI("https://colabhub.my.canva.site/");

            // Verifica se a classe Desktop é suportada no ambiente atual
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                long startTime = System.nanoTime(); // Marca o início do tempo

                // Abre o link no navegador padrão do sistema
                Desktop.getDesktop().browse(link);

                long endTime = System.nanoTime(); // Marca o fim do tempo
                long duration = endTime - startTime; // Calcula a duração
                double seconds = duration / 1_000_000_000.0; // Converte para segundos

                System.out.printf("O comando para abrir o link foi executado em %.2f segundos.%n", seconds);
            } else {
                System.out.println("Ação de navegação não suportada no seu sistema.");
            }
        } catch (Exception erro) {
            System.out.println("Erro ao tentar abrir o link: " + erro.getMessage());
        }
    }
}
