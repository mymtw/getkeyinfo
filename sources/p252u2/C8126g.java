package p252u2;

import android.content.Context;
import android.text.TextUtils;
import p112g2.C6832b;
import p124h2.C6922b;

/* renamed from: u2.g */
public final class C8126g implements C6832b.C6835c {

    /* renamed from: a */
    public final /* synthetic */ Context f17755a;

    public C8126g(Context context) {
        this.f17755a = context;
    }

    /* renamed from: a */
    public final C6832b mo18970a(C6832b.C6834b bVar) {
        Context context = this.f17755a;
        String str = bVar.f15037b;
        C6832b.C6833a aVar = bVar.f15038c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            return new C6922b(context, str, aVar, true);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
