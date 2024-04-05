package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.h */
public final class C5858h {

    /* renamed from: b */
    public static final Charset f12544b = Charset.forName("UTF-8");

    /* renamed from: a */
    public byte[] f12545a = new byte[RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.h$a */
    public interface C5859a<T> {
    }

    public final String toString() {
        return new String(this.f12545a, 0, 0, f12544b);
    }
}
