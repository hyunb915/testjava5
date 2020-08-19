package com.tech1.trans;

public abstract class Trans {
	protected int cusCnt; //인원
	protected int dis; // 이동거리
	
	public Trans(int cusCnt, int dis) {
		// TODO 자동 생성된 생성자 스텁
		this.cusCnt = cusCnt;
		this.dis = dis;
		
	}
	
	public abstract int getCharge();
	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return cusCnt+ ": "+dis;
	}

}
