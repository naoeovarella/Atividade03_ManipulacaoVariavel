import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        // Criação de Variáveis
        String nomeProduto = "Notebook";
        double precoUnitario = 2500.00;
        int quantidadeComprada = 3;
        double taxaImposto = 0.15; // 15%
        double margemLucro = 0.20; // 20%

        // Operações Simples
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        double precoVendaSugerido = valorTotalComImpostos * (1 + margemLucro);

        // Arredondando e formatando os valores
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = df.format(valorTotalComImpostos);
        String precoVendaSugeridoFormatado = df.format(precoVendaSugerido);

        // Mensagem final
        String mensagemFinal = "Produto: " + nomeProduto + "\n" +
                "Valor total com impostos: " + valorTotalComImpostosFormatado + "\n" +
                "Preço de venda sugerido: " + precoVendaSugeridoFormatado;

        // Exibição de Resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Taxa de Imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de Lucro: " + (margemLucro * 100) + "%");
        System.out.println("Valor Total Sem Impostos: R$ " + valorTotalSemImpostos);
        System.out.println("Valor do Imposto: R$ " + valorImposto);
        System.out.println("Valor Total Com Impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de Venda Sugerido: " + precoVendaSugeridoFormatado);
        System.out.println();
        System.out.println(mensagemFinal);
    }
}