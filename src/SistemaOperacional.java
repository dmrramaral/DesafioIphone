public class SistemaOperacional implements ReprodutorMusica, Ligacao, Navegador {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Mostrar página");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar conversa");
    }

    @Override
    public void ligar(String number) {
        System.out.println("Ligar para numero");


    }

    @Override
    public void atender() {
        System.out.println("Ligacao Atendida");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar Musica");
    }
}
