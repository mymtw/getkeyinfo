package p145io.branch.referral;

import java.util.concurrent.CountDownLatch;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.b */
public final class C7028b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f15634b;

    /* renamed from: c */
    public final /* synthetic */ int f15635c;

    /* renamed from: d */
    public final /* synthetic */ Branch.C7014d f15636d;

    /* renamed from: e */
    public final /* synthetic */ Branch f15637e;

    public C7028b(Branch branch, CountDownLatch countDownLatch, int i, Branch.C7014d dVar) {
        this.f15637e = branch;
        this.f15634b = countDownLatch;
        this.f15635c = i;
        this.f15636d = dVar;
    }

    public final void run() {
        Branch branch = this.f15637e;
        CountDownLatch countDownLatch = this.f15634b;
        int i = this.f15635c;
        Branch.C7014d dVar = this.f15636d;
        branch.getClass();
        Branch.m13570b(countDownLatch, i, dVar);
    }
}
