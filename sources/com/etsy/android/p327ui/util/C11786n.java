package com.etsy.android.p327ui.util;

import android.app.Application;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.util.n */
public final class C11786n {

    /* renamed from: a */
    public final Application f26257a;

    public C11786n(Application application) {
        C19383o.m32797g(application, "application");
        this.f26257a = application;
    }

    /* renamed from: a */
    public final int mo38057a(int i) {
        return this.f26257a.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public final int mo38058b(String str) {
        C19383o.m32797g(str, "name");
        return this.f26257a.getResources().getIdentifier(str, "drawable", this.f26257a.getPackageName());
    }

    /* renamed from: c */
    public final String mo38059c(int i, Object... objArr) {
        if (objArr.length == 0) {
            String string = this.f26257a.getString(i);
            C19383o.m32796f(string, "{\n            applicatio…ing(resourceId)\n        }");
            return string;
        }
        String string2 = this.f26257a.getString(i, Arrays.copyOf(objArr, objArr.length));
        C19383o.m32796f(string2, "{\n            applicatio…ormatArguments)\n        }");
        return string2;
    }
}
