package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
public final class C14458d implements DynamiteModule.C14452a {
    /* renamed from: a */
    public final DynamiteModule.C14452a.C14454b mo49526a(Context context, String str, DynamiteModule.C14452a.C14453a aVar) throws DynamiteModule.LoadingException {
        int i;
        DynamiteModule.C14452a.C14454b bVar = new DynamiteModule.C14452a.C14454b();
        int b = aVar.mo49528b(context, str);
        bVar.f32587a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo49527a(context, str, false);
            bVar.f32588b = i;
        } else {
            i = aVar.mo49527a(context, str, true);
            bVar.f32588b = i;
        }
        int i3 = bVar.f32587a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f32589c = 0;
            return bVar;
        }
        if (i2 >= i) {
            bVar.f32589c = -1;
        } else {
            bVar.f32589c = 1;
        }
        return bVar;
    }
}
