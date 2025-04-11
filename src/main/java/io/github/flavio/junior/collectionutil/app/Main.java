package io.github.flavio.junior.collectionutil.app;

import io.github.flavio.junior.collectionutil.util.*;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        mapToInteger();
    }

    private static void removeElements() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "PHP"));
        CollectionUtil.removeElement(words, Predicate.isEqual(words.get(1)));
        System.out.println(words);
        Predicate<String> filter = e -> e.startsWith("J");
        CollectionUtil.removeElement(words, filter);
        System.out.println(words);
    }

    private static void collectionIsEmpty() {
        List<String> wordsNotEmpty = new ArrayList<>(Arrays.asList("Java", "PHP"));
        System.out.println(CollectionUtil.collectionIsEmpty(wordsNotEmpty));

        List<String> wordsEmpty = new ArrayList<>(Arrays.asList());
        System.out.println(CollectionUtil.collectionIsEmpty(wordsEmpty));
    }

    private static void collectionIsNotEmpty() {
        List<String> wordsNotEmpty = new ArrayList<>(Arrays.asList("Java", "PHP"));
        System.out.println(CollectionUtil.collectionIsNotEmpty(wordsNotEmpty));

        List<String> wordsEmpty = new ArrayList<>(Arrays.asList());
        System.out.println(CollectionUtil.collectionIsNotEmpty(wordsEmpty));
    }

    private static void getSizeCollection() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "PHP"));
        System.out.println(CollectionUtil.getSizeCollection(words));
    }

    private static void mapToInteger() {
        List<String> numbersString = new ArrayList<>(Arrays.asList("23", "45"));
        try {
            Collection<Integer> numbers = CollectionUtil.mapToInteger(numbersString);
            System.out.println(numbers);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao mapear valores!");
        }

    }
}
