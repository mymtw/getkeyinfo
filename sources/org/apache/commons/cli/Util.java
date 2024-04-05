package org.apache.commons.cli;

class Util {
    public static String stripLeadingAndTrailingQuotes(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1, str.length());
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public static String stripLeadingHyphens(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX) ? str.substring(2, str.length()) : str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX) ? str.substring(1, str.length()) : str;
    }
}
