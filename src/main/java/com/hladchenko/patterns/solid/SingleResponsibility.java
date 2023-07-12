package com.hladchenko.patterns.solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SingleResponsibility {

    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();

        journal.addEntry("The first one");
        journal.addEntry("I love my mom");

        System.out.println(journal);

        Persistence p = new Persistence();
        String filename = "text.txt";
        p.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }

    static class Journal {
        private final List<String> entries = new ArrayList<>();
        private int count = 0;

        public void addEntry(String text) {
            entries.add("" + (++count) + ": " + text);
        }

        public void removeEntry(int index) {
            entries.remove(index);
        }

        @Override
        public String toString() {
            return String.join(System.lineSeparator(), entries);
        }

        /**
         * Violation of a single responsibility principle.
         */
        public void save(String filename) throws FileNotFoundException {
            try (PrintStream printStream = new PrintStream(filename)) {
                printStream.println(toString());
            }
        }

        public void load(String filename) {
        }

        public void load(URL url) {
        }
    }

    /**
     * This is how to solve this problem. We create a new class for saving and loading files.
     */
    static class Persistence {
        public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
            if (overwrite || new File(filename).exists()) {
                try (PrintStream printStream = new PrintStream(filename)) {
                    printStream.println(journal.toString());
                }
            }
        }

        public void load(String filename) {
        }

        public void load(URL url) {
        }
    }
}
