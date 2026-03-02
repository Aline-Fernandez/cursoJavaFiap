public class StringFrase {
        public static void main(String[] args) {

            String frase;

            {
                frase = "Aprendei o conceito sobre escopo de variáveis em Java: ";
                {
                    String fraseInterna = "Os blocos mais internos conseguem enxergar as variáveis declaradas no mesmo bloco ou nos blocos mais externos";
                    frase = frase + fraseInterna;
                    {
                        fraseInterna = ", portanto não podemos declaarar outra variável com o mesmo nome no mesmo bloco ou nos blocos mais internos. ";
                        frase = frase + fraseInterna;
                    }
                }
                String fraseInterna = "Entretanto podemos declarar variáveis com o mesmo nome em outros blocos ou em blocos mas externos";
                frase = frase + fraseInterna + "Agora já posso trabalhar conhecendo melhor o escopo das variáveis em Java";
            }

            System.out.println(frase);
        }
    }
