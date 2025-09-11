package test;

import loggingutils.Logger;

public class Main {
    public static void main(String[] args) {
        Logger l = new Logger();
        l.logError("aaaa");
        l.logInfo("bbbb");
        l.logWarning("cuidado");
    }
}