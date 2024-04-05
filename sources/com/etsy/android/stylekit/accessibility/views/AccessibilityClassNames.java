package com.etsy.android.stylekit.accessibility.views;

import android.widget.Button;
import android.widget.TextView;

public enum AccessibilityClassNames {
    TEXT_VIEW(TextView.class.getName()),
    BUTTON(Button.class.getName());
    
    private final CharSequence accessibilityClassName;

    private AccessibilityClassNames(CharSequence charSequence) {
        this.accessibilityClassName = charSequence;
    }

    public final CharSequence getAccessibilityClassName() {
        return this.accessibilityClassName;
    }
}
