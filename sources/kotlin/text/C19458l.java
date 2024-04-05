package kotlin.text;

import kotlin.collections.C19321n;

/* renamed from: kotlin.text.l */
public final class C19458l extends C19321n {

    /* renamed from: b */
    public int f43390b;

    /* renamed from: c */
    public final /* synthetic */ CharSequence f43391c;

    public C19458l(CharSequence charSequence) {
        this.f43391c = charSequence;
    }

    /* renamed from: a */
    public final char mo71769a() {
        CharSequence charSequence = this.f43391c;
        int i = this.f43390b;
        this.f43390b = i + 1;
        return charSequence.charAt(i);
    }

    public final boolean hasNext() {
        return this.f43390b < this.f43391c.length();
    }
}
