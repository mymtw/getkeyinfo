package com.etsy.android.p327ui.conversation.details.models;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.ImageSourceDatabaseModel */
public final class ImageSourceDatabaseModel {

    /* renamed from: a */
    public final int f21183a;

    /* renamed from: b */
    public final int f21184b;

    /* renamed from: c */
    public final String f21185c;

    public ImageSourceDatabaseModel(@C17402n(name = "height") int i, @C17402n(name = "width") int i2, @C17402n(name = "url") String str) {
        C19383o.m32797g(str, "url");
        this.f21183a = i;
        this.f21184b = i2;
        this.f21185c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageSourceDatabaseModel(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, str);
    }
}
