public abstract class Message {
    public String recipient;
    public abstract void sendMessage();
//    public abstract final void sendMessage();

    public static void main(String[] args) {
        Message m = new TextMessage();

        m.recipient = "21313421412412";
        m.sendMessage();
    }

    static class TextMessage extends Message {
        @Override
        public void sendMessage() {
            System.out.println("Text Message sent to " + recipient);
        }
    }

}
