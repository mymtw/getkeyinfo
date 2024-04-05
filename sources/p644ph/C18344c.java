package p644ph;

import android.support.p013v4.media.C0070b;
import androidx.compose.animation.C0391c;
import java.util.Arrays;
import p513bj.C14049b0;
import p644ph.C18364t;

/* renamed from: ph.c */
public final class C18344c implements C18364t {

    /* renamed from: a */
    public final int f40279a;

    /* renamed from: b */
    public final int[] f40280b;

    /* renamed from: c */
    public final long[] f40281c;

    /* renamed from: d */
    public final long[] f40282d;

    /* renamed from: e */
    public final long[] f40283e;

    /* renamed from: f */
    public final long f40284f;

    public C18344c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f40280b = iArr;
        this.f40281c = jArr;
        this.f40282d = jArr2;
        this.f40283e = jArr3;
        int length = iArr.length;
        this.f40279a = length;
        if (length > 0) {
            this.f40284f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f40284f = 0;
        }
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        int f = C14049b0.m21633f(this.f40283e, j, true);
        long[] jArr = this.f40283e;
        long j2 = jArr[f];
        long[] jArr2 = this.f40281c;
        C18367u uVar = new C18367u(j2, jArr2[f]);
        if (j2 >= j || f == this.f40279a - 1) {
            return new C18364t.C18365a(uVar, uVar);
        }
        int i = f + 1;
        return new C18364t.C18365a(uVar, new C18367u(jArr[i], jArr2[i]));
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f40284f;
    }

    public final String toString() {
        int i = this.f40279a;
        String arrays = Arrays.toString(this.f40280b);
        String arrays2 = Arrays.toString(this.f40281c);
        String arrays3 = Arrays.toString(this.f40283e);
        String arrays4 = Arrays.toString(this.f40282d);
        StringBuilder sb = new StringBuilder(C0391c.m1055a(arrays4, C0391c.m1055a(arrays3, C0391c.m1055a(arrays2, C0391c.m1055a(arrays, 71)))));
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        C0391c.m1061h(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return C0070b.m184f(sb, ", durationsUs=", arrays4, ")");
    }
}
