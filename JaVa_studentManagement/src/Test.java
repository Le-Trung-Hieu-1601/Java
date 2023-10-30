
public class Test {
public static void main(String[] args) {
	Date ngay1= new Date(15,2,2020);
	Date ngay2= new Date(15,2,2001);
	Date ngay3= new Date(15,2,2020);
	Lop lop1 =new Lop("Dh01","khoa cong nghe thong tin");
	Lop lop2 =new Lop("Dh02","an toan thong tin");
	Lop lop3 =new Lop("Dh03","khoa hoc may tinh ");
	Student sv1 = new Student("001","le Trung Hieu",ngay1,9.0,lop1);
	Student sv2 = new Student("002","le Trung Hieu",ngay2,4.0,lop2);
	Student sv3 = new Student("003","le Trung Hieu",ngay3,9.0,lop3);
	System.out.println(sv1.layTenKhoa());
	System.out.println(sv2.kiemtra());
	System.out.println(sv1.kiemtraNgaySinh(sv3));
	System.out.println(sv1.kiemtraNgaySinh(sv2));
}
}
