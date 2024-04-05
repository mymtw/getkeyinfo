package com.google.common.util.concurrent;

import com.google.common.base.C15794l;
import com.google.common.collect.C16203o;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.MapMaker;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@CanIgnoreReturnValue
public class CycleDetectingLockFactory {

    /* renamed from: a */
    public static final Logger f36481a = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: b */
    public static final C16358a f36482b = new C16358a();

    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements C16359b {
        private final C16360c lockGraphNode;
        private final CycleDetectingReentrantReadLock readLock;
        private final CycleDetectingReentrantWriteLock writeLock;

        public CycleDetectingReentrantReadWriteLock(C16360c cVar, boolean z, C16358a aVar) {
            super(z);
            this.readLock = new CycleDetectingReentrantReadLock(this);
            this.writeLock = new CycleDetectingReentrantWriteLock(this);
            cVar.getClass();
            this.lockGraphNode = cVar;
        }

        public C16360c getLockGraphNode() {
            return this.lockGraphNode;
        }

        public boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }
    }

    public static class ExampleStackTrace extends IllegalStateException {
        public static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        public static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m25897of(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), C16360c.class.getName());

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ExampleStackTrace(C16360c cVar, C16360c cVar2) {
            super("null -> null");
            cVar.getClass();
            cVar2.getClass();
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                if (C16361d.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    public enum Policies {
        THROW {
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN {
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f36481a.log(Level.SEVERE, "Detected potential deadlock", potentialDeadlockException);
            }
        },
        DISABLED {
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        public PotentialDeadlockException(C16360c cVar, C16360c cVar2, ExampleStackTrace exampleStackTrace, C16358a aVar) {
            super(cVar, cVar2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }

        public ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    public static class C16358a extends ThreadLocal<ArrayList<C16360c>> {
        public final Object initialValue() {
            C16203o.m26215b(3, "initialArraySize");
            return new ArrayList(3);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    public interface C16359b {
        C16360c getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    public static class C16360c {
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$d */
    public static final class C16361d<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    static {
        MapMaker mapMaker = new MapMaker();
        mapMaker.mo56936e();
        mapMaker.mo56934c();
    }

    /* renamed from: a */
    public static void m26500a(CycleDetectingLockFactory cycleDetectingLockFactory, C16359b bVar) {
        cycleDetectingLockFactory.getClass();
        if (!bVar.isAcquiredByCurrentThread()) {
            ArrayList arrayList = (ArrayList) f36482b.get();
            C16360c lockGraphNode = bVar.getLockGraphNode();
            lockGraphNode.getClass();
            if (arrayList.size() > 0) {
                boolean z = false;
                C16360c cVar = (C16360c) arrayList.get(0);
                if (lockGraphNode != cVar) {
                    z = true;
                }
                cVar.getClass();
                C15794l.m25622p((Object) null, "Attempted to acquire multiple locks with the same rank %s", z);
                throw null;
            }
            arrayList.add(lockGraphNode);
        }
    }

    /* renamed from: b */
    public static void m26501b(C16359b bVar) {
        if (!bVar.isAcquiredByCurrentThread()) {
            ArrayList arrayList = (ArrayList) f36482b.get();
            C16360c lockGraphNode = bVar.getLockGraphNode();
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    return;
                }
            } while (arrayList.get(size) != lockGraphNode);
            arrayList.remove(size);
        }
    }

    public final class CycleDetectingReentrantLock extends ReentrantLock implements C16359b {
        private final C16360c lockGraphNode;

        public CycleDetectingReentrantLock(C16360c cVar, boolean z, C16358a aVar) {
            super(z);
            cVar.getClass();
            this.lockGraphNode = cVar;
        }

        public C16360c getLockGraphNode() {
            return this.lockGraphNode;
        }

        public boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        public void lock() {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m26501b(this);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m26501b(this);
            }
        }

        public boolean tryLock() {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m26501b(this);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m26501b(this);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m26501b(this);
            }
        }
    }

    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        @Weak
        public final CycleDetectingReentrantReadWriteLock readWriteLock;

        public CycleDetectingReentrantReadLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        public void lock() {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public boolean tryLock() {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }
    }

    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        @Weak
        public final CycleDetectingReentrantReadWriteLock readWriteLock;

        public CycleDetectingReentrantWriteLock(CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        public void lock() {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public boolean tryLock() {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.m26500a(CycleDetectingLockFactory.this, this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                CycleDetectingLockFactory.m26501b(this.readWriteLock);
            }
        }
    }
}
