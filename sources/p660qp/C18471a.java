package p660qp;

import android.content.Context;
import android.text.TextUtils;
import p145io.branch.indexing.BranchUniversalObject;
import p145io.branch.referral.C7077r;
import p145io.branch.referral.util.LinkProperties;
import p623mm.C18251e;

/* renamed from: qp.a */
public final class C18471a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LinkProperties f40672b;

    /* renamed from: c */
    public final /* synthetic */ BranchUniversalObject f40673c;

    /* renamed from: d */
    public final /* synthetic */ Context f40674d;

    public C18471a(Context context, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties) {
        this.f40672b = linkProperties;
        this.f40673c = branchUniversalObject;
        this.f40674d = context;
    }

    public final void run() {
        try {
            C18473c.f40678a = C18251e.getInstance();
        } catch (NoClassDefFoundError unused) {
            C7077r.m13675a("Firebase app indexing is not available. Please consider enabling Firebase app indexing for your app for better indexing experience with Google.");
        } catch (Exception unused2) {
            C7077r.m13675a("Failed to index your contents using Firebase. Please make sure Firebase  is enabled and initialised in your app");
        }
        LinkProperties linkProperties = this.f40672b;
        String shortUrl = linkProperties == null ? this.f40673c.getShortUrl(this.f40674d, C18473c.f40679b) : this.f40673c.getShortUrl(this.f40674d, linkProperties);
        C7077r.m13675a("Indexing BranchUniversalObject with Google using URL " + shortUrl);
        if (!TextUtils.isEmpty(shortUrl)) {
            try {
                if (C18473c.f40678a != null) {
                    C18473c.m31175b(shortUrl, this.f40673c);
                } else {
                    C18473c.m31174a(shortUrl, this.f40674d, this.f40673c);
                }
            } catch (Exception unused3) {
                C7077r.m13675a("Warning: Unable to list your content in Google search. Please make sure you have added latest Firebase app indexing SDK to your project dependencies.");
            }
        }
    }
}
