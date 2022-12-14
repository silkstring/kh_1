package kr.co.exam06;

import java.util.Arrays;

public class FoodMenu {
//	멤버 변수
	private String menu[] = new String[0];
	private int price[] = new int[0];
	
//	생성자
	public FoodMenu() {}
	
//	메뉴 출력 메서드
	public String printMenu() {
		String res = "";
		for(int i = 0; i < this.menu.length; i++) {
			res += String.format("%s\t%,d원\n", menu[i], price[i]);
		}
		return res;
	}
	
//	메뉴의 위치 찾기 메서드
	private int findIndex(String food) {
		int idx = -1;
		for(int i = 0; i < this.menu.length; i++) {
			if (food.equals(this.menu[i])) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
//	음식 찾기 메서드
	/**
	 * name 매개변수에 전달된 문자열에 해당하는 메뉴를 찾아 가격 반환하는 메서드
	 * 해당하는 메뉴가 없는 경우 -1을 반환
	 * @param food : 메뉴명
	 * @return : 메뉴에 대한 가격을 반환
	 */
	public int findMenu(String food) {
		return price[this.findIndex(food)];
	}
	
//	음식 추가 메서드
	public void addMenu(String addName, int addPrice) {
		this.menu = Arrays.copyOf(menu, menu.length + 1);
		this.price = Arrays.copyOf(price, price.length + 1);
		menu[menu.length - 1] = addName;
		price[price.length - 1] = addPrice;
	}
	
//	음식 수정 메서드
	/**
	 * name에 해당하는 메뉴를 찾아서 price 가격으로 수정을 하는 메서드
	 * name에 해당하는 메뉴를 찾아서 수정한 경우 true 반환
	 * name에 해당하는 메뉴가 없는 경우 false 반환
	 * @param food : 가격을 수정할 메뉴명
	 * @param rePrice : 수정할 가격
	 * @return 
	 * 	true : 메뉴를 찾아서 가격 수정함
	 * 	false : 메뉴가 없어서 수정 못함
	 */
	public boolean changeMenu(String food, int rePrice) {
		int idx = this.findIndex(food);
		if(idx != -1) {
			this.price[idx] = rePrice;
			return true;
		}
		return false;
	}
	
//	음식 삭제 메서드
	public boolean deleteMenu(String food) {
		int idx = this.findIndex(food);
		if (idx != -1) {
			for(int i = idx; i < this.menu.length -1; i++) {
				this.menu[i] = this.menu[i+1];
				this.menu = Arrays.copyOf(this.menu, this.menu.length - 1);
				this.price = Arrays.copyOf(this.price, this.price.length - 1);
			}
			for(int i = idx; i < this.price.length -1; i++) {
				this.price[i] = this.price[i+1];
				this.menu = Arrays.copyOf(this.menu, this.menu.length - 1);
				this.price = Arrays.copyOf(this.price, this.price.length - 1);
			}
			return true;
		}
		return false;
	}
}