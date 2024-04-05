package com.etsy.android.p327ui.user.review;

import android.content.Context;
import androidx.activity.result.C0120c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;

/* renamed from: com.etsy.android.ui.user.review.u */
public final class C11750u {

    /* renamed from: a */
    public final Context f26187a;

    public C11750u(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f26187a = context;
    }

    /* renamed from: a */
    public static boolean m19448a(Map map) {
        C19383o.m32797g(map, "permissions");
        for (Map.Entry value : map.entrySet()) {
            if (!((Boolean) value.getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo37993b(List<String> list, C0120c<String[]> cVar) {
        C19383o.m32797g(list, "permissions");
        C19383o.m32797g(cVar, "requestPermissionsLauncher");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C8184a.m16458a(this.f26187a, str) != 0) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        cVar.mo1157b(array);
    }
}
