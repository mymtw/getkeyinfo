package p359ha;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p379k9.C12987a;

/* renamed from: ha.b */
public abstract class C12800b implements C12987a {

    /* renamed from: a */
    public final String f28273a;

    /* renamed from: ha.b$a */
    public static final class C12801a extends C12800b {

        /* renamed from: b */
        public final String f28274b;

        /* renamed from: c */
        public final String f28275c;

        /* renamed from: d */
        public final String f28276d;

        /* renamed from: e */
        public final double f28277e;

        /* renamed from: f */
        public final double f28278f;

        /* renamed from: g */
        public final double f28279g;

        /* renamed from: h */
        public final String f28280h;

        /* renamed from: i */
        public final List<C12803c> f28281i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12801a(String str, String str2, String str3, double d, double d2, double d3, String str4, List<C12803c> list) {
            super(str);
            C19383o.m32797g(list, ResponseConstants.ITEMS);
            this.f28274b = str;
            this.f28275c = str2;
            this.f28276d = str3;
            this.f28277e = d;
            this.f28278f = d2;
            this.f28279g = d3;
            this.f28280h = str4;
            this.f28281i = list;
        }

        /* renamed from: a */
        public final Bundle mo45574a() {
            Bundle bundle = new Bundle();
            bundle.putString(ResponseConstants.TRANSACTION_ID, this.f28275c);
            bundle.putString("affiliation", this.f28276d);
            bundle.putDouble("value", this.f28277e);
            bundle.putDouble("tax", this.f28278f);
            bundle.putDouble("shipping", this.f28279g);
            bundle.putString("currency", this.f28280h);
            List<C12803c> list = this.f28281i;
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
            for (C12803c cVar : list) {
                cVar.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("item_id", cVar.f28285a);
                bundle2.putString("item_name", cVar.f28286b);
                bundle2.putString("item_category", cVar.f28287c);
                bundle2.putDouble(ResponseConstants.PRICE, cVar.f28288d);
                bundle2.putInt(ResponseConstants.QUANTITY, cVar.f28289e);
                arrayList.add(bundle2);
            }
            Object[] array = arrayList.toArray(new Bundle[0]);
            C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            bundle.putParcelableArray(ResponseConstants.ITEMS, (Parcelable[]) array);
            return bundle;
        }

        /* renamed from: b */
        public final String mo45573b() {
            return this.f28274b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12801a)) {
                return false;
            }
            C12801a aVar = (C12801a) obj;
            return C19383o.m32792b(this.f28274b, aVar.f28274b) && C19383o.m32792b(this.f28275c, aVar.f28275c) && C19383o.m32792b(this.f28276d, aVar.f28276d) && C19383o.m32792b(Double.valueOf(this.f28277e), Double.valueOf(aVar.f28277e)) && C19383o.m32792b(Double.valueOf(this.f28278f), Double.valueOf(aVar.f28278f)) && C19383o.m32792b(Double.valueOf(this.f28279g), Double.valueOf(aVar.f28279g)) && C19383o.m32792b(this.f28280h, aVar.f28280h) && C19383o.m32792b(this.f28281i, aVar.f28281i);
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f28276d, C0023f.m105e(this.f28275c, this.f28274b.hashCode() * 31, 31), 31);
            int hashCode = Double.hashCode(this.f28278f);
            int hashCode2 = Double.hashCode(this.f28279g);
            return this.f28281i.hashCode() + C0023f.m105e(this.f28280h, (hashCode2 + ((hashCode + ((Double.hashCode(this.f28277e) + e) * 31)) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Purchase(buyerLifetimeValue=");
            h.append(this.f28274b);
            h.append(", transactionId=");
            h.append(this.f28275c);
            h.append(", affiliation=");
            h.append(this.f28276d);
            h.append(", value=");
            h.append(this.f28277e);
            h.append(", tax=");
            h.append(this.f28278f);
            h.append(", shipping=");
            h.append(this.f28279g);
            h.append(", currency=");
            h.append(this.f28280h);
            h.append(", items=");
            return C0070b.m186i(h, this.f28281i, ')');
        }
    }

    /* renamed from: ha.b$b */
    public static final class C12802b extends C12800b {

        /* renamed from: b */
        public final String f28282b;

        /* renamed from: c */
        public final String f28283c;

        /* renamed from: d */
        public final String f28284d;

        public C12802b(String str, String str2, String str3) {
            super(str);
            this.f28282b = str;
            this.f28283c = str2;
            this.f28284d = str3;
        }

        /* renamed from: a */
        public final Bundle mo45574a() {
            Bundle bundle = new Bundle();
            bundle.putString("test_transaction_order_id", this.f28283c);
            bundle.putString("test_transaction_receipt_id", this.f28284d);
            return bundle;
        }

        /* renamed from: b */
        public final String mo45573b() {
            return this.f28282b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12802b)) {
                return false;
            }
            C12802b bVar = (C12802b) obj;
            return C19383o.m32792b(this.f28282b, bVar.f28282b) && C19383o.m32792b(this.f28283c, bVar.f28283c) && C19383o.m32792b(this.f28284d, bVar.f28284d);
        }

        public final int hashCode() {
            return this.f28284d.hashCode() + C0023f.m105e(this.f28283c, this.f28282b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TestPurchase(buyerLifetimeValue=");
            h.append(this.f28282b);
            h.append(", orderId=");
            h.append(this.f28283c);
            h.append(", receiptId=");
            return C0391c.m1057c(h, this.f28284d, ')');
        }
    }

    public C12800b(String str) {
        this.f28273a = str;
    }

    /* renamed from: b */
    public String mo45573b() {
        return this.f28273a;
    }
}
