public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String somAnimal() {
        return "O som deste animal é desconhecido.";
    }

    public String habitatAnimal() {
        return "O habitat deste animal é desconhecido.";
    }
}



