package p437rd;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p498zc.C13949d;
import p628nj.C18263b;

/* renamed from: rd.a */
public final class C13354a extends C10423j implements C13949d {

    /* renamed from: a */
    public final List<ListingImage> f29277a;

    /* renamed from: b */
    public final Map<Long, Long> f29278b;

    /* renamed from: c */
    public final int f29279c;

    /* renamed from: d */
    public final ListingVideoPosition f29280d;

    /* renamed from: e */
    public final String f29281e;

    /* renamed from: f */
    public final boolean f29282f;

    /* renamed from: g */
    public final boolean f29283g;

    public C13354a(List<ListingImage> list, Map<Long, Long> map, int i, ListingVideoPosition listingVideoPosition, String str, boolean z, boolean z2) {
        this.f29277a = list;
        this.f29278b = map;
        this.f29279c = i;
        this.f29280d = listingVideoPosition;
        this.f29281e = str;
        this.f29282f = z;
        this.f29283g = z2;
    }

    /* renamed from: b */
    public static C13354a m21024b(C13354a aVar, int i, ListingVideoPosition listingVideoPosition, int i2) {
        String str = null;
        List<ListingImage> list = (i2 & 1) != 0 ? aVar.f29277a : null;
        Map<Long, Long> map = (i2 & 2) != 0 ? aVar.f29278b : null;
        if ((i2 & 4) != 0) {
            i = aVar.f29279c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            listingVideoPosition = aVar.f29280d;
        }
        ListingVideoPosition listingVideoPosition2 = listingVideoPosition;
        if ((i2 & 16) != 0) {
            str = aVar.f29281e;
        }
        String str2 = str;
        boolean z = (i2 & 32) != 0 ? aVar.f29282f : false;
        boolean z2 = (i2 & 64) != 0 ? aVar.f29283g : false;
        aVar.getClass();
        C19383o.m32797g(list, "images");
        C19383o.m32797g(map, "variationImages");
        return new C13354a(list, map, i3, listingVideoPosition2, str2, z, z2);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.IMAGES;
    }

    /* renamed from: c */
    public final boolean mo46039c() {
        return this.f29279c == 0 && C18263b.m30839d0(this.f29281e) && this.f29283g;
    }

    /* renamed from: d */
    public final LinkedHashMap mo46040d() {
        T t;
        boolean z;
        Set<Map.Entry<Long, Long>> entrySet = this.f29278b.entrySet();
        int T = C19421p.m32930T(C19322o.m32624F0(entrySet));
        if (T < 16) {
            T = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(T);
        for (Map.Entry entry : entrySet) {
            Iterator<T> it = this.f29277a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((ListingImage) t).getImageId().getIdAsLong() == ((Number) entry.getValue()).longValue()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Pair pair = new Pair(entry.getKey(), (ListingImage) t);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public final C13354a mo46041e(Long l) {
        int i = this.f29279c;
        Long l2 = this.f29278b.get(l);
        long longValue = l2 != null ? l2.longValue() : -1;
        Iterator<ListingImage> it = this.f29277a.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getImageId().getIdAsLong() == longValue) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            i = i2;
        }
        return m21024b(this, i, (ListingVideoPosition) null, 123);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13354a)) {
            return false;
        }
        C13354a aVar = (C13354a) obj;
        return C19383o.m32792b(this.f29277a, aVar.f29277a) && C19383o.m32792b(this.f29278b, aVar.f29278b) && this.f29279c == aVar.f29279c && C19383o.m32792b(this.f29280d, aVar.f29280d) && C19383o.m32792b(this.f29281e, aVar.f29281e) && this.f29282f == aVar.f29282f && this.f29283g == aVar.f29283g;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f29279c, (this.f29278b.hashCode() + (this.f29277a.hashCode() * 31)) * 31, 31);
        ListingVideoPosition listingVideoPosition = this.f29280d;
        int i = 0;
        int hashCode = (a + (listingVideoPosition == null ? 0 : listingVideoPosition.hashCode())) * 31;
        String str = this.f29281e;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f29282f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f29283g;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingImages(images=");
        h.append(this.f29277a);
        h.append(", variationImages=");
        h.append(this.f29278b);
        h.append(", selectedImageIndex=");
        h.append(this.f29279c);
        h.append(", listingVideoPosition=");
        h.append(this.f29280d);
        h.append(", visuallySimilarApiLink=");
        h.append(this.f29281e);
        h.append(", isDigitalDownloadBadgeVisible=");
        h.append(this.f29282f);
        h.append(", includeRelatedListings=");
        return C0391c.m1058d(h, this.f29283g, ')');
    }
}
