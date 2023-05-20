package ru.job4j.adapter;

public class MyMailTool implements MailInterface {
    private MailTool yourMailTool;

    public MyMailTool() {
        yourMailTool = new MailTool();
        setYourMailTool(yourMailTool);
    }

    @Override
    public int getMail() {
        return getYourMailTool().retrieveMail();
    }

    public MailTool getYourMailTool() {
        return yourMailTool;
    }

    public void setYourMailTool(MailTool yourMailTool) {
        this.yourMailTool = yourMailTool;
    }
}
