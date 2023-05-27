public class Macaco extends Mamifero {
    public Macaco(String nome) {
        super(nome);
    }

    public String tipoMacaco() {
        return "Este é um macaco.";
    }

    public String caracteristicaMacaco() {
        return "Este macaco tem características específicas.";
    }
    
    public String reproducaoMacaco() {
        return "Este macaco reproduz de maneira específica.";
    }
    
    @Override
    public String reproducaoReptil() {
        return "Este macaco reproduz de maneira semelhante a um réptil.";
    }


}