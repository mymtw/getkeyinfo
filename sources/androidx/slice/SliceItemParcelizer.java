package androidx.slice;

import android.text.Html;
import androidx.appcompat.widget.C0326j;
import androidx.versionedparcelable.VersionedParcel;
import com.etsy.android.lib.models.ResponseConstants;
import p077d1.C6619c;

public final class SliceItemParcelizer {
    public static SliceItem read(VersionedParcel versionedParcel) {
        Object obj;
        SliceItem sliceItem = new SliceItem();
        sliceItem.f7608a = (String[]) versionedParcel.mo12574e(1, sliceItem.f7608a);
        sliceItem.f7609b = versionedParcel.mo12585p(2, sliceItem.f7609b);
        sliceItem.f7610c = versionedParcel.mo12585p(3, sliceItem.f7610c);
        SliceItemHolder sliceItemHolder = (SliceItemHolder) versionedParcel.mo12588s(sliceItem.f7612e, 4);
        sliceItem.f7612e = sliceItemHolder;
        String str = sliceItem.f7609b;
        sliceItemHolder.getClass();
        str.getClass();
        str.hashCode();
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
                obj = new C6619c(sliceItemHolder.f7614b, (Slice) sliceItemHolder.f7613a);
                break;
            case 1:
                obj = Integer.valueOf(sliceItemHolder.f7616d);
                break;
            case 2:
                obj = Long.valueOf(sliceItemHolder.f7617e);
                break;
            case 3:
                String str2 = sliceItemHolder.f7615c;
                if (str2 != null && str2.length() != 0) {
                    obj = Html.fromHtml(sliceItemHolder.f7615c, 0);
                    break;
                } else {
                    obj = "";
                    break;
                }
                break;
            case 4:
            case 6:
                obj = sliceItemHolder.f7613a;
                break;
            case 5:
                obj = sliceItemHolder.f7614b;
                break;
            default:
                throw new IllegalArgumentException(C0326j.m864i("Unrecognized format ", str));
        }
        sliceItem.f7611d = obj;
        sliceItem.f7612e = null;
        return sliceItem;
    }

    public static void write(SliceItem sliceItem, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        sliceItem.f7612e = new SliceItemHolder(sliceItem.f7611d, sliceItem.f7609b);
        versionedParcel.mo12590u(1, sliceItem.f7608a);
        versionedParcel.mo12567E(2, sliceItem.f7609b);
        versionedParcel.mo12567E(3, sliceItem.f7610c);
        SliceItemHolder sliceItemHolder = sliceItem.f7612e;
        versionedParcel.mo12589t(4);
        versionedParcel.mo12569G(sliceItemHolder);
    }
}
