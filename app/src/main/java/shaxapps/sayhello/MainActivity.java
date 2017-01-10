package shaxapps.sayhello;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Toast mToastToShow;
    public void onButtonTap(View v) {
        int toastDurationInMilliseconds = 10000;
        mToastToShow = Toast.makeText(
                getApplicationContext(),
                "Ouch!",
                Toast.LENGTH_LONG);

        CountDownTimer toastCountDown;
        toastCountDown = new CountDownTimer(toastDurationInMilliseconds, 1000) {
            public void onTick(long millisUntilFinished) {
                mToastToShow.show();
            }
            public void onFinish() {
                mToastToShow.cancel();
            }
        };
        mToastToShow.show();
        toastCountDown.start();
    }
}
