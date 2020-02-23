package nhathando.com.models;

import java.text.DecimalFormat;

public class NhanVien {
	private String ho;
	private String ten;
	private int soSP;
	
	
	public NhanVien() {
		super();
	}

	public NhanVien(String ho, String ten, int soSP) {
		super();
		this.ho = ho;
		this.ten = ten;
		if(soSP<=0)
		{
			this.soSP = 0;
		}
		else
		{
			this.soSP=soSP;
		}
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoSP() {
		if(soSP<=0)
		{
			return 0;
		}
		else
		{
			return soSP;
		}
	}

	public void setSoSP(int soSP) {
		if(soSP<=0)
		{
			this.soSP = 0;
		}
		else
		{
			this.soSP=soSP;
		}
	}
	
	public double getLuong()
	{
		double luong=0;
		if(soSP>=1 && soSP <200)
		{
			luong= soSP*0.5;
		}
		else if(soSP>=200 && soSP<400)
		{
			luong= soSP*0.55;
		}
		else if(soSP>=400 && soSP<600)
		{
			luong= soSP*0.6;
		}
		else
		{
			luong= soSP*0.65;
		}
		return luong;
	}
	public String formatLuong()
	{
		DecimalFormat dcf= new DecimalFormat("#.##");
		return dcf.format(getLuong());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ho+"\t|"+ten+"\t|"+soSP+"\t|"+formatLuong();
	}
	
	public boolean lonHon(NhanVien nv2)
	{
		if(this.soSP>nv2.soSP)
		{
			return true;
		}
		else
		{	
		return false;
		}
	}
		
	

}
