package youtu.com.application;

import android.app.Application;

import youtu.com.zxing.camera.CameraManager;

public class ImoocApplication extends Application {

    private static ImoocApplication mImoocApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mImoocApplication = this;


    }

    public static ImoocApplication getInstance(){
        return mImoocApplication;
    }
}
