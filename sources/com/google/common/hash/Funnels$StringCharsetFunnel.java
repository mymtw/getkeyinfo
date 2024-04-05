package com.google.common.hash;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class Funnels$StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
    private final Charset charset;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String charsetCanonicalName;

        public SerializedForm(Charset charset) {
            this.charsetCanonicalName = charset.name();
        }

        private Object readResolve() {
            return new Funnels$StringCharsetFunnel(Charset.forName(this.charsetCanonicalName));
        }
    }

    public Funnels$StringCharsetFunnel(Charset charset2) {
        charset2.getClass();
        this.charset = charset2;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Funnels$StringCharsetFunnel) {
            return this.charset.equals(((Funnels$StringCharsetFunnel) obj).charset);
        }
        return false;
    }

    public int hashCode() {
        return Funnels$StringCharsetFunnel.class.hashCode() ^ this.charset.hashCode();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Funnels.stringFunnel(");
        h.append(this.charset.name());
        h.append(")");
        return h.toString();
    }

    public Object writeReplace() {
        return new SerializedForm(this.charset);
    }

    public void funnel(CharSequence charSequence, C16276j jVar) {
        jVar.mo57872d(charSequence, this.charset);
    }
}
