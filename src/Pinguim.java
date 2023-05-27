public class Pinguim extends Ave {
    public Pinguim(String nome) {
        super(nome);
    }

    public String tipoPinguim() {
        return "Este é um pinguim.";
    }

    public String caracteristicaPinguim() {
        return "Este pinguim tem características específicas.";
    }
    
    public String reproducaoPinguim() {
        return "Este pinguim reproduz de maneira específica.";
    }
    @Override
    public String reproducaoSalmon() {
        return "O pinguim reproduz de maneira semelhante a um salmão.";
    }
}