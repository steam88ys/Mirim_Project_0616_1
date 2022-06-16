package kr.hs.emirim.s2102.mirim_project_0616_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = getTabHost();

        TabHost.TabSpec spec1 = host.newTabSpec("tab1").setIndicator("순돌이1");
        spec1.setContent(R.id.tab1);
        host.addTab(spec1);

        TabHost.TabSpec spec2 = host.newTabSpec("tab2").setIndicator("순돌이2");
        spec2.setContent(R.id.tab2);
        host.addTab(spec2);

        TabHost.TabSpec spec3 = host.newTabSpec("tab3").setIndicator("순돌이3");
        spec3.setContent(R.id.tab3);
        host.addTab(spec3);

        host.setCurrentTab(1);

    }
}