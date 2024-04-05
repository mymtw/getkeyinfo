package p698vm;

import android.support.p013v4.media.C0072d;
import com.google.firebase.encoders.EncodingException;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: vm.d */
public final /* synthetic */ class C18662d implements C18537d {
    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) {
        C18538e eVar = (C18538e) obj2;
        StringBuilder h = C0072d.m201h("Couldn't find encoder for type ");
        h.append(obj.getClass().getCanonicalName());
        throw new EncodingException(h.toString());
    }
}
