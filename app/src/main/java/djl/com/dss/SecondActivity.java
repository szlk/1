package djl.com.dss;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import djl.com.dss.clss.MessageEvent;

/***
 ** ************************************
 * Created by djl on 2019/2/25
 * djl.com.dss
 * *************************************
 * *
 ** ************************************
 */
public class SecondActivity extends AppCompatActivity {
    @BindView(R.id.button2)
    Button button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        newActivity();
    }
    private void newActivity(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent("我又回来了"));
                finish();
            }
        });
    }
}
