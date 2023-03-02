package baitap;

public class KhaiBao {
    String hoVaTen;
    String tenLop;
    String tenKhoi;
    double diemMonVan=8;
    double diemMonToan=9;
    double diemMonAnh=10;
    String tbVan;
    String tbToan;
    String tbAnh;
    String caNam;
    String xepHang;
    public KhaiBao(){

    }
    public  KhaiBao(String t,String l,String k,double v,double to,double a){
        this.hoVaTen=t;
        this.tenLop=l;
        this.tenKhoi=k;
        this.diemMonVan=v;
        this.diemMonToan=to;
        this.diemMonAnh=a;
    }
    public KhaiBao(String ten, String lop, String khoi){
        this.hoVaTen=ten;
        this.tenLop=lop;
        this.tenKhoi=khoi;
    }
    public KhaiBao(double van,double toan,double anh){
        this.diemMonVan=van;
        this.diemMonToan=toan;
        this.diemMonAnh=anh;
    }
    public void full(){
        System.out.println("Thông tin:   "+this.hoVaTen+"-"+this.tenLop+"-" +this.tenKhoi+"-"+this.diemMonVan+"-"+this.diemMonToan+"-"+this.diemMonAnh);
    }
    public double tongDiem15(double a,double b,double c){
        this.diemMonVan=a;
        this.diemMonToan=b;
        this.diemMonAnh=c;
        return a+b+c;
    }
    public double tongDiem1t(double a,double b,double c){
        this.diemMonVan=a;
        this.diemMonToan=b;
        this.diemMonAnh=c;
        return a+b+c;
    }
    public double tongDiemHk(double a,double b,double c){
        this.diemMonVan=a;
        this.diemMonToan=b;
        this.diemMonAnh=c;
        return a+b+c;
    }
    public void caNhan(){

        this.hoVaTen="Hoàng Phi";
        this.tenLop="Xây Dựng";
        this.tbToan="8.5";
        System.out.println("Tên: "+this.hoVaTen+"    LỚp: "+this.tenLop+"     Diểm trung bình:  "+this.tbToan);

    }
    public void xepHang(){
        this.hoVaTen="Nguyễn Hoàng Phi";
        this.tenLop="Xây dựng Dân Dụng";
        this.tbToan="7.5";
        this.tbVan="8.5";
        this.tbAnh="10";
        this.caNam="8.6";
        this.xepHang="Giỏi";
        System.out.println(this.hoVaTen+"     "+this.tenLop+"    "+this.tbToan+"    "+this.tbVan+"     "+this.tbAnh+"    "+this.caNam+"     "+this.xepHang);
    }





}
