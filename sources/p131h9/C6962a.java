package p131h9;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.feedback.data.SortType;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: h9.a */
public final class C6962a {

    /* renamed from: a */
    public final SortType f15444a;

    /* renamed from: b */
    public final Rating f15445b;

    /* renamed from: c */
    public final boolean f15446c;

    /* renamed from: d */
    public final boolean f15447d;

    /* renamed from: e */
    public final boolean f15448e;

    public C6962a(SortType sortType, Rating rating, boolean z, boolean z2, boolean z3) {
        C19383o.m32797g(sortType, "sort");
        C19383o.m32797g(rating, ResponseConstants.RATING);
        this.f15444a = sortType;
        this.f15445b = rating;
        this.f15446c = z;
        this.f15447d = z2;
        this.f15448e = z3;
    }

    /* renamed from: a */
    public static C6962a m13497a(C6962a aVar, SortType sortType, Rating rating, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            sortType = aVar.f15444a;
        }
        SortType sortType2 = sortType;
        if ((i & 2) != 0) {
            rating = aVar.f15445b;
        }
        Rating rating2 = rating;
        if ((i & 4) != 0) {
            z = aVar.f15446c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = aVar.f15447d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = aVar.f15448e;
        }
        aVar.getClass();
        C19383o.m32797g(sortType2, "sort");
        C19383o.m32797g(rating2, ResponseConstants.RATING);
        return new C6962a(sortType2, rating2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6962a)) {
            return false;
        }
        C6962a aVar = (C6962a) obj;
        return this.f15444a == aVar.f15444a && this.f15445b == aVar.f15445b && this.f15446c == aVar.f15446c && this.f15447d == aVar.f15447d && this.f15448e == aVar.f15448e;
    }

    public final int hashCode() {
        int hashCode = (this.f15445b.hashCode() + (this.f15444a.hashCode() * 31)) * 31;
        boolean z = this.f15446c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f15447d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f15448e;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SortFiltersUiData(sort=");
        h.append(this.f15444a);
        h.append(", rating=");
        h.append(this.f15445b);
        h.append(", withPhotos=");
        h.append(this.f15446c);
        h.append(", withVideos=");
        h.append(this.f15447d);
        h.append(", sortingSelected=");
        return C0391c.m1058d(h, this.f15448e, ')');
    }
}
