package com.golovkin;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        printCommitInformation();
        printModuleInformation();

        int number = 10;
        boolean isOdd = ModChecker.IsOdd(number);
        System.out.println("Hello World!");
        System.out.printf("Is %d odd: %s\n", number, isOdd);
    }

    private static void printModuleInformation() throws IOException {
        Properties appProps = getProperties("maven");
        System.out.println("Информация о текущем модуле:");
        System.out.printf("groupId: %s\n", appProps.getProperty("mvn.groupId"));
        System.out.printf("artifactId: %s\n", appProps.getProperty("mvn.artifactId"));
        System.out.printf("version: %s\n", appProps.getProperty("mvn.version"));
        System.out.println("---");
    }

    private static void printCommitInformation() throws IOException {
        Properties appProps = getProperties("git");
        System.out.println("Информация о текущем коммите:");
        System.out.printf("ID: %s\n", appProps.getProperty("git.commit.id.full"));
        System.out.printf("Сообщение: %s\n", appProps.getProperty("git.commit.message.short"));
        System.out.println("---");
    }

    private static Properties getProperties(String name) throws IOException {
        String propertiesPath = String.format("/%s.properties", name);
        InputStream stream = HelloWorld.class.getResourceAsStream(propertiesPath);

        Properties properties = new Properties();
        properties.load(stream);

        return properties;
    }
}
