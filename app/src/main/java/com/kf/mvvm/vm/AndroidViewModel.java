package com.kf.mvvm.vm;

import android.app.Application;

import androidx.lifecycle.ViewModel;

/**
 * onCleared方法提供了释放VM中资源的一个机会，在Activity/Fragment的onDestroy生命周期中被调用。
 * 类库内部提供了一个实现类AndroidViewModel
 *
 * @author zhangqing
 * @package com.kf.mvvm.vm
 * @date 2021/7/22-3:04 下午
 */
public class AndroidViewModel extends ViewModel {

    private Application mApplication;

    public AndroidViewModel(Application application) {
        this.mApplication = application;
    }

    public <T extends Application> T getApplication() {
        return (T) mApplication;
    }
}
