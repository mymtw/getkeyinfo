package p660qp;

import android.content.Context;
import p145io.branch.indexing.BranchUniversalObject;
import p145io.branch.referral.C7077r;
import p145io.branch.referral.util.LinkProperties;
import p623mm.C18250d;

/* renamed from: qp.b */
public final class C18472b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LinkProperties f40675b;

    /* renamed from: c */
    public final /* synthetic */ BranchUniversalObject f40676c;

    /* renamed from: d */
    public final /* synthetic */ Context f40677d;

    public C18472b(Context context, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties) {
        this.f40675b = linkProperties;
        this.f40676c = branchUniversalObject;
        this.f40677d = context;
    }

    public final void run() {
        try {
            LinkProperties linkProperties = this.f40675b;
            String shortUrl = linkProperties == null ? this.f40676c.getShortUrl(this.f40677d, C18473c.f40679b) : this.f40676c.getShortUrl(this.f40677d, linkProperties);
            C7077r.m13675a("Removing indexed BranchUniversalObject with link " + shortUrl);
            C18250d.getInstance();
            try {
                throw null;
            } catch (Exception unused) {
                C7077r.m13675a("Failed to index your contents using Firebase. Please make sure Firebase is enabled and initialised in your app");
            }
        } catch (NoClassDefFoundError unused2) {
            C7077r.m13675a("Failed to remove the BranchUniversalObject from Firebase local indexing. Please make sure Firebase is enabled and initialised in your app");
        }
    }
}
