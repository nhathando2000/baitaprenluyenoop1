package nhathando.com.test;

import nhathando.com.models.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		System.out.println("Họ"+"\t "+"Tên"+"\t "+"Số SP"+"\t "+"Lương");
		System.out.println("--------------------------------");
		NhanVien nv1= new NhanVien("Đỗ", "Hàn", 300);
		System.out.println(nv1);
		NhanVien nv2= new NhanVien();
		nv2.setHo("Trần");
		nv2.setTen("Long");
		nv2.setSoSP(350);
		System.out.println(nv2);
		int chenhLechSP=0;
		//Cách 1:
		if(nv1.lonHon(nv2))
		{
			chenhLechSP=nv1.getSoSP()-nv2.getSoSP();
			System.out.println("NV1 có số sản phẩm nhiều hơn NV2 và nhiều hơn "+chenhLechSP);
		}
		else
		{
			chenhLechSP=nv2.getSoSP()-nv1.getSoSP();
			System.out.println("NV2 có số sản phẩm nhiều hơn NV1 và nhiều hơn "+chenhLechSP);
		}
		//Cách 2:
		if(nv1.getSoSP()>nv2.getSoSP())
		{
			chenhLechSP=nv1.getSoSP()-nv2.getSoSP();
			System.out.println("NV1 có số sản phẩm nhiều hơn NV2 và nhiều hơn "+chenhLechSP);
		}
		else
		{
			chenhLechSP=nv2.getSoSP()-nv1.getSoSP();
			System.out.println("NV2 có số sản phẩm nhiều hơn NV1 và nhiều hơn "+chenhLechSP);
		}

	}

}
