package com.etsy.android.uikit.util;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.util.C8890e0;
import kotlin.C19285c;
import kotlin.C19350d;
import p346fa.C12703a;

public final class OnClickDebouncerFactory {

    /* renamed from: f */
    public static OnClickDebouncerFactory f26450f;

    /* renamed from: a */
    public final C12703a f26451a;

    /* renamed from: b */
    public final C8618c f26452b;

    /* renamed from: c */
    public final C8890e0 f26453c;

    /* renamed from: d */
    public final C19285c f26454d = C19350d.m32677b(new OnClickDebouncerFactory$enableDebouncing$2(this));

    /* renamed from: e */
    public final C19285c f26455e = C19350d.m32677b(new OnClickDebouncerFactory$debounceThresholdMillis$2(this));

    public OnClickDebouncerFactory(C12703a aVar, C8618c cVar, C8890e0 e0Var) {
        this.f26451a = aVar;
        this.f26452b = cVar;
        this.f26453c = e0Var;
    }

    /* renamed from: a */
    public final C11907k mo38457a() {
        return new C11907k(this.f26451a, this.f26453c, ((Boolean) this.f26454d.getValue()).booleanValue(), ((Number) this.f26455e.getValue()).longValue());
    }
}
