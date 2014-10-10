package cn.edu.gdmec.s07131020.MenuDemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
   TextView mytv1;
   TextView mytv2;
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
    	switch (item.getItemId()) {
		case R.id.item1:     
			mytv1.setText("who help me ?");
			break;
		case R.id.item2:  
			mytv2.setText("are you kidding?");
			break;
	case R.id.item3:    
		item.setTitle("动态设置菜单标题");
		break;	}

		return super.onMenuItemSelected(featureId, item);
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv1= (TextView) findViewById(R.id.textView1);
        mytv2= (TextView) findViewById(R.id.textView2);
   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
