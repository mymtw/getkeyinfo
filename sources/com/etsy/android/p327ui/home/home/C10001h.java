package com.etsy.android.p327ui.home.home;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.home.home.C10002i;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.home.h */
public final class C10001h {

    /* renamed from: a */
    public final String f22006a;

    /* renamed from: b */
    public final List<C9998g> f22007b;

    /* renamed from: c */
    public final String f22008c;

    /* renamed from: d */
    public final HomeTab f22009d;

    /* renamed from: e */
    public final boolean f22010e;

    /* renamed from: f */
    public final boolean f22011f;

    /* renamed from: g */
    public final String f22012g;

    /* renamed from: h */
    public final C10002i f22013h;

    /* renamed from: i */
    public final String f22014i;

    public C10001h() {
        this((EmptyList) null, 511);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10001h(EmptyList emptyList, int i) {
        this((String) null, (i & 2) != 0 ? EmptyList.INSTANCE : emptyList, (i & 4) != 0 ? "" : null, (HomeTab) null, false, false, (String) null, (i & 128) != 0 ? C10002i.C10003a.f22015a : null, (String) null);
    }

    /* renamed from: b */
    public static C10001h m18179b(C10001h hVar, String str, ArrayList arrayList, String str2, HomeTab homeTab, boolean z, boolean z2, String str3, C10002i iVar, String str4, int i) {
        C10001h hVar2 = hVar;
        int i2 = i;
        String str5 = (i2 & 1) != 0 ? hVar2.f22006a : str;
        List<C9998g> list = (i2 & 2) != 0 ? hVar2.f22007b : arrayList;
        String str6 = (i2 & 4) != 0 ? hVar2.f22008c : str2;
        HomeTab homeTab2 = (i2 & 8) != 0 ? hVar2.f22009d : homeTab;
        boolean z3 = (i2 & 16) != 0 ? hVar2.f22010e : z;
        boolean z4 = (i2 & 32) != 0 ? hVar2.f22011f : z2;
        String str7 = (i2 & 64) != 0 ? hVar2.f22012g : str3;
        C10002i iVar2 = (i2 & 128) != 0 ? hVar2.f22013h : iVar;
        String str8 = (i2 & 256) != 0 ? hVar2.f22014i : str4;
        hVar.getClass();
        C19383o.m32797g(list, "sideEffects");
        C19383o.m32797g(str6, "trackingName");
        C19383o.m32797g(iVar2, "homeUi");
        return new C10001h(str5, list, str6, homeTab2, z3, z4, str7, iVar2, str8);
    }

    /* renamed from: a */
    public final C10001h mo33234a(C9998g gVar) {
        return m18179b(this, (String) null, C19327t.m32651g1(this.f22007b, gVar), (String) null, (HomeTab) null, false, false, (String) null, (C10002i) null, (String) null, 509);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10001h)) {
            return false;
        }
        C10001h hVar = (C10001h) obj;
        return C19383o.m32792b(this.f22006a, hVar.f22006a) && C19383o.m32792b(this.f22007b, hVar.f22007b) && C19383o.m32792b(this.f22008c, hVar.f22008c) && C19383o.m32792b(this.f22009d, hVar.f22009d) && this.f22010e == hVar.f22010e && this.f22011f == hVar.f22011f && C19383o.m32792b(this.f22012g, hVar.f22012g) && C19383o.m32792b(this.f22013h, hVar.f22013h) && C19383o.m32792b(this.f22014i, hVar.f22014i);
    }

    public final int hashCode() {
        String str = this.f22006a;
        int i = 0;
        int e = C0023f.m105e(this.f22008c, C13983i.m21488g(this.f22007b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        HomeTab homeTab = this.f22009d;
        int hashCode = (e + (homeTab == null ? 0 : homeTab.hashCode())) * 31;
        boolean z = this.f22010e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22011f;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str2 = this.f22012g;
        int hashCode2 = (this.f22013h.hashCode() + ((i3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f22014i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HomeState(firstPageUrl=");
        h.append(this.f22006a);
        h.append(", sideEffects=");
        h.append(this.f22007b);
        h.append(", trackingName=");
        h.append(this.f22008c);
        h.append(", homeTab=");
        h.append(this.f22009d);
        h.append(", isTablet=");
        h.append(this.f22010e);
        h.append(", isExplore=");
        h.append(this.f22011f);
        h.append(", title=");
        h.append(this.f22012g);
        h.append(", homeUi=");
        h.append(this.f22013h);
        h.append(", nextPageUrl=");
        return C0391c.m1057c(h, this.f22014i, ')');
    }

    public C10001h(String str, List<? extends C9998g> list, String str2, HomeTab homeTab, boolean z, boolean z2, String str3, C10002i iVar, String str4) {
        C19383o.m32797g(list, "sideEffects");
        C19383o.m32797g(str2, "trackingName");
        C19383o.m32797g(iVar, "homeUi");
        this.f22006a = str;
        this.f22007b = list;
        this.f22008c = str2;
        this.f22009d = homeTab;
        this.f22010e = z;
        this.f22011f = z2;
        this.f22012g = str3;
        this.f22013h = iVar;
        this.f22014i = str4;
    }
}
