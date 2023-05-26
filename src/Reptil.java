public class Reptil extends Animal {
    public Reptil(String nome) {
        super(nome);
    }
// Adicionando Tipo Animal
    public String tipoReptil() {
        return "Este é um réptil.";
    }

//Alimentação SETADA
    public String alimentacaoReptil() {
        return "A alimentação deste réptil é desconhecida.";
    }

//Sua reprodução
    public String reproducaoReptil() {
        return "A reprodução deste réptil é desconhecida.";
    }
}
