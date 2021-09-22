

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto01 = new Produto(); 

        
        /**criar um objeto é simples, apenas chame a classe e
        diga a variável que 'herdará' os atributos dessa classe. Enfim, uma váriavel 
        que utiliza os dados de uma classe é chamado de OBJETO e ela pode utilizar tudo o que a classe dá direito
        como demonstrado abaixo. Um objeto nada mais é que a reutilização de um código. */
/*         
        produto01.codigo = 1;
        produto01.nome = "test";
        produto01.precoCusto = 19.96;
        produto01.precoVenda = 25.95;
        produto01.qtdEstoque = 700.00;

        Produto produto02 = new Produto();
        produto02.codigo = 2;
        produto02.nome = "test2";
        produto02.precoCusto = 149.96;
        produto02.precoVenda = 265.95;
        produto02.qtdEstoque = 7040.00; */

        /**
         * como fiz acima está errado porque eu acessei isso externamente, porque isso pode ser modificado
         * e não é uma pratica segura, ela não te mantem no controle desses atributos
         * além de ficar um código sujo, tendo que acessar ela direto o tempo todo e setando aqui mesmo
         * o metodo simplesmente faria isso tudo sozinho, em poucas linhas de código ;)
         * é aí que entra a criação dos getters e setters, a classe produto que tem que ter a responsabilidade
         * de gettar o valor e settá-lo, são os modificadores da classe
         */
        produto01.setProduto(1, "macadamia", 500.00, 700.00, 20.00);
        System.out.println(produto01.getNome());
        /**
         * forma correta de se utilizar os metodos, o getter e o setter
         */

        produto01.vender(5.0); 
        /** AQUI, isso é mt importante para mim, eu realmente aprendi como usar
        um método aqui. Eu só imaginava que podia ser assim, mas finalmente utilizei...
        Eu chamei o método e passei a váriavel criada a partir da classe utilizando esse método
        e passei nele o que foi pedido, no caso, um double. Esse método, então, SUBTRAIU o que havia setado
        no qtdEstoque do meu objeto, como mostrado SE eu printar e definir os valores nos parametros.
        INCLUSIVE ISSO É CHAMADO DE ENCAPSULAMENTO. Eu encapsulo o método sem precisar saber o que ele
        internamente faz.  */
        System.out.println(produto01.getEstoque());
        /**
         * agora irei chamar meu mais novo metodo, o método de alterar o preco
         * 
         */
        produto01.alterarPrecoVC(300.00);
    
    }
}









