import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public String musicaVez;
    public static void main(String[] args) {
        Iphone iphoneBotao= new Iphone();
        iphoneBotao.ligar("87909090");
        iphoneBotao.selecionarMusica();
        iphoneBotao.tocar();
        iphoneBotao.pausar();
        iphoneBotao.atender();


    }
    public void setMusicaVez(String musicaVez) {
        this.musicaVez = musicaVez;
    }
    public String getMusicaVez() {
        return musicaVez;
    }
    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void atender() {
        Scanner aceitar= new Scanner(System.in);
        System.out.println("recebendo ligacao- atender?");
        System.out.println("1-sim ou 2-não");
        int escolha= aceitar.nextInt();
        if (escolha == 1){
            System.out.println("atendi porra, fala logo");
        }else {
            System.out.println("chamada recusada");
        }

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("correio de voz iniciado");
    }

    @Override
    public void exibirPage(String url) {
        System.out.println("indo para o site contido em:" + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("nova aba criada no navegador!");
    }

    @Override
    public void atualizarPage() {
        System.out.println("recarregando pagina...");
    }

    @Override
    public void tocar() {
        String stage= getMusicaVez();
        System.out.println("reproduzindo agora - "+stage);

    }

    @Override
    public void pausar() {
        System.out.println("musica atual pausada.");
    }

    @Override
    public void selecionarMusica() {
        Scanner busca= new Scanner(System.in);
        System.out.println("bem vindo a sua playlist");
        String escolha= busca.nextLine();
        setMusicaVez(escolha);

    }
}
