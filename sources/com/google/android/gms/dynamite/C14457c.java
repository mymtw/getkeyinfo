package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.c */
public final class C14457c implements DynamiteModule.C14452a {
    /* renamed from: a */
    public final DynamiteModule.C14452a.C14454b mo49526a(Context context, String str, DynamiteModule.C14452a.C14453a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.C14452a.C14454b bVar = new DynamiteModule.C14452a.C14454b();
        bVar.f32587a = aVar.mo49528b(context, str);
        int a = aVar.mo49527a(context, str, true);
        bVar.f32588b = a;
        int i = bVar.f32587a;
        if (i == 0) {
            if (a == 0) {
                bVar.f32589c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.f32589c = -1;
        } else {
            bVar.f32589c = 1;
        }
        return bVar;
    }
}
