package net.rmj.gwt.league.client;

import net.rmj.gwt.league.client.home.HomeView;
import net.rmj.gwt.league.client.league.LeagueView;
import net.rmj.gwt.league.client.menu.MainMenuView;

import com.google.gwt.core.client.impl.AsyncFragmentLoader.Logger;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

public class ClientFactoryImpl implements ClientFactory {
	
	private static EventBus eventBus;
	private static PlaceController placeController;
	private static LeagueView leagueView;
	private static HomeView homeView;
	
	private static MainMenuView mainMenu;
	
	@Override
	public EventBus getEventBus() {
		// TODO Auto-generated method stub
		if (eventBus == null) eventBus = new SimpleEventBus();
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		// TODO Auto-generated method stub
		if (placeController == null) placeController = new PlaceController(getEventBus());
		return placeController;
	}

	@Override
	public LeagueView getLeagueView() {
		// TODO Auto-generated method stub
		if (leagueView == null)
			leagueView = new LeagueView();
		
		return leagueView;
	}

	@Override
	public HomeView getHomeContent() {
		// TODO Auto-generated method stub
		if (homeView == null )
			homeView = new HomeView();
		
		return homeView;
	}

	@Override
	public void setMenuView(MainMenuView menu) {
		// TODO Auto-generated method stub
		mainMenu = menu;
	}

	@Override
	public MainMenuView getMainMenuView() {
		// TODO Auto-generated method stub
		if (mainMenu == null ) mainMenu =  new MainMenuView();
		return mainMenu;
	}

	

}
