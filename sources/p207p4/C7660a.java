package p207p4;

import com.bumptech.glide.load.data.C5978j;
import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import java.io.InputStream;
import java.util.ArrayDeque;
import p150j4.C7111d;
import p150j4.C7114e;
import p197o4.C7575f;
import p197o4.C7586m;
import p197o4.C7588n;
import p197o4.C7590o;
import p197o4.C7596r;

/* renamed from: p4.a */
public final class C7660a implements C7588n<C7575f, InputStream> {

    /* renamed from: b */
    public static final C7111d<Integer> f16969b = C7111d.m13779a(Integer.valueOf(ShippingUtilsKt.mediumHeightScreen), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a */
    public final C7586m<C7575f, C7575f> f16970a;

    /* renamed from: p4.a$a */
    public static class C7661a implements C7590o<C7575f, InputStream> {

        /* renamed from: a */
        public final C7586m<C7575f, C7575f> f16971a = new C7586m<>();

        /* renamed from: b */
        public final C7588n<C7575f, InputStream> mo20003b(C7596r rVar) {
            return new C7660a(this.f16971a);
        }
    }

    public C7660a(C7586m<C7575f, C7575f> mVar) {
        this.f16970a = mVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a mo20000a(Object obj, int i, int i2, C7114e eVar) {
        C7575f fVar = (C7575f) obj;
        C7586m<C7575f, C7575f> mVar = this.f16970a;
        if (mVar != null) {
            C7586m.C7587a a = C7586m.C7587a.m14595a(fVar);
            Object a2 = mVar.f16848a.mo14373a(a);
            ArrayDeque arrayDeque = C7586m.C7587a.f16849d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a);
            }
            C7575f fVar2 = (C7575f) a2;
            if (fVar2 == null) {
                C7586m<C7575f, C7575f> mVar2 = this.f16970a;
                mVar2.getClass();
                mVar2.f16848a.mo14376d(C7586m.C7587a.m14595a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new C7588n.C7589a(fVar, new C5978j(fVar, ((Integer) eVar.mo19443c(f16969b)).intValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20001b(Object obj) {
        C7575f fVar = (C7575f) obj;
        return true;
    }
}
