public record RedesSociais(String mensagem) implements EnvioMarketing {

    public String enviarMensagem() {
        return mensagem;
    }
}
