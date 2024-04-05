package androidx.slice;

import android.app.PendingIntent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import androidx.core.graphics.drawable.IconCompat;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p077d1.C6619c;
import p205p2.C7654d;

public final class Slice implements C7654d {

    /* renamed from: a */
    public SliceSpec f7599a;

    /* renamed from: b */
    public SliceItem[] f7600b;

    /* renamed from: c */
    public String[] f7601c;

    /* renamed from: d */
    public String f7602d;

    public Slice(ArrayList<SliceItem> arrayList, String[] strArr, Uri uri, SliceSpec sliceSpec) {
        this.f7600b = new SliceItem[0];
        this.f7601c = strArr;
        this.f7600b = (SliceItem[]) arrayList.toArray(new SliceItem[arrayList.size()]);
        this.f7602d = uri.toString();
        this.f7599a = sliceSpec;
    }

    /* renamed from: b */
    public static void m7928b(StringBuilder sb, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            sb.append('(');
            int length = strArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(strArr[i]);
                sb.append(", ");
            }
            sb.append(strArr[length]);
            sb.append(")");
        }
    }

    /* renamed from: d */
    public static boolean m7929d(IconCompat iconCompat) {
        if (iconCompat == null) {
            return false;
        }
        if (iconCompat.f5517a != 2 || iconCompat.mo8747d() != 0) {
            return true;
        }
        StringBuilder h = C0072d.m201h("Failed to add icon, invalid resource id: ");
        h.append(iconCompat.mo8747d());
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: c */
    public final List<String> mo12097c() {
        return Arrays.asList(this.f7601c);
    }

    /* renamed from: e */
    public final Bundle mo12098e() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("hints", this.f7601c);
        Parcelable[] parcelableArr = new Parcelable[this.f7600b.length];
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f7600b;
            if (i < sliceItemArr.length) {
                SliceItem sliceItem = sliceItemArr[i];
                sliceItem.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putStringArray("hints", sliceItem.f7608a);
                bundle2.putString(ResponseConstants.FORMAT, sliceItem.f7609b);
                bundle2.putString("subtype", sliceItem.f7610c);
                Object obj = sliceItem.f7611d;
                String str = sliceItem.f7609b;
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
                        bundle2.putParcelable("obj", (PendingIntent) cVar.f14606a);
                        bundle2.putBundle("obj_2", ((Slice) cVar.f14607b).mo12098e());
                        break;
                    case 1:
                        bundle2.putInt("obj", ((Integer) sliceItem.f7611d).intValue());
                        break;
                    case 2:
                        bundle2.putLong("obj", ((Long) sliceItem.f7611d).longValue());
                        break;
                    case 3:
                        bundle2.putCharSequence("obj", (CharSequence) obj);
                        break;
                    case 4:
                        IconCompat iconCompat = (IconCompat) obj;
                        iconCompat.getClass();
                        Bundle bundle3 = new Bundle();
                        switch (iconCompat.f5517a) {
                            case -1:
                                bundle3.putParcelable("obj", (Parcelable) iconCompat.f5518b);
                                break;
                            case 1:
                            case 5:
                                bundle3.putParcelable("obj", (Bitmap) iconCompat.f5518b);
                                break;
                            case 2:
                            case 4:
                            case 6:
                                bundle3.putString("obj", (String) iconCompat.f5518b);
                                break;
                            case 3:
                                bundle3.putByteArray("obj", (byte[]) iconCompat.f5518b);
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid icon");
                        }
                        bundle3.putInt("type", iconCompat.f5517a);
                        bundle3.putInt("int1", iconCompat.f5521e);
                        bundle3.putInt("int2", iconCompat.f5522f);
                        bundle3.putString("string1", iconCompat.f5526j);
                        ColorStateList colorStateList = iconCompat.f5523g;
                        if (colorStateList != null) {
                            bundle3.putParcelable("tint_list", colorStateList);
                        }
                        PorterDuff.Mode mode = iconCompat.f5524h;
                        if (mode != IconCompat.f5516k) {
                            bundle3.putString("tint_mode", mode.name());
                        }
                        bundle2.putBundle("obj", bundle3);
                        break;
                    case 5:
                        bundle2.putParcelable("obj", (Parcelable) obj);
                        break;
                    case 6:
                        bundle2.putParcelable("obj", ((Slice) obj).mo12098e());
                        break;
                }
                parcelableArr[i] = bundle2;
                i++;
            } else {
                bundle.putParcelableArray(ResponseConstants.ITEMS, parcelableArr);
                bundle.putParcelable(Constants.APPBOY_PUSH_DEEP_LINK_KEY, Uri.parse(this.f7602d));
                SliceSpec sliceSpec = this.f7599a;
                if (sliceSpec != null) {
                    bundle.putString("type", sliceSpec.f7618a);
                    bundle.putInt("revision", this.f7599a.f7619b);
                }
                return bundle;
            }
        }
    }

    /* renamed from: f */
    public final String mo12099f(String str) {
        StringBuilder k = C0073e.m211k(str, "Slice ");
        String[] strArr = this.f7601c;
        if (strArr.length > 0) {
            m7928b(k, strArr);
            k.append(' ');
        }
        k.append('[');
        k.append(this.f7602d);
        k.append("] {\n");
        String str2 = str + "  ";
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f7600b;
            if (i >= sliceItemArr.length) {
                return C0391c.m1057c(k, str, '}');
            }
            k.append(sliceItemArr[i].mo12112e(str2));
            i++;
        }
    }

    public final String toString() {
        return mo12099f("");
    }

    /* renamed from: androidx.slice.Slice$a */
    public static class C3273a {

        /* renamed from: a */
        public final Uri f7603a;

        /* renamed from: b */
        public ArrayList<SliceItem> f7604b = new ArrayList<>();

        /* renamed from: c */
        public ArrayList<String> f7605c = new ArrayList<>();

        /* renamed from: d */
        public SliceSpec f7606d;

        /* renamed from: e */
        public int f7607e;

        public C3273a(Uri uri) {
            this.f7603a = uri;
        }

        /* renamed from: a */
        public final void mo12101a(PendingIntent pendingIntent, Slice slice) {
            pendingIntent.getClass();
            this.f7604b.add(new SliceItem(new C6619c(pendingIntent, slice), ResponseConstants.ACTION, (String) null, (String[]) slice.mo12097c().toArray(new String[slice.mo12097c().size()])));
        }

        /* renamed from: b */
        public final void mo12102b(String... strArr) {
            this.f7605c.addAll(Arrays.asList(strArr));
        }

        /* renamed from: c */
        public final void mo12103c(IconCompat iconCompat, String... strArr) {
            iconCompat.getClass();
            if (Slice.m7929d(iconCompat)) {
                this.f7604b.add(new SliceItem(iconCompat, ResponseConstants.IMAGE, (String) null, strArr));
            }
        }

        /* renamed from: d */
        public final void mo12104d(int i, String str, String... strArr) {
            this.f7604b.add(new SliceItem(Integer.valueOf(i), "int", str, strArr));
        }

        /* renamed from: e */
        public final void mo12105e(SliceItem sliceItem) {
            this.f7604b.add(sliceItem);
        }

        /* renamed from: f */
        public final void mo12106f(Slice slice) {
            slice.getClass();
            this.f7604b.add(new SliceItem(slice, "slice", (String) null, (String[]) slice.mo12097c().toArray(new String[slice.mo12097c().size()])));
        }

        /* renamed from: g */
        public final void mo12107g(CharSequence charSequence, String str, String... strArr) {
            this.f7604b.add(new SliceItem(charSequence, "text", str, strArr));
        }

        /* renamed from: h */
        public final Slice mo12108h() {
            ArrayList<SliceItem> arrayList = this.f7604b;
            ArrayList<String> arrayList2 = this.f7605c;
            return new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), this.f7603a, this.f7606d);
        }

        public C3273a(C3273a aVar) {
            Uri.Builder appendPath = aVar.f7603a.buildUpon().appendPath("_gen");
            int i = aVar.f7607e;
            aVar.f7607e = i + 1;
            this.f7603a = appendPath.appendPath(String.valueOf(i)).build();
        }
    }

    public Slice() {
        this.f7600b = new SliceItem[0];
        this.f7601c = new String[0];
    }
}
