package com.airbnb.paris.typed_array_wrappers;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.List;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

public final class MultiTypedArrayWrapper extends C4870c {

    /* renamed from: e */
    public static final /* synthetic */ int f11068e = 0;

    /* renamed from: b */
    public final C19285c f11069b = C19350d.m32677b(new MultiTypedArrayWrapper$styleableAttrIndexes$2(this));

    /* renamed from: c */
    public final C19285c f11070c = C19350d.m32677b(new MultiTypedArrayWrapper$styleableAttrIndexToWrapperMap$2(this));

    /* renamed from: d */
    public final List<C4870c> f11071d;

    public MultiTypedArrayWrapper(List<? extends C4870c> list, int[] iArr) {
        C19383o.m32798h(list, "wrappers");
        this.f11071d = list;
    }

    /* renamed from: a */
    public final boolean mo14758a(int i) {
        return mo14790q(i).mo14758a(i);
    }

    /* renamed from: b */
    public final ColorStateList mo14759b(int i) {
        return mo14790q(i).mo14759b(i);
    }

    /* renamed from: c */
    public final int mo14760c(int i) {
        return mo14790q(i).mo14760c(i);
    }

    /* renamed from: d */
    public final Drawable mo14761d(int i) {
        return mo14790q(i).mo14761d(i);
    }

    /* renamed from: e */
    public final float mo14762e(int i) {
        return mo14790q(i).mo14762e(i);
    }

    /* renamed from: f */
    public final Typeface mo14763f() {
        return mo14790q(24).mo14763f();
    }

    /* renamed from: g */
    public final int mo14764g(int i) {
        Object obj = ((List) this.f11069b.getValue()).get(i);
        C19383o.m32793c(obj, "styleableAttrIndexes[at]");
        return ((Number) obj).intValue();
    }

    /* renamed from: h */
    public final int mo14765h() {
        return ((HashMap) this.f11070c.getValue()).size();
    }

    /* renamed from: i */
    public final int mo14766i(int i) {
        return mo14790q(i).mo14766i(i);
    }

    /* renamed from: j */
    public final int mo14767j(int i) {
        return mo14790q(i).mo14767j(i);
    }

    /* renamed from: k */
    public final int mo14768k(int i) {
        return mo14790q(i).mo14768k(i);
    }

    /* renamed from: l */
    public final String mo14769l(int i) {
        return mo14790q(i).mo14769l(i);
    }

    /* renamed from: m */
    public final CharSequence mo14770m(int i) {
        return mo14790q(i).mo14770m(i);
    }

    /* renamed from: n */
    public final boolean mo14771n(int i) {
        return ((HashMap) this.f11070c.getValue()).get(Integer.valueOf(i)) != null;
    }

    /* renamed from: p */
    public final void mo14772p() {
        for (C4870c p : this.f11071d) {
            p.mo14772p();
        }
    }

    /* renamed from: q */
    public final C4870c mo14790q(int i) {
        Object obj = ((HashMap) this.f11070c.getValue()).get(Integer.valueOf(i));
        if (obj != null) {
            return (C4870c) C19327t.m32645a1((List) obj);
        }
        C19383o.m32803m();
        throw null;
    }
}
