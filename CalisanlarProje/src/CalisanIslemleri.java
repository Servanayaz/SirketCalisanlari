
import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalisanIslemleri {

    private Connection conn;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public CalisanIslemleri() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbAdi;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi ! ");
        }

        try {
            conn = DriverManager.getConnection(url, Database.kullaniciAdi, Database.parola);
        } catch (SQLException ex) {
            System.out.println("Baglanti basarili...");
        }
    }

    public boolean girisYap(String kullaniciAdi, String parola) {
        String sorgu = "Select * from adminler where username=? and password=?";

        try {
            preparedStatement = conn.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);

            ResultSet rs = (ResultSet) preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            System.out.println("SQL giris sorgusu sirasinda hata ! ");
        }
        return false;
    }

    public ArrayList<Calisan> calisanlariGetir() {

        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        try {
            statement = conn.createStatement();
            String sorgu = "select * from calisanlar";

            ResultSet rs = (ResultSet) statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String departman = rs.getString("departman");
                String maas = rs.getString("maas");

                cikti.add(new Calisan(id, ad, soyad, departman, maas));

            }
        } catch (SQLException ex) {
            System.out.println("Calisanlar tablosu getirilirken hata ! ");
            return null;
        }
        return cikti;
    }
    public void calisanEkle(String ad,String soyad,String departman,String maas){
        String sorgu="Insert Into calisanlar (ad,soyad,departman,maas) VALUES(?,?,?,?)";
        try {
            preparedStatement=conn.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, departman);
            preparedStatement.setString(4, maas);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Yeni calisan eklenirken hata ! ");
        }
    }
    
    public  void calisanGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_departman,String yeni_maas){
        String sorgu="update calisanlar set ad=? , soyad=? , departman=? , maas=? where id=?";
        try {
            preparedStatement=conn.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_departman);
            preparedStatement.setString(4, yeni_maas);
            
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Calisan guncellenirken hata ! ");
        }
    }
    public void calisanSil(int id){
        
        String sorgu="delete from calisanlar where id=?";
        
        try {
            preparedStatement=conn.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Calisan silinirken hata ! ");
        }
    }

}
