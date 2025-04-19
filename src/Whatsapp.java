public record Whatsapp(String mensagem) implements EnvioMarketing {

    public String enviarMensagem() {
        return mensagem;
    }
}
