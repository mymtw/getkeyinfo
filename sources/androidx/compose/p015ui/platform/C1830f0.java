package androidx.compose.p015ui.platform;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.os.Parcel;
import android.support.p013v4.media.C0072d;
import android.util.Base64;
import android.view.View;
import androidx.activity.C0114h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.SingleListingCheckout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p002a1.C0009c;
import p113g3.C6859r;
import p174m0.C7292j;
import p174m0.C7293k;
import p206p3.C7659e;

/* renamed from: androidx.compose.ui.platform.f0 */
public final class C1830f0 {

    /* renamed from: a */
    public Object f4088a;

    public /* synthetic */ C1830f0(int i) {
        this.f4088a = new ArrayList(i);
    }

    /* renamed from: a */
    public final void mo7209a(Object obj) {
        ((ArrayList) this.f4088a).add(obj);
    }

    /* renamed from: b */
    public final void mo7210b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList arrayList = (ArrayList) this.f4088a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll((ArrayList) this.f4088a, objArr);
                }
            } else if (obj instanceof Collection) {
                ((ArrayList) this.f4088a).addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    ((ArrayList) this.f4088a).add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    ((ArrayList) this.f4088a).add(it.next());
                }
            } else {
                StringBuilder h = C0072d.m201h("Don't know how to spread ");
                h.append(obj.getClass());
                throw new UnsupportedOperationException(h.toString());
            }
        }
    }

    /* renamed from: c */
    public final void mo7211c(Path path) {
        int size = ((List) this.f4088a).size();
        while (true) {
            size--;
            if (size >= 0) {
                C6859r rVar = (C6859r) ((List) this.f4088a).get(size);
                PathMeasure pathMeasure = C7659e.f16963a;
                if (rVar != null && !rVar.f15166a) {
                    C7659e.m14700a(path, rVar.f15169d.mo19089l() / 100.0f, rVar.f15170e.mo19089l() / 100.0f, rVar.f15171f.mo19089l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final int mo7212d() {
        return ((Parcel) this.f4088a).dataAvail();
    }

    /* renamed from: e */
    public final float mo7213e() {
        return ((Parcel) this.f4088a).readFloat();
    }

    /* renamed from: f */
    public final long mo7214f() {
        byte readByte = ((Parcel) this.f4088a).readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0;
        return C7293k.m14001a(j, 0) ? C7292j.f16173c : C0114h.m316r0(j, mo7213e());
    }

    /* renamed from: g */
    public final void mo7215g(String str, SingleListingCheckout singleListingCheckout) {
        if (((C8703p) this.f4088a) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, str);
            if (!singleListingCheckout.isStandalonePaypal()) {
                List<PaymentOption> paymentOptions = singleListingCheckout.getPaymentOptions();
                int size = paymentOptions.size();
                String str2 = "";
                for (int i = 0; i < size; i++) {
                    StringBuilder h = C0072d.m201h(str2);
                    h.append(paymentOptions.get(i).getPaymentMethod());
                    h.append(",");
                    str2 = h.toString();
                }
                hashMap.put(PredefinedAnalyticsProperty.PAYMENT_METHODS, str2.substring(0, str2.length() - 1));
            }
            ((C8703p) this.f4088a).mo21333d("closed_paypal_overlay", hashMap);
        }
    }

    public /* synthetic */ C1830f0(C8703p pVar) {
        this.f4088a = pVar;
    }

    public /* synthetic */ C1830f0(View view) {
        this.f4088a = view.getOverlay();
    }

    public C1830f0(int i, int i2) {
        if (i != 2) {
            this.f4088a = C0009c.m83a(Looper.getMainLooper());
        } else {
            this.f4088a = new ArrayList();
        }
    }

    public /* synthetic */ C1830f0(String str) {
        Parcel obtain = Parcel.obtain();
        C19383o.m32796f(obtain, "obtain()");
        this.f4088a = obtain;
        byte[] decode = Base64.decode(str, 0);
        ((Parcel) this.f4088a).unmarshall(decode, 0, decode.length);
        ((Parcel) this.f4088a).setDataPosition(0);
    }
}
