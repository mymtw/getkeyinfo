package p517bn;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import kotlin.jvm.internal.C19388s;
import p605kk.C18116a;
import p605kk.C18123g;

/* renamed from: bn.e */
public final /* synthetic */ class C14110e implements C18116a {

    /* renamed from: b */
    public /* synthetic */ Context f31082b;

    /* renamed from: c */
    public /* synthetic */ Intent f31083c;

    public /* synthetic */ C14110e(Context context, Intent intent) {
        this.f31082b = context;
        this.f31083c = intent;
    }

    public final Object then(C18123g gVar) {
        return (!PlatformVersion.isAtLeastO() || ((Integer) gVar.mo69664k()).intValue() != 402) ? gVar : C14118i.m21855a(this.f31082b, this.f31083c).mo69660g(C14117h.f31102b, C19388s.f43275f);
    }
}
