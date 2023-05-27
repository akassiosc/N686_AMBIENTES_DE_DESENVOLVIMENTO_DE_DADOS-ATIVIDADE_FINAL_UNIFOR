public class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }

    public String tipoPeixe() {
        return "Este é um peixe.";
    }

    public String alimentacaoPeixe() {
        return "A alimentação deste peixe é desconhecida.";
    }

    public String reproducaoPeixe() {
        return "A reprodução deste peixe é desconhecida.";
    }

    public String reproducaoMacaco() {
        return "A reprodução deste peixe é desconhecida.";
    }
    
    @Override
    public String toString() {
        return "Peixe []";
    }
}
