package co.helloxprototype.app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class IntegratingFacebookTutorialApplication extends Application {

	static final String TAG = "MyApp";

	@Override
	public void onCreate() {
		super.onCreate();

		Parse.initialize(this, "HaRXBAf0BpPFsHKbXGG18CmTucHrn867deDYT7Yn",
				"QPj3gOBVDbKZuevM2YoiHtzbIztsi9p2hTG3azH9");

		// Set your Facebook App Id in strings.xml
		ParseFacebookUtils.initialize(getString(R.string.app_id));

	}

}
