package tugas10;

public class Buku {
 private int nomor;
 	private String judul;
	class Bab {
            private int noBab;
            public String getBab() {
            return "nomor buku: "+nomor+", judul buku: "+judul
			+", nomor Bab: "+noBab;
            }
	}
	private Bab bab = new Bab();
	public void setBab(int nomor,String judul,int noBab ) {
            this.nomor = nomor;
            this.judul = judul;
            bab.noBab = noBab;
	}
    public void cetak(){
	System.out.println(bab.getBab());
    }
}
