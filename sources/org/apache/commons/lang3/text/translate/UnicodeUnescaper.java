package org.apache.commons.lang3.text.translate;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.io.Writer;

public class UnicodeUnescaper extends CharSequenceTranslator {
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 < charSequence.length() && charSequence.charAt(i3) == 'u') {
                i4++;
            }
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 <= charSequence.length()) {
            CharSequence subSequence = charSequence.subSequence(i5, i6);
            try {
                writer.write((char) Integer.parseInt(subSequence.toString(), 16));
                return i4 + 4;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Unable to parse unicode value: " + subSequence, e);
            }
        } else {
            StringBuilder h = C0072d.m201h("Less than 4 hex digits in unicode value: '");
            h.append(charSequence.subSequence(i, charSequence.length()));
            h.append("' due to end of CharSequence");
            throw new IllegalArgumentException(h.toString());
        }
    }
}
