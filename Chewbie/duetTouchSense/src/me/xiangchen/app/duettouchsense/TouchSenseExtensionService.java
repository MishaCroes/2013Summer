package me.xiangchen.app.duettouchsense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class TouchSenseExtensionService extends ExtensionService {
	public static final String EXTENSION_KEY = "me.xiangchen.app.duettouchsense.key";
	public TouchSenseExtensionService() {
        super(EXTENSION_KEY);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected RegistrationInformation getRegistrationInformation() {
        return new TouchSenseRegistrationInformation(this);
    }

    @Override
    protected boolean keepRunningWhenConnected() {
        return false;
    }
    

	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new TouchSenseExtension(this, hostAppPackageName);
	}
}
