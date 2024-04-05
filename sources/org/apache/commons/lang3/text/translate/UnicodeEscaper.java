package org.apache.commons.lang3.text.translate;

import android.support.p013v4.media.C0072d;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.Writer;

public class UnicodeEscaper extends CodePointTranslator {
    private final int above;
    private final int below;
    private final boolean between;

    public UnicodeEscaper() {
        this(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
    }

    public static UnicodeEscaper above(int i) {
        return outsideOf(0, i);
    }

    public static UnicodeEscaper below(int i) {
        return outsideOf(i, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static UnicodeEscaper between(int i, int i2) {
        return new UnicodeEscaper(i, i2, true);
    }

    public static UnicodeEscaper outsideOf(int i, int i2) {
        return new UnicodeEscaper(i, i2, false);
    }

    public boolean translate(int i, Writer writer) throws IOException {
        if (this.between) {
            if (i < this.below || i > this.above) {
                return false;
            }
        } else if (i >= this.below && i <= this.above) {
            return false;
        }
        if (i > 65535) {
            StringBuilder h = C0072d.m201h("\\u");
            h.append(CharSequenceTranslator.hex(i));
            writer.write(h.toString());
            return true;
        } else if (i > 4095) {
            StringBuilder h2 = C0072d.m201h("\\u");
            h2.append(CharSequenceTranslator.hex(i));
            writer.write(h2.toString());
            return true;
        } else if (i > 255) {
            StringBuilder h3 = C0072d.m201h("\\u0");
            h3.append(CharSequenceTranslator.hex(i));
            writer.write(h3.toString());
            return true;
        } else if (i > 15) {
            StringBuilder h4 = C0072d.m201h("\\u00");
            h4.append(CharSequenceTranslator.hex(i));
            writer.write(h4.toString());
            return true;
        } else {
            StringBuilder h5 = C0072d.m201h("\\u000");
            h5.append(CharSequenceTranslator.hex(i));
            writer.write(h5.toString());
            return true;
        }
    }

    private UnicodeEscaper(int i, int i2, boolean z) {
        this.below = i;
        this.above = i2;
        this.between = z;
    }
}
