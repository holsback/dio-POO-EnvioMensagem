public record SMS(String mensagem) implements EnvioMarketing {

    public String enviarMensagem() {
        return mensagem;
    }
}
