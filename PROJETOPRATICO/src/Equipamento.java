abstract class Equipamento {

        private String codigoPatrimonio;
        private String descricao;
        private double valor;
        private int anoAquisicao;
        private StatusManutencao statusManutencao;

        abstract void atualizarStatus(StatusManutencao status);

        abstract double CalcularDepreciacaoAnual();

        abstract String getCategoria();

        public void valorAtual() {

        }
}

