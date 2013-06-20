package me.xiangchen.app.duethandsense;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.control.ControlExtension;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class HandSenseExtensionService extends ExtensionService {
	public static final String EXTENSION_KEY = "me.xiangchen.app.duettouchsense.key";
	public HandSenseExtensionService() {
		super(EXTENSION_KEY);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void onCreate() {
        super.onCreate();
    }
	
	@Override
	protected RegistrationInformation getRegistrationInformation() {
		// TODO Auto-generated method stub
		return new HandSenseRegistrationInformation(this);
	}

	@Override
	protected boolean keepRunningWhenConnected() {
		return false;
	}
	
	@Override
	public ControlExtension createControlExtension(String hostAppPackageName) {
		return new HandSenseExtension(this, hostAppPackageName);
	}

}
