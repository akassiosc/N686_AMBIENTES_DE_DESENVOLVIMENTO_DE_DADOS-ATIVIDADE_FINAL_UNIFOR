
public class Salmon extends Peixe {
    public Salmon(String nome) {
        super(nome);
    }

    public String tipoSalmon() {
        return "Este é um salmão.";
    }

    public String caracteristicaSalmon() {
        return "Este salmão tem características específicas.";
    }

    public String reproducaoSalmon() {
        return "Este salmão reproduz de maneira específica.";
    }

    @Override
    public String reproducaoMacaco() {
        return "O salmão reproduz de maneira semelhante a um macaco.";
    }
    
}
