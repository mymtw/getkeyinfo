package p137i3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.animation.C0391c;
import com.airbnb.lottie.C4827b;
import com.airbnb.lottie.C4837h;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.HashMap;
import java.util.Map;
import p206p3.C7656b;

/* renamed from: i3.b */
public final class C6986b {

    /* renamed from: d */
    public static final Object f15480d = new Object();

    /* renamed from: a */
    public final Context f15481a;

    /* renamed from: b */
    public String f15482b;

    /* renamed from: c */
    public final Map<String, C4837h> f15483c;

    public C6986b(Drawable.Callback callback, String str, C4827b bVar, Map<String, C4837h> map) {
        this.f15482b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f15482b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f15482b = C0391c.m1057c(new StringBuilder(), this.f15482b, JsonPointer.SEPARATOR);
            }
        }
        if (!(callback instanceof View)) {
            C7656b.m14695b("LottieDrawable must be inside of a view for images to work.");
            this.f15483c = new HashMap();
            this.f15481a = null;
            return;
        }
        this.f15481a = ((View) callback).getContext();
        this.f15483c = map;
    }

    /* renamed from: a */
    public final void mo19154a(String str, Bitmap bitmap) {
        synchronized (f15480d) {
            this.f15483c.get(str).f10872d = bitmap;
        }
    }
}
