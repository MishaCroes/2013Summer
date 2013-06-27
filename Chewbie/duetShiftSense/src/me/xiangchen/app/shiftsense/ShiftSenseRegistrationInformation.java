package me.xiangchen.app.shiftsense;

import me.xiangchen.app.shiftsense.R;
import android.content.ContentValues;
import android.content.Context;

import com.sonyericsson.extras.liveware.aef.registration.Registration;
import com.sonyericsson.extras.liveware.extension.util.ExtensionUtils;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class ShiftSenseRegistrationInformation extends RegistrationInformation {
	final Context mContext;
	
	protected ShiftSenseRegistrationInformation(Context context) {
		if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        mContext = context;
	}
	
	@Override
	public int getRequiredNotificationApiVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ContentValues getExtensionRegistrationConfiguration() {
		String extensionIcon = ExtensionUtils.getUriString(mContext,
                R.drawable.ic_extension);
        String iconHostapp = ExtensionUtils.getUriString(mContext,
                R.drawable.ic_launcher);

        String configurationText = mContext.getString(R.string.configuration_text);
        String extensionName = mContext.getString(R.string.extension_name);

        ContentValues values = new ContentValues();

        values.put(Registration.ExtensionColumns.CONFIGURATION_TEXT, configurationText);
        values.put(Registration.ExtensionColumns.EXTENSION_ICON_URI, extensionIcon);
        values.put(Registration.ExtensionColumns.EXTENSION_KEY,
                ShiftSenseExtensionService.EXTENSION_KEY);
        values.put(Registration.ExtensionColumns.HOST_APP_ICON_URI, iconHostapp);
        values.put(Registration.ExtensionColumns.NAME, extensionName);
        values.put(Registration.ExtensionColumns.NOTIFICATION_API_VERSION,
                getRequiredNotificationApiVersion());
        values.put(Registration.ExtensionColumns.PACKAGE_NAME, mContext.getPackageName());

        return values;
	}

	@Override
	public int getRequiredWidgetApiVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRequiredControlApiVersion() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getRequiredSensorApiVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public boolean isDisplaySizeSupported(int width, int height) {
        return ((width == ShiftSenseExtension.getSupportedControlWidth(mContext) && height == ShiftSenseExtension
                .getSupportedControlHeight(mContext)));
    }
}
