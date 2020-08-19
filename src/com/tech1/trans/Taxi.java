package com.tech1.trans;

public class Taxi extends Trans{
	private int xDan;

	public Taxi(int cusCnt, int dis, int xDan) {
		super(cusCnt, dis);
		this.xDan = xDan;
		// TODO 자동 생성된 생성자 스텁
	}


	@Override
	public int getCharge() {
		// TODO 자동 생성된 메소드 스텁
		return cusCnt*dis*xDan;
		
	}


}
