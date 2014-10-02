package com.example.popupmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);


		button1.setOnClickListener(viewClickListener);
		button2.setOnClickListener(viewClickListener1);
		button3.setOnClickListener(viewClickListener2);
    }


    OnClickListener viewClickListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showPopupMenu(v);
		}

	};
	
	private void showPopupMenu(View v) {
		PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);
		popupMenu.inflate(R.menu.popupmenu);
		popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				// TODO Auto-generated method stub
				switch (item.getItemId()) {
				case R.id.menu1:
					AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
					builder.setTitle("How I met your mother");
					builder.setMessage("With How I Met Your Mother's series finale airing in just a few days, we thought we'd take a look back at some of the things the show did differently from other sitcoms when it debuted. From far-out flashbacks to maternal mysteries, HIMYM certainly left its mark on the world of television and inspired other shows to take a page from its unconventional format.");
					builder.setPositiveButton( "ok", null);
					builder.create().show();
					return true;
				case R.id.menu2:
					AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
					builder1.setTitle("The Maze Runner");
					builder1.setMessage("This futuristic science fiction novel by James Dashner is the first in the Maze Runner Trilogy, which consists of three books and a prequel, and is published by Delacorte Press, an imprint of Random House Children's Books, a division of Random House Inc. The Maze Runner is written for kids ages 12 and older. The age range reflects readability and not necessarily content appropriateness.");
					builder1.setPositiveButton( "ok", null);
					builder1.create().show();
					return true;
				case R.id.menu3:
					AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
					builder2.setTitle("Madagaskar");
					builder2.setMessage("It’s easy to dismiss the work of DreamWorks’ animation division when held up against the heftier, instantly classic works of Pixar. But DreamWorks has found a nice niche creating solid family movies that focus more on being funny than tugging at the old heartstrings. Both Shrek movies have been laugh riots, and if they’re eclipsed by work like The Incredibles it isn’t because they aren’t great in their own way. There’s nothing wrong with a big laugh, and DreamWorks Animation is better at delivering them than anyone. They’ve proven it, by finally doing something worthwhile outside of Shrek. Madagascar is their funniest endeavor yet, on par with Disney’s accidental, wacky success The Emperor’s New Groove. ");
					builder2.setPositiveButton( "ok", null);
					builder2.create().show();
					return true;
				default:
					return false;
				}
				
			}
			
		});
		
		
	popupMenu.show();
	}
	
	OnClickListener viewClickListener1 = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showPopupMenu1(v);
		}
	};

		private void showPopupMenu1(View v) {
			// TODO Auto-generated method stub
			PopupMenu popupMenu1 = new PopupMenu(MainActivity.this, v);
			popupMenu1.inflate(R.menu.popupmenu1);
			popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					switch (item.getItemId()) {
						case R.id.menu4:
							AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
							builder.setTitle("Adele's new album");
							builder.setMessage("Since then, that understated song has helped cause a whole lot of noise. On Sunday, Adele's second album, 21, smashed Madonna's record for the longest consecutive weeks spent at the top of the album charts by a female solo artist. It also looks likely to beat the all-time record held by the Bob Marley and the Wailers compilation Legend. And her Brits performance of Someone Like You was deemed to be the highlight of the night by most critics who watched the ceremony. Adele's success isn't settling for owning the UK either – 17 European countries have had their album top spot hogged by 21, as has the US.");
							builder.setPositiveButton( "ok", null);
							builder.create().show();
							return true;
						case R.id.menu5:
							AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
							builder1.setTitle("Kanye West EP");
							builder1.setMessage("Here, Kanye raps about loyalty, respect, threesomes, and, yes, croissants with the urgency of someone being chased by a 30-ton steamroller. The song is pierced by a series of primal screams, pixelated outbursts that are only briefly able to halt the beat's heaving evil. In Kanye's hands, being a god sounds stressful as hell, something we can all relate to, and the song's apparent inspiration is a passage from the book of Psalms: I have said, Ye are gods; and all of you are children of the most High.");
							builder1.setPositiveButton( "ok", null);
							builder1.create().show();
							return true;
						case R.id.menu6:
							AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
							builder2.setTitle("The Rolling Stones");
							builder2.setMessage("Sit back and try to imagine, the world of rock and roll over the past ten or I5 years without thinking of the Rolling Stones. Just try and be sure to slip a version of 'The Impossible Dream' on the turntable as appropriate background music for your musings. Elvis may have been the catalyst, the Beatles may have brought rock into the cultural mainstream, the Who may have more realistically expressed the hopes and fears of their generations in song, Led Zeppelin may release reams of financial statistics to prove they sell more records and concert tickets; but face it, the Stones remain the essential image of rock and roll. Ian Hunter once said that a picture of Keith Richard at his most wasted was what rock and roll was about, and that's been a difficult proposition to argue with for a long time.");
							builder2.setPositiveButton( "ok", null);
							builder2.create().show();
							return true;
							default:
								return false;
					}
				}
			});
			popupMenu1.show();
		}
		
		OnClickListener viewClickListener2 = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showPopupMenu2(v);
			}

			private void showPopupMenu2(View v) {
				// TODO Auto-generated method stub
				PopupMenu popupMenu2 = new PopupMenu(MainActivity.this, v);
				popupMenu2.inflate(R.menu.popupmenu2);
				popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						// TODO Auto-generated method stub
						switch (item.getItemId()) {
							case R.id.menu7:
								AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
								builder.setTitle("Wimbledon 2014");
								builder.setMessage("FOX Sports hits another winner to confirm its place as the home of premier sporting action after securing exclusive broadcast rights (cable, satellite and terrestrial) and multi-media rights with The All England Lawn Tennis & Croquet Club (AELTC) to The Championships, Wimbledon for another six years, from 2015 – 2020 in Asia*. This adds to a stellar list of the world’s top tennis events already airing on the FOX Sports network, including the Australian Open and the French Open.");
								builder.setPositiveButton( "ok", null);
								builder.create().show();
								return true;
							case R.id.menu8:
								AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
								builder1.setTitle("Chelsea FC vs Lampard");
								builder1.setMessage("The away fans chanted his name, then – perhaps under their breath and certainly with a guilty conscience – they cursed it.Fate is funny sometimes. Frank Lampard will surely tell you that.After 13 years at Chelsea, fate put the on-loan New York City FC Designated Player on the same field as his former club, only this time in the power blue of Manchester City. After 211 goals for the Blues, the club record, fate put him in the penalty box after a vintage late run, a game-tying goal one touch away.");
								builder1.setPositiveButton( "ok", null);
								builder1.create().show();
								return true;
							case R.id.menu9:
								AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
								builder2.setTitle("League Cup 2014 Results");
								builder2.setMessage("The draw numbers for the Capital One Cup Round 4 draw. The draw for Round 4 of the Capital One Cup will take place on Wednesday 24th September live on Sky Sports immediately after the conclusion of the Tottenham Hotspur versus Nottingham Forest match. ");
								builder2.setPositiveButton( "ok", null);
								builder2.create().show();
								return true;
								default:
									return false;
						}
					}
				});
				popupMenu2.show();
			}
		};
	
}
