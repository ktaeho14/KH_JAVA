package com.poly.part01.test05;

public class Samsung_tv implements Tv{
	//�ʵ�
	private int vol;
	
	//������
	public Samsung_tv(){
		System.out.println("samsung tv�� �������ϴ�");
	}
	
	
	//getter & setter
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}





	@Override
	public int volUp() {
			setVol( getVol()+3);
			
		return getVol();
	}

	@Override
	public int volDown() {
		setVol(getVol()-3);
		return getVol();
	}

	
	public void tvClosed() {
		System.out.println("Samsung tv�� �������ϴ�.");
	}
	
	
}


