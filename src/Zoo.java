public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal genérico");
        Mamifero mamifero = new Mamifero("Mamífero genérico");
        Macaco macaco = new Macaco("Macaco Bobo");
        Reptil reptil = new Reptil("Réptil genérico");
        Tartaruga tartaruga = new Tartaruga("Tartaruga Ninja");
        Ave ave = new Ave("Ave genérica");
        Pinguim pinguim = new Pinguim("Pinguim Imperador");
        Peixe peixe = new Peixe("Peixe genérico");
        Salmon salmon = new Salmon("Salmão real");
        Anfibio anfibio = new Anfibio("Anfíbio genérico");
        Sapo sapo = new Sapo("Sapo cururu");

        System.out.println(animal.getNome());
        System.out.println(mamifero.tipoMamifero());
        System.out.println(macaco.tipoMacaco());
        System.out.println(reptil.tipoReptil());
        System.out.println(tartaruga.tipoTartaruga());
        System.out.println(ave.tipoAve());
        System.out.println(pinguim.tipoPinguim());
        System.out.println(peixe.tipoPeixe());
        System.out.println(salmon.tipoSalmon());
        System.out.println(anfibio.tipoAnfibio());
        System.out.println(sapo.tipoSapo());
    }
}

