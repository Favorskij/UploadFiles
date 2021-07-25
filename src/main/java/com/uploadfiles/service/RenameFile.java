package com.uploadfiles.service;

import java.security.SecureRandom;
import java.util.Random;

public class RenameFile {


    public static final String lower = "abcdefghijklmnopqrstuvwxyz";

    public static final String digits = "0123456789";

    public static final String alphanum = lower + digits;

    private final Random random;

    private final char[] symbols;

    private final char[] buf;


    public RenameFile() {

        this.random = new SecureRandom();
        this.symbols = alphanum.toCharArray();
        this.buf = new char[21];

    }



    public String nextString() {

        for (int x = 0; x < buf.length; ++x)

            buf[x] = symbols[random.nextInt(symbols.length)];

        return new String(buf);

    }











//    /**
//     * Generate a random string.
//     */
//    public String nextString() {
//        for (int idx = 0; idx < buf.length; ++idx)
//            buf[idx] = symbols[random.nextInt(symbols.length)];
//        return new String(buf);
//    }
//
//    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//
//    public static final String lower = upper.toLowerCase(Locale.ROOT);
//
//    public static final String digits = "0123456789";
//
//    public static final String alphanum = upper + lower + digits;
//
//    private final Random random;
//
//    private final char[] symbols;
//
//    private final char[] buf;
//
//    public RandomFileName(int length, Random random, String symbols) {
//        if (length < 1) throw new IllegalArgumentException();
//        if (symbols.length() < 2) throw new IllegalArgumentException();
//        this.random = Objects.requireNonNull(random);
//        this.symbols = symbols.toCharArray();
//        this.buf = new char[length];
//    }
//
//    /**
//     * Create an alphanumeric string generator.
//     */
//    public RandomFileName(int length, Random random) {
//        this(length, random, alphanum);
//    }
//
//    /**
//     * Create an alphanumeric strings from a secure generator.
//     */
//    public RandomFileName(int length) {
//        this(length, new SecureRandom());
//    }
//
//    /**
//     * Create session identifiers.
//     */
//    public RandomFileName() {
//        this(21);
//    }


}
