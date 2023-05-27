public class Sapo extends Anfibio {

    public Sapo(String nome) {
        super(nome);
    }

    public String tipoSapo() {
        return "Este é um sapo.";
    }

    public String caracteristicaSapo() {
        return "Este sapo tem características específicas.";
    }
    
    public String reproducaoSapo() {
        return "Este sapo reproduz de maneira específica.";
    }

    @Override
    public String reproducaoPinguim() {
        return "O sapo reproduz de maneira semelhante a um pinguim.";
    }
    
}
