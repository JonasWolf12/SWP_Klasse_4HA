package designPatternObserver;

import java.util.ArrayList;

public class NewsAgency {
	
	private String news;
	private ArrayList<Channel> channels;
	
	public NewsAgency() {
		this.channels = new ArrayList<Channel>();
		
	}
	
	public String getNews() {
		return news;
	}

	public void addObserver(Channel channel) {
		this.channels.add(channel);
	}
	
	public void setNews(String news) {
		this.news = news;
		for(Channel c : channels) {
			c.update(news);
		}
	}
		
	
}
