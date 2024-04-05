package com.etsy.android.feedback.data;

public enum SortType {
    RECOMMENDED("Relevancy"),
    MOST_RECENT("Recency"),
    HIGHEST_RATED("Highest"),
    LOWEST_RATED("Lowest");
    
    private final String value;

    private SortType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
