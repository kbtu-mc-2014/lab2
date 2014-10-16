package com.example.labwork2;

        import android.app.Activity;
        import android.app.FragmentTransaction;
        import android.content.res.Configuration;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CheckBox;

public class MainActivity extends Activity {

    MainFragment mainfragment;
    Category1 cat1;
    Category2 cat2;
    Category3 cat3;
    
    Article1 art1;
    Article2 art2;
    Article3 art3;
    FragmentTransaction fTrans;
    CheckBox chbStack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fTrans = getFragmentManager().beginTransaction();
        mainfragment = new MainFragment();
        art1 = new Article1();
        art2 = new Article2();
        art3 = new Article3();
        
        cat1 = new Category1();
        cat2 = new Category2();
        cat3 = new Category3();

        fTrans.add(R.id.frgmCont,mainfragment);
        fTrans.commit();
       // chbStack = (CheckBox)findViewById(R.id.chbStack);
    }

    public void onClick(View v) {
       fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.button1:
           /*     fTrans.replace(R.id.frgmCont, cat1);
                break;*/
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.replace(R.id.frgmCont2,cat1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, cat1);
                }
                break;
            case R.id.button2:
               /* fTrans.replace(R.id.frgmCont, cat2);
                break;*/
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.replace(R.id.frgmCont2,cat2);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, cat2);
                }
            	break;
            case R.id.button3:
                /*fTrans.replace(R.id.frgmCont, cat3);
                break;*/
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.replace(R.id.frgmCont2,cat3);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, cat3);
                }
            	break;
            case R.id.button11:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat1);
                    fTrans.replace(R.id.frgmCont,art1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art1);
                }
            	break;
            case R.id.button12:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat1);
                    fTrans.replace(R.id.frgmCont,art1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art1);
                }
            	break;
            case R.id.button13:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat1);
                    fTrans.replace(R.id.frgmCont,art1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art1);
                }
            	break;
            case R.id.button14:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat1);
                    fTrans.replace(R.id.frgmCont,art1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art1);
                }
            	break;
            case R.id.button15:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat1);
                    fTrans.replace(R.id.frgmCont,art1);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art1);
                }
            	break;
            case R.id.button21:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat2);
                    fTrans.replace(R.id.frgmCont,art2);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art2);
                }
            	break;
            case R.id.button22:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat2);
                    fTrans.replace(R.id.frgmCont,art2);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art2);
                }
            	break;
            case R.id.button23:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat2);
                    fTrans.replace(R.id.frgmCont,art2);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art2);
                }
            	break;
            case R.id.button24:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat2);
                    fTrans.replace(R.id.frgmCont,art2);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art2);
                }
            	break;
            case R.id.button31:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat3);
                    fTrans.replace(R.id.frgmCont,art3);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art3);
                }
            	break;
            case R.id.button32:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat3);
                    fTrans.replace(R.id.frgmCont,art3);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art3);
                }
            	break;
            case R.id.button33:
            	if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    fTrans.remove(cat3);
                    fTrans.replace(R.id.frgmCont,art3);
                }else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fTrans.replace(R.id.frgmCont, art3);
                }
            	
          /*    
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
                }*/
            default:
                break;
        }
         fTrans.addToBackStack(null);
        fTrans.commit();
    }
}