package com.airbnb.lottie.network;

import android.support.p013v4.media.C0072d;
import p206p3.C7656b;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public static FileExtension forFile(String str) {
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        C7656b.m14695b("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        StringBuilder h = C0072d.m201h(".temp");
        h.append(this.extension);
        return h.toString();
    }

    public String toString() {
        return this.extension;
    }
}
