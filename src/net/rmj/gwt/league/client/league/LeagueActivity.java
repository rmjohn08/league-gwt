package net.rmj.gwt.league.client.league;

import net.rmj.gwt.league.client.ClientFactory;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class LeagueActivity extends AbstractActivity 
	implements LeaguePresenter {

	ClientFactory clientFactory;
	LeagueView view;
	public LeagueActivity(Place place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
		this.view = clientFactory.getLeagueView();
		this.view.setPresenter(this);
	}
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		// TODO Auto-generated method stub
		panel.setWidget(view);
		leagueGreeting();

	}
	@Override
	public void leagueGreeting() {
		Window.alert("Greetings you can now start a new league or manage existings one...");
		
	}

}
