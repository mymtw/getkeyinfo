package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: com.appsflyer.internal.ac */
public final class C4972ac {
    public final String AFInAppEventType;
    private final boolean valueOf;
    public final long values;

    /* renamed from: com.appsflyer.internal.ac$a */
    public static final class C4973a {
        public final String AFInAppEventType;
        private final boolean valueOf;

        public C4973a(String str, boolean z) {
            this.AFInAppEventType = str;
            this.valueOf = z;
        }

        public final boolean values() {
            return this.valueOf;
        }
    }

    /* renamed from: com.appsflyer.internal.ac$e */
    public static final class C4975e implements IInterface {
        private final IBinder AFKeystoreWrapper;

        public C4975e(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final boolean AFKeystoreWrapper() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public C4972ac() {
    }

    public C4972ac(String str, long j, boolean z) {
        this.AFInAppEventType = str;
        this.values = j;
        this.valueOf = z;
    }

    public static C4973a AFInAppEventParameterName(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            C4974d dVar = new C4974d((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (!context.bindService(intent, dVar, 1)) {
                    context.unbindService(dVar);
                    throw new IOException("Google Play connection failed");
                } else if (!dVar.AFInAppEventParameterName) {
                    dVar.AFInAppEventParameterName = true;
                    IBinder poll = dVar.values.poll(10, TimeUnit.SECONDS);
                    if (poll != null) {
                        C4975e eVar = new C4975e(poll);
                        return new C4973a(eVar.values(), eVar.AFKeystoreWrapper());
                    }
                    throw new TimeoutException("Timed out waiting for the service connection");
                } else {
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
            } finally {
                context.unbindService(dVar);
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    /* renamed from: com.appsflyer.internal.ac$d */
    public static final class C4974d implements ServiceConnection {
        public boolean AFInAppEventParameterName;
        public final LinkedBlockingQueue<IBinder> values;

        private C4974d() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.values.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ C4974d(byte b) {
            this();
        }
    }
}
