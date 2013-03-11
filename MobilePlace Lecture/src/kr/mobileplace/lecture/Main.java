package kr.mobileplace.lecture;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;  

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        TextView tv = new TextView(this);                 // TextView 객체 생성
        tv.setText("Hello world!!121211!!!!");              // 글자 세팅
        setContentView(tv);   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
