public class Produto { 
    /* isso é a criação de uma classe. essa classe permite conter diversas características capazes de
    serem reutilizadas futuramente no código. A classe também pode carregar um metodo. ela é publica porque
    pode ser acessada de forma publica (ava), tenho acesso a ela e seus metodos de forma publica, e posso utiliza-la
    em outras classes. eu posso simplesmente omitir que ela é public, e ela continuara publica porque o java
    é assim
    /**
    Integer codigo;
    String nome;
    Double precoVenda;
    Double precoCusto;
    Double qtdEstoque;
    /**
     * porem passar as características/atributos como foi passado acima, está completamente errado porque está
     * sendo acessada de forma pública e devemos restringir o acesso a isso.
     * Elas devem ser acessadas perante métodos. E é isso que eu vou ter que alterar aqui e lá no app.java
     * elas nao podem estar publicas para qualquer um, fora da classe, alterar. eles precisam ser privados
     * para serem manipulados pela CLASSE pelo METODO, uma AÇÃO que eu irei definir e verificar se é válido 
     * DENTRO do METODO, dos modificadores.
     * @param qtdVendida
     */
    private Integer codigo;
    private String nome;
    private Double precoVenda;
    private Double precoCusto;
    private Double qtdEstoque;
    /**
     * e essa é a forma correta de se fazer, colocando como atributo privado.
     * @param qtdVendida
     */
    /**
     * agora irei criar o setter que é a parte do codigo em que eu vou receber valores de acordo com meu atributo.
     * tipo, o setter serve para ficar como publico e visivel e ser passado por ele, como se fosse uma peneira
     * ou algo do tipo, ele que tem a função de receber o valor referente ao atributo, armazenar
     *  e assim tratá-lo como foi definido pela classe. isso é que é o encapsulamento, nao permitir que de fora
     * da classe eu modifique diretamente os artibutos. eles devem ser manipulados pela classe produto, atraves
     * de metodos. 
     * @param qtdVendida
     */
    void setProduto(Integer codigow, String nomew, Double precoVendaw, Double precoCustow, Double qtdEstoquew){
        this.codigo = codigow;
        this.nome = nomew;
        this.precoVenda = precoVendaw;
        this. precoCusto = precoCustow;
        this.qtdEstoque = qtdEstoquew;
        /**
         * posso colocar a variavel dentro do set com outro nome apenas para mostrar que existe uma diferneça
         * entre o que é utilizado no parametro, e a quem esse parametro se refere. no caso this.codigo
         * this classe CODIGO (ou seja, a caracteristica codigo DESTA (this) classe.) está sendo atribuida
         * a variavel (parametro do metodo) codigow. o W para diferenciar as duas, para fins didaticos
         * ficar mais claro que ha uma diferença na var usada pelo this, e na var criada pra parametro...
         */
    }
    /**
     * com isso estou criando o metodo setter que pega todas as caracteristicas da classe e utiliza em uma só
     * linha de código, passando os valores pelos parametros... abaixo o metodo get
     * @param qtdVendida
     */
    String getNome(){
        return this.nome;
        /**
         * uso return para retornar o valor armazenado nela, é imprescindivel que tanto o tipo de dado (String) quanto
         * o return estejam aqui
         */
    }
    Double getEstoque(){
        return this.qtdEstoque;
    }
    /**
     * a criação do getter tem o sentido de obter a descrição, esse metodo eu irei obter (gettar), ele 
     * retornara o valor que eu pedi no meu atributo. vamos imaginar que eu criei um objeto em outra classe e settei ele
     * com o get, eu posso dizer que quero que esse objeto retorne o que está armazenado na memoria deste objeto
     * de acordo com o que eu quiser obter, de acordo com o que eu settei, os parametros, as caracteristicas da classe...
     * ou seja, vamos criar uma analogia: o papai noel tem diversas caixas nomeadas com nome do estado, e uma unica escrito: 'relatorio por estado'
     * em uma dessas caixas nomeadas com nome do estado, suponha, amapá
     * está escrito "bola de futebol, playstation, brinquedos", é nessa caixa que as crianças do estado colocam o que desejam para o papai noel
     * essa caixa não pode ser aberta de formas convencionais, porque ela tem os pedidos de varias pessoas, 
     * entao... vamos supor que a lei geral de proteção de dados não permite que a caixa seja aberta por conter dados sensiveis kkkk
     * o papai noel tem a segunda caixa, nela, ele pode obter o relatorio do que cada estado deseja, e obter uma media de brinquedos
     * que serão confeccionados para cada estado. assim, ele utiliza o touchscreen dessa caixa, e toca em um estado
     * como meu exemplo, o amapá. ele obtem que o amapá tem muitos pedidos de bola de futebol, playstation, brinquedos...
     * e é isso que é o metodo get. em partica, ele fnucionaria: amapa.getBla()
     * bem como, as crianças do amapa utilizariam a sua respectiva caixa assim: amapa.setBla()
     * @param qtdVendida
     */

/**
 * explicação generica do metodo abaixo:
 */


    public void vender(Double qtdVendida) { 
        /** isso é um método. o metodo pode conter ou nao um parametro que define como ele deve se comportar
         * no caso em questão, ele se importa com 'qtdVendida', e o nome é bem intuitivo para dizer o que
         * esse método é capaz de fazer. vale lembrar que logo abaixo eu chamo a caracteristica da classe 
         * 'qtdEstoque'
         * e subtraio ela ao chamar o metodo vender(). Mas de onde virá esse valor do 'qtdEstoque'? 
         * virá de quando a classe for chamada para criar um objeto, utilizando o meu modificador criado acima.
         * Podemos utilizar esse metódo para interagir com o objeto que está utilizando os atributos da classe
         * vale ressaltar, e bem ressaltado que eu nao estou retornando nada no metodo porque ele está definido
         * como VOID. ou seja, sem retorno, ele so tem uma função: subtrair a qtd de estoque com a qtd vendida
         * ao chamarmos esse método, devermos passar 'produto01.vender(5)', por exemplo para então ele ser usado
         * metodo se assemelha a funções da prog estruturada, diga-se de passagem
         */

        qtdEstoque = qtdEstoque - qtdVendida;
    };


    
    void alterarPrecoVC(double novoPrecoCusto){
        /**
         * o que eu fiz aqui? eu criei mais um método que é capaz de alterar o valor de um objeto que chamar ele
         * basicamente, esse metodo chama uma caracteristica da classe (e, obviamente, ele pertence a classe)
         * e com essa caracteristica ele define que ela terá um novo valor ao ser chamada. Ou seja, um valor que
         * ja foi estabelecido em seu objeto, PODE ser alterado ao chamar esse método. o problema é: como podemos fazer 
         * isso funcionar de forma que eu nao tenha que ir no codigo e recompilar ele? eu sei que estou aprendendo
         * os fundamentos...
         * bom, nvm.
         * ao chamar esse metodo eu devo colocar um novo valor nesse preco custo, o que significa que o objeto
         * que utiliza da caracteristica precocusto, com um valor já armazenado, será mudada ao chamar esse método
         * pro objeto.
         * em adição a isso, há mais uma parte do método. ela é aumentar em 50% do novo valor, que volta a se chamar
        */
        precoCusto = novoPrecoCusto; 
        /**
         * aprendi algo novo aqui...
         * aprendi que se eu colocar o novoPreçoCusto, primeiro, ou seja, antes do
         * precoCusto, estou dizendo que ele é igual o anterior precoCusto, nao sofrendo
         * alteração alguma. ou seja, esse metodo so diria que o novoprecocusto tem
         * armazenado o msm valor de precoCusto, um metodo inutil. Experimenta inverter
         * a ordem dos fatores aqui ela infelizmente altera o produto... :( "neste caso"
        */
        precoVenda = precoCusto * 1.50;
        /**
         * as vezes é necessário colocar o metodo junto, sem separá-lo porque as vezes eles tratam da mesma coisa.
         */
    };

}
