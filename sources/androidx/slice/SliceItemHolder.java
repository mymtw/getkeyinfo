package androidx.slice;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import com.etsy.android.lib.models.ResponseConstants;
import p077d1.C6619c;
import p205p2.C7654d;

public class SliceItemHolder implements C7654d {

    /* renamed from: a */
    public C7654d f7613a;

    /* renamed from: b */
    public Parcelable f7614b;

    /* renamed from: c */
    public String f7615c;

    /* renamed from: d */
    public int f7616d;

    /* renamed from: e */
    public long f7617e;

    public SliceItemHolder() {
    }

    public SliceItemHolder(Object obj, String str) {
        String str2;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals(ResponseConstants.ACTION)) {
                    c = 0;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c = 1;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c = 2;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals(ResponseConstants.IMAGE)) {
                    c = 4;
                    break;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    c = 5;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C6619c cVar = (C6619c) obj;
                F f = cVar.f14606a;
                if (f instanceof PendingIntent) {
                    this.f7614b = (Parcelable) f;
                    this.f7613a = (C7654d) cVar.f14607b;
                    return;
                }
                throw new IllegalArgumentException("Cannot write callback to parcel");
            case 1:
                this.f7616d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f7617e = ((Long) obj).longValue();
                return;
            case 3:
                if (obj instanceof Spanned) {
                    str2 = Html.toHtml((Spanned) obj, 0);
                } else {
                    str2 = (String) obj;
                }
                this.f7615c = str2;
                return;
            case 4:
            case 6:
                this.f7613a = (C7654d) obj;
                return;
            case 5:
                this.f7614b = (Parcelable) obj;
                return;
            default:
                return;
        }
    }
}
