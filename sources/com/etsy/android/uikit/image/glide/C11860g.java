package com.etsy.android.uikit.image.glide;

import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import p150j4.C7109b;

/* renamed from: com.etsy.android.uikit.image.glide.g */
public final class C11860g implements C7109b {

    /* renamed from: b */
    public final String f26383b;

    /* renamed from: c */
    public final WeakReference<ImageView> f26384c;

    public C11860g(String str, ImageView imageView) {
        this.f26383b = str;
        this.f26384c = new WeakReference<>(imageView);
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        C19383o.m32797g(messageDigest, "messageDigest");
        byte[] bytes = this.f26383b.getBytes(C19446a.f43373b);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11860g) {
            return this.f26383b.equals(((C11860g) obj).f26383b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26383b.hashCode() * 31;
    }
}
