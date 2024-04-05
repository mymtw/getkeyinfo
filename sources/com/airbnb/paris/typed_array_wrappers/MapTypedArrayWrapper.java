package com.airbnb.paris.typed_array_wrappers;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p221r3.C7739a;
import p221r3.C7740b;
import p221r3.C7741c;
import p221r3.C7742d;
import p242t3.C7951b;
import p242t3.C7952c;
import p242t3.C7956f;
import p280x0.C8292f;
import p753kq.C19857l;

public final class MapTypedArrayWrapper extends C4870c {

    /* renamed from: b */
    public final Resources f11062b;

    /* renamed from: c */
    public final Resources.Theme f11063c;

    /* renamed from: d */
    public final C19285c f11064d = C19350d.m32677b(new MapTypedArrayWrapper$styleableAttrIndexes$2(this));

    /* renamed from: e */
    public final Context f11065e;

    /* renamed from: f */
    public final int[] f11066f;

    /* renamed from: g */
    public final Map<Integer, Object> f11067g;

    public MapTypedArrayWrapper(Context context, int[] iArr, Map<Integer, ? extends Object> map) {
        C19383o.m32798h(map, "attrResToValueMap");
        this.f11065e = context;
        this.f11066f = iArr;
        this.f11067g = map;
        this.f11062b = context.getResources();
        this.f11063c = context.getTheme();
    }

    /* renamed from: a */
    public final boolean mo14758a(int i) {
        return ((Boolean) mo14773q(i, new MapTypedArrayWrapper$getBoolean$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE)).booleanValue();
    }

    /* renamed from: b */
    public final ColorStateList mo14759b(int i) {
        return (ColorStateList) mo14773q(i, new MapTypedArrayWrapper$getColorStateList$1(this), MapTypedArrayWrapper$getColorStateList$2.INSTANCE);
    }

    /* renamed from: c */
    public final int mo14760c(int i) {
        return ((Number) mo14773q(i, new MapTypedArrayWrapper$getDimensionPixelSize$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE)).intValue();
    }

    /* renamed from: d */
    public final Drawable mo14761d(int i) {
        return (Drawable) mo14773q(i, new MapTypedArrayWrapper$getDrawable$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE);
    }

    /* renamed from: e */
    public final float mo14762e(int i) {
        return ((Number) mo14773q(i, new MapTypedArrayWrapper$getFloat$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE)).floatValue();
    }

    /* renamed from: f */
    public final Typeface mo14763f() {
        Object obj = this.f11067g.get(Integer.valueOf(this.f11066f[24]));
        if (obj instanceof String) {
            return Typeface.create((String) obj, 0);
        }
        if (!(obj instanceof C7741c)) {
            return (Typeface) obj;
        }
        C7741c cVar = (C7741c) obj;
        if (C4870c.m10570o(cVar.f17166a)) {
            return null;
        }
        Context context = this.f11065e;
        int i = cVar.f17166a;
        C19383o.m32798h(context, "$this$getFont");
        return C8292f.m16582a(context, i);
    }

    /* renamed from: g */
    public final int mo14764g(int i) {
        return ((Number) ((List) this.f11064d.getValue()).get(i)).intValue();
    }

    /* renamed from: h */
    public final int mo14765h() {
        return ((List) this.f11064d.getValue()).size();
    }

    /* renamed from: i */
    public final int mo14766i(int i) {
        return ((Number) mo14773q(i, new MapTypedArrayWrapper$getInt$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE)).intValue();
    }

    /* renamed from: j */
    public final int mo14767j(int i) {
        return ((Number) mo14773q(i, new MapTypedArrayWrapper$getLayoutDimension$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE)).intValue();
    }

    /* renamed from: k */
    public final int mo14768k(int i) {
        int intValue = ((Number) mo14773q(i, MapTypedArrayWrapper$getResourceId$resId$1.INSTANCE, MapTypedArrayWrapper$getValue$1.INSTANCE)).intValue();
        if (C4870c.m10570o(intValue)) {
            return 0;
        }
        return intValue;
    }

    /* renamed from: l */
    public final String mo14769l(int i) {
        return (String) mo14773q(i, new MapTypedArrayWrapper$getString$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE);
    }

    /* renamed from: m */
    public final CharSequence mo14770m(int i) {
        return (CharSequence) mo14773q(i, new MapTypedArrayWrapper$getText$1(this), MapTypedArrayWrapper$getValue$1.INSTANCE);
    }

    /* renamed from: n */
    public final boolean mo14771n(int i) {
        return this.f11067g.containsKey(Integer.valueOf(this.f11066f[i]));
    }

    /* renamed from: p */
    public final void mo14772p() {
    }

    /* renamed from: q */
    public final <T> T mo14773q(int i, C19857l<? super Integer, ? extends T> lVar, C19857l<? super C7739a, ? extends T> lVar2) {
        T t = this.f11067g.get(Integer.valueOf(this.f11066f[i]));
        if (t instanceof C7739a) {
            return lVar2.invoke(t);
        }
        if (t instanceof C7740b) {
            Resources resources = this.f11062b;
            C19383o.m32793c(resources, "resources");
            return Integer.valueOf((int) TypedValue.applyDimension(1, (float) ((C7740b) t).f17165a, resources.getDisplayMetrics()));
        } else if (t instanceof C7741c) {
            return lVar.invoke(Integer.valueOf(((C7741c) t).f17166a));
        } else {
            if (!(t instanceof C7742d)) {
                return t;
            }
            List<C7956f> list = ((C7742d) t).f17167a;
            C19383o.m32798h(list, ResponseConstants.STYLES);
            int size = list.size();
            return size != 0 ? size != 1 ? new C7952c("a_MapTypedArrayWrapper_MultiStyle", list) : (C7956f) C19327t.m32638T0(list) : C7951b.f17420a;
        }
    }
}
