package Loja;

public class Pratos {

    private String[] nome = new String[2];
    private double[] preco = new double[nome.length];
    private String[] categoria = new String[3]; //entrada, sobremesa, bebida

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public double[] getPreco() {
        return preco;
    }

    public void setPreco(double[] preco) {
        this.preco = preco;
    }

    public String[] getCategoria() {
        return categoria;
    }

    public void setCategoria(String[] categoria) {
        this.categoria = categoria;
    }

    public void cadastrar(){
        for (int i = 0; i <= nome.length; i++) {
            //metodo do cadastro do prato (coloca os valores pra no debaixo mostrar)
            System.out.println("cadastro");
        }
    }

    public void listar(){
        for (int i = 0; i <= nome.length; i++){
            //criar a estrutura q lista o que eu cadastrei acima
        }
    }

    public void alterar(){
        for (int i = 0; i <= nome.length; i++){
            //filtra as partes de acordo com o nome
        }
    }
}

