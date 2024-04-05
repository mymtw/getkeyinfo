package p718yi;

import android.os.SystemClock;
import androidx.compose.p015ui.node.C1739f;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.C14386b;
import java.util.Arrays;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14075p;
import p612li.C18188d;

/* renamed from: yi.a */
public abstract class C18883a implements C14386b {

    /* renamed from: a */
    public final TrackGroup f42057a;

    /* renamed from: b */
    public final int f42058b;

    /* renamed from: c */
    public final int[] f42059c;

    /* renamed from: d */
    public final Format[] f42060d;

    /* renamed from: e */
    public final long[] f42061e;

    /* renamed from: f */
    public int f42062f;

    public C18883a(TrackGroup trackGroup, int[] iArr) {
        int i = 0;
        C14075p.m21694f(iArr.length > 0);
        trackGroup.getClass();
        this.f42057a = trackGroup;
        int length = iArr.length;
        this.f42058b = length;
        this.f42060d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f42060d[i2] = trackGroup.getFormat(iArr[i2]);
        }
        Arrays.sort(this.f42060d, new C1739f(2));
        this.f42059c = new int[this.f42058b];
        while (true) {
            int i3 = this.f42058b;
            if (i < i3) {
                this.f42059c[i] = trackGroup.indexOf(this.f42060d[i]);
                i++;
            } else {
                this.f42061e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo47898b(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean p = mo70319p(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f42058b && !p) {
            p = i2 != i && !mo70319p(i2, elapsedRealtime);
            i2++;
        }
        if (!p) {
            return false;
        }
        long[] jArr = this.f42061e;
        long j2 = jArr[i];
        int i3 = C14049b0.f30913a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    /* renamed from: c */
    public final Format mo70311c(int i) {
        return this.f42060d[i];
    }

    /* renamed from: d */
    public final int mo70312d(int i) {
        return this.f42059c[i];
    }

    public void disable() {
    }

    /* renamed from: e */
    public void mo47892e(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18883a aVar = (C18883a) obj;
        return this.f42057a == aVar.f42057a && Arrays.equals(this.f42059c, aVar.f42059c);
    }

    /* renamed from: g */
    public final int mo70314g(int i) {
        for (int i2 = 0; i2 < this.f42058b; i2++) {
            if (this.f42059c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public final TrackGroup mo70315h() {
        return this.f42057a;
    }

    public final int hashCode() {
        if (this.f42062f == 0) {
            this.f42062f = Arrays.hashCode(this.f42059c) + (System.identityHashCode(this.f42057a) * 31);
        }
        return this.f42062f;
    }

    /* renamed from: j */
    public void mo47893j() {
    }

    /* renamed from: k */
    public int mo47894k(long j, List<? extends C18188d> list) {
        return list.size();
    }

    /* renamed from: l */
    public final int mo70317l(Format format) {
        for (int i = 0; i < this.f42058b; i++) {
            if (this.f42060d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    public final int length() {
        return this.f42059c.length;
    }

    /* renamed from: m */
    public final int mo47899m() {
        return this.f42059c[mo47723a()];
    }

    /* renamed from: n */
    public final Format mo47900n() {
        return this.f42060d[mo47723a()];
    }

    /* renamed from: p */
    public final boolean mo70319p(int i, long j) {
        return this.f42061e[i] > j;
    }
}
