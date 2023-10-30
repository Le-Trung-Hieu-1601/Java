import java.util.Objects;

public class Date {
 private int ngay,thang,nam;

public Date(int ngay, int thang, int nam) {
	
	this.ngay = ngay;
	this.thang = thang;
	this.nam = nam;
}

public int getNgay() {
	return ngay;
}

public void setNgay(int ngay) {
	this.ngay = ngay;
}

public int getThang() {
	return thang;
}

public void setThang(int thang) {
	this.thang = thang;
}

public int getNam() {
	return nam;
}

public void setNam(int nam) {
	this.nam = nam;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return nam == other.nam && ngay == other.ngay && thang == other.thang;
}

}
