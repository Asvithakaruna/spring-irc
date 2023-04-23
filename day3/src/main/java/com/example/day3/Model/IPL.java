package com.example.day3.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IPL {
@Id
@Column(name="playerid")
	private int playerid;
	private String playername;
	private String playercountry;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getPlayercountry() {
		return playercountry;
	}
	public void setPlayercountry(String playercountry) {
		this.playercountry = playercountry;
	}
	
}
