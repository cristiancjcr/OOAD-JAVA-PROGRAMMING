public class Main {
    public static void main(String[] args) {
        // Obținem instanța Singleton a clasei WebHelper
        WebHelper webHelper = WebHelper.getInstance();

        // Accesăm conținutul paginii web folosind getWebSiteContent()
        String content = webHelper.getWebSiteContent();

        // Afișăm o parte din conținutul paginii (pentru a nu încarca tot conținutul în consolă)
        System.out.println("Conținutul paginii este:\n" + content.substring(0, Math.min(500, content.length()))); // Afișăm primele 500 de caractere
    }
}
