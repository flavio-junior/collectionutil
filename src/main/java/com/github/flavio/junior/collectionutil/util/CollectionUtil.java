package com.github.flavio.junior.collectionutil.util;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CollectionUtil {

    public CollectionUtil() {}

    public static boolean removeElement(Collection<String> collection, Predicate<String> filter) {
       return collection.removeIf(filter);
    }

    public static boolean collectionIsEmpty(Collection<?> collection) {
        return collection.isEmpty();
    }

    public static boolean collectionIsNotEmpty(Collection<?> collection) {
        return !collection.isEmpty();
    }

    public static int getSizeCollection(Collection<?> collection) {
        return collection.size();
    }

    public static Collection<Integer> mapToInteger(Collection<String> collection) {
        return collection.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}