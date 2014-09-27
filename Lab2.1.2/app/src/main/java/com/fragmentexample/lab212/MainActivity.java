package com.fragmentexample.lab212;

        import android.app.Activity;
        import android.app.FragmentTransaction;
        import android.content.res.Configuration;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CheckBox;

public class MainActivity extends Activity {

    Fragment1 frag1;
    Fragment2 frag2;
    Fragment3 frag3;
    FragmentTransaction fTrans;
    CheckBox chbStack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fTrans = getFragmentManager().beginTransaction();
        frag1 = new Fragment1();
        frag2 = new Fragment2();
        frag3 = new Fragment3();

        fTrans.add(R.id.frgmCont,frag3);
        fTrans.commit();
       // chbStack = (CheckBox)findViewById(R.id.chbStack);
    }

    public void onClick(View v) {
       fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.button5:
                fTrans.replace(R.id.frgmCont, frag2);
                break;
            case R.id.button6:
                fTrans.replace(R.id.frgmCont, frag2);
                break;
            case R.id.button7:
                fTrans.replace(R.id.frgmCont, frag2);
            case R.id.button:
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.replace(R.id.frgmCont2,frag1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, frag1);
                }
            case R.id.button2:
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.replace(R.id.frgmCont2,frag1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    fTrans.replace(R.id.frgmCont, frag1);
                }
            case R.id.button3:

                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.replace(R.id.frgmCont2,frag1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, frag1);
                }
            default:
                break;
        }
        //if (chbStack.isChecked()) fTrans.addToBackStack(null);
        fTrans.commit();
    }
}