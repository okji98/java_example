package com.animal.ex;

public class Hotel {
	public class Room {
		private int roomNum;
		private String reservationPerson;

		Room(int roomNum, String reservationPerson) {
			this.roomNum = roomNum;
			this.reservationPerson = reservationPerson;
		}
	}

	public void add(int roomNum, String reservationPerson) {
		if (roomNum < 11) {
			return;
		}
	}

//	Room room = new Room();
//
//	public void show() {
//		if (roomNum < 11) {
//			System.out.println(roomNum + "번 방을 " + reservationPerson + "가 예약했습니다.");
//		} else {
//			System.out.println("저희 호텔은 10번 방까지밖에 존재하지 않습니다..!");
//		}
//	}
}
