package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15697i;
import com.google.android.play.core.internal.C15710v;
import p001a0.C0005b;

@SuppressLint({"RestrictedApi"})
/* renamed from: com.google.android.play.core.review.f */
public final class C15739f {

    /* renamed from: c */
    public static final C15032m3 f35524c = new C15032m3("ReviewService");

    /* renamed from: a */
    public C15697i f35525a;

    /* renamed from: b */
    public final String f35526b;

    public C15739f(Context context) {
        this.f35526b = context.getPackageName();
        if (C15710v.m25542b(context)) {
            Context context2 = context;
            this.f35525a = new C15697i(context2, f35524c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C0005b.f10h);
        }
    }
}
