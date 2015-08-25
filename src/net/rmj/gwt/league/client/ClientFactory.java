package net.rmj.gwt.league.client;

import net.rmj.gwt.league.client.home.HomeView;
import net.rmj.gwt.league.client.league.LeagueView;
import net.rmj.gwt.league.client.menu.MainMenuView;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

public interface ClientFactory {

	public EventBus getEventBus();
	public PlaceController getPlaceController();
	// add any other object desired to pass on
	
	public LeagueView getLeagueView();
	public HomeView getHomeContent();
	
	public void setMenuView(MainMenuView menu);
	
	public MainMenuView getMainMenuView();
	
	
	
	
}
