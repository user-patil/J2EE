package com.oto_entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ShowRoom {
	@Id
	int BranchNumber;
	String ShowRoomName;
	String ShowRoomAdd;

	public int getBranchNumber() {
		return BranchNumber;
	}

	public void setBranchNumber(int branchNumber) {
		BranchNumber = branchNumber;
	}

	public String getShowRoomName() {
		return ShowRoomName;
	}

	public void setShowRoomName(String showRoomName) {
		ShowRoomName = showRoomName;
	}

	public String getShowRoomAdd() {
		return ShowRoomAdd;
	}

	public void setShowRoomAdd(String showRoomAdd) {
		ShowRoomAdd = showRoomAdd;
	}

	public ShowRoom(int branchNumber, String showRoomName, String showRoomAdd) {
		super();
		BranchNumber = branchNumber;
		ShowRoomName = showRoomName;
		ShowRoomAdd = showRoomAdd;
	}

	@Override
	public String toString() {
		return "ShowRoom [BranchNumber=" + BranchNumber + ", ShowRoomName=" + ShowRoomName + ", ShowRoomAdd="
				+ ShowRoomAdd + "]";
	}

	public ShowRoom() {

	}

}
