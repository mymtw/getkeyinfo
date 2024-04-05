package p687uj;

import com.google.firebase.encoders.EncodingException;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: uj.o */
public final /* synthetic */ class C18599o implements C18537d {

    /* renamed from: a */
    public static final /* synthetic */ C18599o f41076a = new C18599o();

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) {
        C18538e eVar = (C18538e) obj2;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new EncodingException(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
