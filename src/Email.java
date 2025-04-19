public record Email(String mensagem) implements EnvioMarketing {

    public String enviarMensagem() {
        return mensagem;
    }
}
