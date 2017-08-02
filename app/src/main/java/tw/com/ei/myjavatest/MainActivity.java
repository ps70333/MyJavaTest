package tw.com.ei.myjavatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList list =new LinkedList();
        //list 特性: 有順序性 且 可重複
        list.add("Simon");
        list.add("Simon");
        list.add(1.23);
        list.add(true);
        list.add(888);
        //按照add的先後順序...來決定先後
        Log.i("simon",list.toString());

        LinkedList list2 =list;
        Log.i("simon",list.toString());
        list.add("CCC");
        list2.add("bb");

        Log.i("simon","2="+list2.toString());
        HashSet set =new HashSet();
        //set 特性: 沒有順序性 且 不可重複
        set.add("Simon");
        set.add("Simon");
        set.add(1.23);
        set.add(true);
        set.add(888);
        Log.i("simon",set.toString());

    }
}
