package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p513bj.C14049b0;

public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE = (C14049b0.f30913a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);
    private final ImmutableList<Bundle> list;

    public BundleListRetriever(List<Bundle> list2) {
        this.list = ImmutableList.copyOf(list2);
    }

    public static ImmutableList<Bundle> getList(IBinder iBinder) {
        int readInt;
        ImmutableList.C15953a builder = ImmutableList.builder();
        int i = 1;
        int i2 = 0;
        while (i != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    Bundle readBundle = obtain2.readBundle();
                    readBundle.getClass();
                    builder.mo56633b(readBundle);
                    i2++;
                }
                obtain2.recycle();
                obtain.recycle();
                i = readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return builder.mo56664e();
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.list.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
