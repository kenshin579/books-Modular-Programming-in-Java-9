package app;

import pattern.two.external.PublicInterface;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        Iterable<PublicInterface> impls = ServiceLoader.load(PublicInterface.class);
        for (PublicInterface i : impls) {
            i.publicApi();
        }
    }
}