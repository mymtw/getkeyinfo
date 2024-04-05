package com.google.ads.conversiontracking;

import android.content.SharedPreferences;
import com.google.ads.conversiontracking.C12619g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.conversiontracking.b */
public final class C12616b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f27830b;

    /* renamed from: c */
    public final /* synthetic */ List f27831c;

    /* renamed from: d */
    public final /* synthetic */ C12619g.C12621b f27832d;

    /* renamed from: e */
    public final /* synthetic */ String f27833e;

    public C12616b(SharedPreferences sharedPreferences, ArrayList arrayList, C12619g.C12621b bVar, String str) {
        this.f27830b = sharedPreferences;
        this.f27831c = arrayList;
        this.f27832d = bVar;
        this.f27833e = str;
    }

    public final void run() {
        SharedPreferences.Editor edit = this.f27830b.edit();
        for (String remove : this.f27831c) {
            edit.remove(remove);
        }
        edit.putString(this.f27832d.f27840a, this.f27833e);
        edit.commit();
    }
}
