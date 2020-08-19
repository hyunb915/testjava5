package com.tech1.trans;

public class Train extends Trans{
	private int tDan;

	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan = tDan;
		// TODO 자동 생성된 생성자 스텁
	}


	@Override
	public int getCharge() {
		// TODO 자동 생성된 메소드 스텁
		return cusCnt*dis*tDan;
		
	}

}
