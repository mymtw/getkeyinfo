package android.support.p013v4.p014os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p013v4.p014os.IResultReceiver;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() {
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    };
    public final Handler mHandler;
    public final boolean mLocal;
    public IResultReceiver mReceiver;

    /* renamed from: android.support.v4.os.ResultReceiver$MyResultReceiver */
    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
        }

        public void send(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.mHandler;
            if (handler != null) {
                handler.post(new MyRunnable(i, bundle));
            } else {
                resultReceiver.onReceiveResult(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$MyRunnable */
    public class MyRunnable implements Runnable {
        public final int mResultCode;
        public final Bundle mResultData;

        public MyRunnable(int i, Bundle bundle) {
            this.mResultCode = i;
            this.mResultData = bundle;
        }

        public void run() {
            ResultReceiver.this.onReceiveResult(this.mResultCode, this.mResultData);
        }
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
        if (this.mLocal) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new MyRunnable(i, bundle));
            } else {
                onReceiveResult(i, bundle);
            }
        } else {
            IResultReceiver iResultReceiver = this.mReceiver;
            if (iResultReceiver != null) {
                try {
                    iResultReceiver.send(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.mReceiver == null) {
                this.mReceiver = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.mReceiver.asBinder());
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        this.mHandler = null;
        this.mReceiver = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }
}
