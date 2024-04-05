package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.s */
public final class C0346s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextView f899b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f900c;

    /* renamed from: d */
    public final /* synthetic */ int f901d;

    public C0346s(TextView textView, Typeface typeface, int i) {
        this.f899b = textView;
        this.f900c = typeface;
        this.f901d = i;
    }

    public final void run() {
        this.f899b.setTypeface(this.f900c, this.f901d);
    }
}
