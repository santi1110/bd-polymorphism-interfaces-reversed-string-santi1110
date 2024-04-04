package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {
    private String original;
    @Override
    public char charAt(int index) {
        return original.charAt(original.length() - 1 - index);
        // Implementation for charAt method
    }
    @Override
    public int length() {
        return original.length();
        // Implementation for length method
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        // Create a new ReversedString with the specified substring
        return new ReversedString(original.substring(original.length() - end, original.length() - start));
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
        // Implementation for toString method
    }


    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        this.original = chars;
    }
    public static void main(String[] args) {
        ReversedString reversedString = new ReversedString("cat");
        System.out.println("charAt(0): " + reversedString.charAt(0)); // Should print 't'
        System.out.println("length(): " + reversedString.length()); // Should print 3
        System.out.println("subSequence(0, 2): " + reversedString.subSequence(0, 2)); // Should print "ta"
        System.out.println("toString(): " + reversedString.toString()); // Should print "tac"
    }

}
