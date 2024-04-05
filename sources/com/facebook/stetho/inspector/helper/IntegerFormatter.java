package com.facebook.stetho.inspector.helper;

import android.annotation.TargetApi;
import android.support.p013v4.media.C0072d;
import android.view.ViewDebug;

public class IntegerFormatter {
    private static IntegerFormatter cachedFormatter;

    public static class IntegerFormatterWithHex extends IntegerFormatter {
        private IntegerFormatterWithHex() {
            super();
        }

        @TargetApi(21)
        public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
            if (exportedProperty == null || !exportedProperty.formatToHexString()) {
                return IntegerFormatter.super.format(num, exportedProperty);
            }
            StringBuilder h = C0072d.m201h("0x");
            h.append(Integer.toHexString(num.intValue()));
            return h.toString();
        }
    }

    public static IntegerFormatter getInstance() {
        if (cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                if (cachedFormatter == null) {
                    cachedFormatter = new IntegerFormatterWithHex();
                }
            }
        }
        return cachedFormatter;
    }

    public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
        return String.valueOf(num);
    }

    private IntegerFormatter() {
    }
}
