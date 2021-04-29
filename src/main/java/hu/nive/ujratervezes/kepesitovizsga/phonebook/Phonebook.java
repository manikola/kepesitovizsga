package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output){

        if( contacts == null || output == null || output.equals("")){
            throw new IllegalArgumentException("Empty contacts");
        }

        Path path = Path.of(output);

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String name : contacts.keySet()) {
                String phoneNumber = contacts.get(name);
                writer.write(name + ": " + phoneNumber);
                writer.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }

        }
    }

