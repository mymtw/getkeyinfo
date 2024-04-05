package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
public final class C14456b implements DynamiteModule.C14452a {
    /* renamed from: a */
    public final DynamiteModule.C14452a.C14454b mo49526a(Context context, String str, DynamiteModule.C14452a.C14453a aVar) throws DynamiteModule.LoadingException {
        DynamiteModule.C14452a.C14454b bVar = new DynamiteModule.C14452a.C14454b();
        int a = aVar.mo49527a(context, str, true);
        bVar.f32588b = a;
        if (a != 0) {
            bVar.f32589c = 1;
        } else {
            int b = aVar.mo49528b(context, str);
            bVar.f32587a = b;
            if (b != 0) {
                bVar.f32589c = -1;
            }
        }
        return bVar;
    }
}
