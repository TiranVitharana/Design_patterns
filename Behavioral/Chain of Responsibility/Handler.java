interface Handler {
    public void setNextHandler(Handler handler);
    public void handleRequest(int request);
}

