package androidx.compose.p015ui.text.android;

import java.text.CharacterIterator;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.a */
public final class C1917a implements CharacterIterator {

    /* renamed from: b */
    public final CharSequence f4312b;

    /* renamed from: c */
    public final int f4313c = 0;

    /* renamed from: d */
    public final int f4314d;

    /* renamed from: e */
    public int f4315e;

    public C1917a(int i, CharSequence charSequence) {
        this.f4312b = charSequence;
        this.f4314d = i;
        this.f4315e = 0;
    }

    public final Object clone() {
        try {
            Object clone = super.clone();
            C19383o.m32796f(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final char current() {
        int i = this.f4315e;
        if (i == this.f4314d) {
            return 65535;
        }
        return this.f4312b.charAt(i);
    }

    public final char first() {
        this.f4315e = this.f4313c;
        return current();
    }

    public final int getBeginIndex() {
        return this.f4313c;
    }

    public final int getEndIndex() {
        return this.f4314d;
    }

    public final int getIndex() {
        return this.f4315e;
    }

    public final char last() {
        int i = this.f4313c;
        int i2 = this.f4314d;
        if (i == i2) {
            this.f4315e = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.f4315e = i3;
        return this.f4312b.charAt(i3);
    }

    public final char next() {
        int i = this.f4315e + 1;
        this.f4315e = i;
        int i2 = this.f4314d;
        if (i < i2) {
            return this.f4312b.charAt(i);
        }
        this.f4315e = i2;
        return 65535;
    }

    public final char previous() {
        int i = this.f4315e;
        if (i <= this.f4313c) {
            return 65535;
        }
        int i2 = i - 1;
        this.f4315e = i2;
        return this.f4312b.charAt(i2);
    }

    public final char setIndex(int i) {
        int i2 = this.f4313c;
        boolean z = false;
        if (i <= this.f4314d && i2 <= i) {
            z = true;
        }
        if (z) {
            this.f4315e = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
