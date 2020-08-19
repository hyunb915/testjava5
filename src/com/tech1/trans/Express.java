package com.tech1.trans;

public class Express extends Trans implements Start,End{
	private int eDan;

	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis);
		this.eDan = eDan;
		// TODO 자동 생성된 생성자 스텁
	}


	@Override
	public int getCharge() {
		// TODO 자동 생성된 메소드 스텁
		return cusCnt*dis*eDan;
		
	}


	@Override
	public String getStartStation() {
		// TODO 자동 생성된 메소드 스텁
		return "서울";
	}


	@Override
	public String getEndStation() {
		// TODO 자동 생성된 메소드 스텁
		return "부산";
	}


}
