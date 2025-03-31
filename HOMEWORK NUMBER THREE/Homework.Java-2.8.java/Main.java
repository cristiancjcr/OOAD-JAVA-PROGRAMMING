public class Main {
    public static void main(String[] args) {
        // Creăm aparate electrice
        AparatElectric aparatCafea = new AparatElectric("Aparat de cafea");
        AparatElectric frigider = new AparatElectric("Frigider");
        AparatElectric televizor = new AparatElectric("Televizor");

        // Creăm un prelungitor
        Prelungitor prelungitor = new Prelungitor();

        // Conectăm aparatele la prelungitor
        prelungitor.conecteazaAparat(aparatCafea);
        prelungitor.conecteazaAparat(frigider);
        prelungitor.conecteazaAparat(televizor);

        // Deconectăm un aparat de la prelungitor
        prelungitor.deconecteazaAparat(frigider);

        // Deconectăm toate aparatele
        prelungitor.deconecteazaToateAparatele();
    }
}
